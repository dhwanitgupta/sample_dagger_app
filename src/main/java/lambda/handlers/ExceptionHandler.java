package lambda.handlers;

import lambda.context.UsecaseContext;
import lambda.dataTypes.ApiRequest;
import lambda.dataTypes.ApiResponse;

/**
 * Created by dhwanit on 19/11/17.
 */
public interface ExceptionHandler {

    public ApiResponse execute(ApiRequest apiRequest, UsecaseContext usecaseContext);
}
