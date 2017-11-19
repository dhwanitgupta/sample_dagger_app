package lambda.handlers;

import lambda.Context;
import lambda.dataTypes.ApiResponse;
import lambda.dataTypes.DomainInputStream;

/**
 * Created by dhwanit on 19/11/17.
 */
public interface SerializerDeserializer {
    public ApiResponse execute(DomainInputStream request, Context context);
}
