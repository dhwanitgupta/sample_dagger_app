package lambda.dataTypes;

import com.google.gson.JsonElement;
import lombok.Getter;
import lombok.Setter;

import java.io.InputStream;

/**
 * Created by dhwanit on 19/11/17.
 */
public class DomainInputStream {

    @Getter @Setter
    private InputStream inputStream;
    @Getter @Setter
    private JsonElement jsonPayload;
}
