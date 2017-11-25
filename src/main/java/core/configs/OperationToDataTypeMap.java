package core.configs;

import core.api.Api;
import core.api.impls.CreateUser;
import core.api.impls.GetUser;
import core.datatypes.Request;
import core.datatypes.Response;
import core.datatypes.impl.CreateUserRequest;
import core.datatypes.impl.GetUserRequest;
import core.datatypes.impl.GetUserResponse;

/**
 * Created by dhwanit on 25/11/17.
 */
public enum OperationToDataTypeMap {

    GetUser(GetUserRequest.class, GetUserResponse.class, GetUser.class),
    CreateUser(CreateUserRequest.class, GetUserResponse.class, CreateUser.class);

    private final Class<? extends Request> request;
    private final Class<? extends Response> response;
    private final Class<? extends Api> api;

    private OperationToDataTypeMap(Class<? extends Request> request, Class<? extends Response> response, Class<? extends Api> api) {
        this.request = request;
        this.response = response;
        this.api = api;
    }

    public Class<? extends Request> getRequestType() {
        return request;
    }

    public Class<? extends Response> getResponseType() {
        return response;
    }

    public Class<? extends Api> getApi() {
        return api;
    }
}
