package core.handlers.impls;

import com.google.gson.JsonObject;
import core.configs.OperationToDataTypeMap;
import core.datatypes.Job;
import core.datatypes.Request;
import core.datatypes.Response;
import core.handlers.DomainMapper;
import core.handlers.Handler;
import core.utils.JsonUtils;

import javax.inject.Inject;

/**
 * Created by dhwanit on 25/11/17.
 */
public class JsonDataTypeTransformer implements DomainMapper {

    private JsonUtils jsonUtils;

    @Inject
    public JsonDataTypeTransformer(JsonUtils jsonUtils) {
        this.jsonUtils = jsonUtils;
    }

    public Request getRequest(JsonObject jsonObject) {
        return jsonUtils.toObject(jsonObject.get("payload").getAsJsonObject(), OperationToDataTypeMap.valueOf(getOperationName(jsonObject)).getRequestType());
    }

    public String getResponse(Response response) {
        return jsonUtils.toJson(response);
    }

    public String getOperationName(JsonObject jsonObject) {
        return jsonObject.get("operation").getAsString();
    }
}
