package core.handlers.impls;

import core.api.Api;
import core.configs.OperationToDataTypeMap;
import core.datatypes.Job;
import core.handlers.Handler;
import lambda.Context;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by dhwanit on 25/11/17.
 */
public class ApiHandler implements Handler {
    public void before(Job job) {
        Class<? extends Api> apiClass = OperationToDataTypeMap.valueOf(job.getOperationName()).getApi();
        try {
            Constructor<? extends Api> constructor = apiClass.getConstructor();
            Api api = constructor.newInstance();
            job.setResponse(api.enact(job.getRequest(), job.getContext()));
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public void after(Job job) {

    }
}
