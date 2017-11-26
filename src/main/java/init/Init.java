package init;

import com.google.gson.JsonObject;
import core.components.AppComponent;
import core.components.DaggerAppComponent;
import core.datatypes.Job;
import core.datatypes.impl.ApiJob;

import core.initializers.impls.HandlersChain;
import lambda.Context;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/**
 * Created by dhwanit on 18/11/17.
 */
public class Init {


    private static AppComponent component = DaggerAppComponent.builder().build();
    private static final HandlersChain handlersChain = component.provideDefaultHandlersChain();


    public static void main(String[] args) {
        handlersChain.execute(buildCreateJob());
        handlersChain.execute(buildJob());
    }

    private static Job buildCreateJob() {
        JsonObject jsonObject = new JsonObject();
        JsonObject payload = new JsonObject();
        payload.addProperty("userName", "Dhwanit Gupta");
        payload.addProperty("phoneNumber", "9642745558");

        jsonObject.addProperty("operation", "CreateUser");
        jsonObject.add("payload", payload);
        return new ApiJob(new ByteArrayInputStream(jsonObject.toString().getBytes()), new ByteArrayOutputStream(), new Context());
    }

    private static Job buildJob() {
        return new ApiJob(createInput("Dhwanit"), new ByteArrayOutputStream(), new Context());
    }

    private static InputStream createInput(String name) {
        JsonObject jsonObject = new JsonObject();
        JsonObject payload = new JsonObject();
        payload.addProperty("id", "123");
        jsonObject.addProperty("operation", "GetUser");
        jsonObject.add("payload", payload);


        return new ByteArrayInputStream(jsonObject.toString().getBytes());
    }
}
