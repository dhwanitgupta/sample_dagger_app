package modules;

/**
 * Created by dhwanit on 18/11/17.
 */
import init.Init;
import dagger.Component;
import service.BackendService;

import javax.inject.Singleton;

@Singleton
@Component(modules = { UserModule.class, BackEndServiceModule.class })
public interface MyComponent {

    // provide the dependency for dependent components
    // (not needed for single-component setups)
    BackendService provideBackendService();

    // allow to inject into our Main class
    // method name not important
    void inject(BackendService backendService);
}
