package lambda;

import lambda.handlers.ApiHandler;
import lambda.handlers.ContextBuilder;
import lambda.handlers.ExceptionHandler;
import lambda.handlers.SerializerDeserializer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.inject.Inject;

/**
 * Created by dhwanit on 19/11/17.
 */

@Getter
public class Container {

    private SerializerDeserializer serializerDeserializer;

    @Inject
    public Container(SerializerDeserializer serializerDeserializer) {
        this.serializerDeserializer = serializerDeserializer;
    }
}
