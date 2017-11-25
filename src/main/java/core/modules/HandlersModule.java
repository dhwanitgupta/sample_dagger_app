package core.modules;

import com.google.gson.Gson;
import core.handlers.impls.ApiHandler;
import core.handlers.impls.ContextInjector;
import core.handlers.impls.JsonDataTypeTransformer;
import core.handlers.impls.JsonSerializerDeserializer;
import core.initializers.impls.HandlersChain;
import core.utils.JsonUtils;
import dagger.Module;
import dagger.Provides;
import lambda.Context;

import javax.inject.Singleton;

/**
 * Created by dhwanit on 25/11/17.
 */

@Module
public class HandlersModule {

    @Provides @Singleton
    HandlersChain provideDefaultHandlersChain(JsonSerializerDeserializer jsonSerializerDeserializer,
                                              ContextInjector contextInjector, ApiHandler apiHandler) {
        HandlersChain handlersChain = new HandlersChain();
        handlersChain.addHandler(jsonSerializerDeserializer);
        handlersChain.addHandler(contextInjector);
        handlersChain.addHandler(apiHandler);
        return handlersChain;
    }

    @Singleton @Provides
    JsonSerializerDeserializer provideJsonSerializerDeserializer(JsonUtils jsonUtils, JsonDataTypeTransformer domainDataTypeTransformer) {
        return new JsonSerializerDeserializer(jsonUtils, domainDataTypeTransformer);
    }

    @Singleton @Provides
    ApiHandler provideApiHandler() {
        return new ApiHandler();
    }

    @Singleton @Provides
    ContextInjector provideContextInjector() {
        return new ContextInjector();
    }

    @Singleton @Provides
    JsonDataTypeTransformer provideDomainDataTypeTransformer(JsonUtils jsonUtils) {
        return new JsonDataTypeTransformer(jsonUtils);
    }
}
