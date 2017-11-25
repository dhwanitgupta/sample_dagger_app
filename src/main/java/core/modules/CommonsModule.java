package core.modules;

import com.google.gson.Gson;
import core.utils.JsonUtils;
import dagger.Module;
import dagger.Provides;

import javax.inject.Singleton;

/**
 * Created by dhwanit on 25/11/17.
 */
@Module
public class CommonsModule {

    @Provides @Singleton
    JsonUtils provideJsonUtils(Gson gson) {
        return new JsonUtils(gson);
    }

    @Singleton @Provides
    Gson provideGson() {
        return new Gson();
    }
}
