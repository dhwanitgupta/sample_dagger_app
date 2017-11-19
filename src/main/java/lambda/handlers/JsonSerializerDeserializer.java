package lambda.handlers;

import com.google.gson.Gson;
import lambda.Context;
import lambda.dataTypes.ApiRequest;
import lambda.dataTypes.ApiResponse;
import lambda.dataTypes.DomainInputStream;
import lambda.dataTypes.GetUserRequest;
import org.apache.commons.io.IOUtils;

import javax.inject.Inject;
import java.io.IOException;

/**
 * Created by dhwanit on 19/11/17.
 */
public class JsonSerializerDeserializer implements SerializerDeserializer {

    private ContextBuilder contextBuilder;
    private Gson gson;

    @Inject
    public JsonSerializerDeserializer(ContextBuilder contextBuilder, Gson gson) {
        this.contextBuilder = contextBuilder;
        this.gson = gson;
        System.out.println("Initializing Json Serializer");
    }

    public ApiResponse execute(DomainInputStream domainInputStream, Context context) {

        ApiRequest apiRequest = null;
        try {
            apiRequest = gson.fromJson(IOUtils.toString(domainInputStream.getInputStream()), GetUserRequest.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        ApiResponse apiResponse = contextBuilder.execute(apiRequest, context);
        return apiResponse;
    }
}
