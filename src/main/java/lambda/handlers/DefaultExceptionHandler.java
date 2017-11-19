package lambda.handlers;

import lambda.context.UsecaseContext;
import lambda.dataTypes.ApiRequest;
import lambda.dataTypes.ApiResponse;
import lambda.dataTypes.ExceptionApiResponse;

import javax.inject.Inject;

/**
 * Created by dhwanit on 19/11/17.
 */
public class DefaultExceptionHandler implements ExceptionHandler {

    private ApiHandler apiHandler;

    @Inject
    public DefaultExceptionHandler(ApiHandler apiHandler) {
        this.apiHandler = apiHandler;
    }

    public ApiResponse execute(ApiRequest apiRequest, UsecaseContext usecaseContext) {
        try {
            return apiHandler.execute(apiRequest, usecaseContext);
        } catch (Exception e) {
            return new ExceptionApiResponse();
        }
    }
}
