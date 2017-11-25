package core.datatypes;

import com.google.gson.JsonObject;
import lambda.Context;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by dhwanit on 25/11/17.
 */

public abstract class Job {

    @Getter
    private final InputStream requestInputStream;
    @Getter
    private final OutputStream responseOutputStream;
    @Getter
    private final Context context;

    @Setter @Getter
    private Request request;
    @Setter @Getter
    private Response response;

    @Setter @Getter
    private boolean hasException = false;
    @Setter @Getter
    private Exception exception;

    @Setter @Getter
    private String operationName;

    public Job(InputStream inputStream, OutputStream outputStream, Context context) {
        this.requestInputStream = inputStream;
        this.responseOutputStream = outputStream;
        this.context = context;
    }

}
