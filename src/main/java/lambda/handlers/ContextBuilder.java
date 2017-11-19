package lambda.handlers;

import lambda.Context;
import lambda.dataTypes.ApiRequest;
import lambda.dataTypes.ApiResponse;

/**
 * Created by dhwanit on 19/11/17.
 */
public interface ContextBuilder {
    public ApiResponse execute(ApiRequest apiRequest, Context context);
}
