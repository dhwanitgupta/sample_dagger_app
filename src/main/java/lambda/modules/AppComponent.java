package lambda.modules;

import dagger.Component;
import lambda.Container;

import javax.inject.Singleton;

/**
 * Created by dhwanit on 19/11/17.
 */
@Singleton
@Component(modules = { DefaultChainModule.class })
public interface AppComponent {

    Container provideContainer();
}
