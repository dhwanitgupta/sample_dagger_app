package lambda.handlers;

import com.google.gson.Gson;
import lambda.context.UsecaseContext;
import lambda.dataTypes.ApiRequest;
import lambda.dataTypes.ApiResponse;
import lambda.dataTypes.GetUserRequest;
import lambda.dataTypes.GetUserResponse;

/**
 * Created by dhwanit on 19/11/17.
 */
public class DefaultApiHandler implements ApiHandler {
    public ApiResponse execute(ApiRequest apiRequest, UsecaseContext usecaseContext) throws Exception {
        System.out.println(new Gson().toJson((GetUserRequest)apiRequest));
        return new GetUserResponse("Dhwanit");
    }
}
