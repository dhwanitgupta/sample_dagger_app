package modules;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import models.User;

@Module
public class UserModule {

    @Provides
    @Singleton
    User providesUser() {
        return new User("Dhwanit", "Gupta");
    }
}
