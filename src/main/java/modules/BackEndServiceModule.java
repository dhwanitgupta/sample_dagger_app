package modules;

/**
 * Created by dhwanit on 18/11/17.
 */
import dagger.Module;
import dagger.Provides;
import service.BackendService;

import javax.inject.Named;
import javax.inject.Singleton;

@Module
public class BackEndServiceModule {

    @Provides
    @Singleton
    BackendService provideBackendService(@Named("serverUrl") String serverUrl) {
        return new BackendService(serverUrl);
    }

    @Provides
    @Named("serverUrl")
    String provideServerUrl() {
        return "http://www.vogella.com";
    }

    @Provides
    @Named("anotherUrl")
    String provideAnotherUrl() {
        return "http://www.google.com";
    }

}
