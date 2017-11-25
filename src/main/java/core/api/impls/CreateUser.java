package core.api.impls;

import core.api.Api;
import core.datatypes.impl.CreateUserRequest;
import core.datatypes.impl.GetUserRequest;
import core.datatypes.impl.GetUserResponse;
import lambda.Context;

/**
 * Created by dhwanit on 25/11/17.
 */
public class CreateUser implements Api<CreateUserRequest, GetUserResponse> {
    public GetUserResponse enact(CreateUserRequest request, Context context) {
        System.out.println("Creating User with userName " + request.getUserName() + " and phoneNumber " + request.getPhoneNumber());
        return new GetUserResponse(request.getUserName(), "420", false);
    }
}
