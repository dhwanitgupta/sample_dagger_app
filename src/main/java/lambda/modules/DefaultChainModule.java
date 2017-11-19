package lambda.modules;

import com.google.gson.Gson;
import dagger.Module;
import dagger.Provides;
import lambda.Container;
import lambda.Context;
import lambda.handlers.*;
import service.BackendService;

import javax.inject.Named;
import javax.inject.Singleton;

/**
 * Created by dhwanit on 19/11/17.
 */
@Module
public class DefaultChainModule {

    @Provides @Singleton
    ApiHandler provideApiHandler() {
        return new DefaultApiHandler();
    }

    @Provides @Singleton
    ContextBuilder provideContextBuilder(ExceptionHandler exceptionHandler) {
        return new DefaultContextBuilder(exceptionHandler);
    }

    @Provides @Singleton
    ExceptionHandler provideExceptionHandler(ApiHandler apiHandler) {
        return new DefaultExceptionHandler(apiHandler);
    }

    @Singleton @Provides
    SerializerDeserializer provideSerializerDeserializer(ContextBuilder contextBuilder, Gson gson) {
        return new JsonSerializerDeserializer(contextBuilder, gson);
    }

    @Singleton @Provides
    Gson provideGson(){
        return new Gson();
    }

    @Provides @Singleton
    Container provideContainer(SerializerDeserializer serializerDeserializer) {
        return new Container(serializerDeserializer);
    }
}
