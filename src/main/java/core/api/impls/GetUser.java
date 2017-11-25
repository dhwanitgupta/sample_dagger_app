package core.api.impls;

import core.api.Api;
import core.datatypes.Request;
import core.datatypes.Response;
import core.datatypes.impl.GetUserRequest;
import core.datatypes.impl.GetUserResponse;
import lambda.Context;

/**
 * Created by dhwanit on 25/11/17.
 */
public class GetUser implements Api<GetUserRequest, GetUserResponse> {
    public GetUserResponse enact(GetUserRequest request, Context context) {
        return new GetUserResponse("Dhwanit Gupta", request.getId(),true);
    }
}
