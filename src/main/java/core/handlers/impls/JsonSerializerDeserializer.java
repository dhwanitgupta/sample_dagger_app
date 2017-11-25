package core.handlers.impls;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import core.configs.OperationToDataTypeMap;
import core.datatypes.Job;
import core.handlers.DomainMapper;
import core.handlers.Handler;
import core.utils.JsonUtils;

import javax.inject.Inject;
import java.io.IOException;

/**
 * Created by dhwanit on 25/11/17.
 */
public class JsonSerializerDeserializer implements Handler {

    private JsonUtils jsonUtils;
    private DomainMapper jsonDataTypeTransformer;

    @Inject
    public JsonSerializerDeserializer(JsonUtils jsonUtils, DomainMapper jsonDataTypeTransformer) {
        this.jsonUtils = jsonUtils;
        this.jsonDataTypeTransformer = jsonDataTypeTransformer;
    }

    public void before(Job job) {
        JsonObject jsonObject  = jsonUtils.streamToJson(job.getRequestInputStream());
        job.setRequest(jsonDataTypeTransformer.getRequest(jsonObject));

        job.setOperationName(jsonDataTypeTransformer.getOperationName(jsonObject));
    }

    public void after(Job job) {
        try {
            job.getResponseOutputStream().write((jsonDataTypeTransformer.getResponse(job.getResponse())).getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
