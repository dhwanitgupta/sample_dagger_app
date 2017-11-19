package lambda;

import com.google.gson.Gson;
import lambda.dataTypes.ApiResponse;
import lambda.dataTypes.DomainInputStream;
import lambda.dataTypes.DomainOutputStream;
import lambda.modules.AppComponent;
import lambda.modules.DaggerAppComponent;


import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by dhwanit on 19/11/17.
 */
public class RequestHandler {

    private static final AppComponent appComponent = DaggerAppComponent.create();
    private static final Container container = appComponent.provideContainer();;

    public void requestHandler(InputStream inputStream, OutputStream outputStream, Context context) {

        DomainInputStream domainInputStream = new DomainInputStream();
        domainInputStream.setInputStream(inputStream);

        DomainOutputStream domainOutputStream = new DomainOutputStream();
        domainOutputStream.setOutputStream(outputStream);

        ApiResponse apiResponse = container.getSerializerDeserializer().execute(domainInputStream, context);

        //System.out.println("Response " + new Gson().toJson(apiResponse));
    }
}
