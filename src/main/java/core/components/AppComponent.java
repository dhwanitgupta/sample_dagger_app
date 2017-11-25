package core.components;

import core.initializers.impls.HandlersChain;
import core.modules.CommonsModule;
import core.modules.HandlersModule;
import core.utils.JsonUtils;
import dagger.Component;
import lambda.modules.DefaultChainModule;

import javax.inject.Singleton;

/**
 * Created by dhwanit on 25/11/17.
 */

@Singleton
@Component(modules = { HandlersModule.class, CommonsModule.class})
public interface AppComponent {
    public HandlersChain provideDefaultHandlersChain();

    public JsonUtils provideJsonUtils();
}
