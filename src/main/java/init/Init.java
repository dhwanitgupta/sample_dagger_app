package init;

import com.google.gson.JsonObject;
import lambda.Context;
import lambda.RequestHandler;
import models.User;
import modules.MyComponent;
import modules.DaggerMyComponent;

import service.BackendService;

import javax.inject.Inject;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;

/**
 * Created by dhwanit on 18/11/17.
 */
public class Init {



//    @Inject
//    BackendService backendService; //
//
//    @Inject
//    User user;
//
//    private MyComponent component;
//
//    public void testing() {
//        System.out.println("User " + user);
//    }

    public static void main(String[] args) {
//        MyComponent component = DaggerMyComponent.builder().build();
//        BackendService createBackendService = component.provideBackendService();
//        component.inject(createBackendService);
//        boolean callServer = createBackendService.callServer();
//        if (callServer) {
//            System.out.println("Server call was successful. ");
//        } else {
//            System.out.println("Server call failed. ");
//        }
        //new Init().testing();

        new RequestHandler().requestHandler(createInput("Dhwanit"), new ByteArrayOutputStream(), new Context());
        new RequestHandler().requestHandler(createInput("Gupta"), new ByteArrayOutputStream(), new Context());
    }

    private static InputStream createInput(String name) {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("apiName", "GetUser");
        jsonObject.addProperty("name", name);

        return new ByteArrayInputStream(jsonObject.toString().getBytes());
    }
}
