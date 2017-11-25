package core.utils;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import javax.inject.Inject;
import java.io.IOException;
import java.io.InputStream;

import com.google.gson.JsonObject;
import lambda.dataTypes.GetUserRequest;
import org.apache.commons.io.IOUtils;

/**
 * Created by dhwanit on 25/11/17.
 */
public class JsonUtils {

    private Gson gson;

    @Inject
    public JsonUtils(Gson gson) {
        this.gson = gson;
    }

    public JsonObject streamToJson(InputStream stream) {
        try {
            return gson.fromJson(IOUtils.toString(stream), JsonElement.class).getAsJsonObject();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public String toJson(Object object) {
        return gson.toJson(object);
    }

    public<T> T toObject(JsonObject jsonObject, Class<T> clazz) {
        return gson.fromJson(jsonObject, clazz);
    }

}
