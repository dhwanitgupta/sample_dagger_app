package core.handlers;

import com.google.gson.JsonObject;
import core.datatypes.Request;
import core.datatypes.Response;

/**
 * Created by dhwanit on 25/11/17.
 */
public interface DomainMapper {

    public Request getRequest(JsonObject jsonObject);
    public String getResponse(Response response);
    public String getOperationName(JsonObject jsonObject);
}
