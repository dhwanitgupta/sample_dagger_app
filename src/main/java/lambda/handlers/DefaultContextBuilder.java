package lambda.handlers;

import lambda.Context;
import lambda.context.UsecaseContext;
import lambda.dataTypes.ApiRequest;
import lambda.dataTypes.ApiResponse;

import javax.inject.Inject;

/**
 * Created by dhwanit on 19/11/17.
 */
public class DefaultContextBuilder implements ContextBuilder {

    private ExceptionHandler exceptionHandler;

    @Inject
    public DefaultContextBuilder(ExceptionHandler exceptionHandler) {
        this.exceptionHandler = exceptionHandler;
    }

    public ApiResponse execute(ApiRequest apiRequest, Context context) {
        return exceptionHandler.execute(apiRequest, new UsecaseContext());
    }
}
