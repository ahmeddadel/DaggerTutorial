package com.dolla.daggertutorialhamalawy.autoDI;

import dagger.Module;
import dagger.Provides;

/**
 * @author adell
 * @created 03/07/2023 - 5:38 PM
 * @project DaggerTutorialHamalawy
 */

@Module // This annotation tells Dagger that this class is a Dagger module
public class CoffeeModule {

//    int sugarSpoons; // when dagger need any data of type int, it will use this variable
//
//    public CoffeeModule(int sugarSpoons) {
//        this.sugarSpoons = sugarSpoons;
//    }

    @Provides
        // This annotation tells Dagger that this method is the one to be used when creating instances of this class.
    LibraryClosedClass provideLibraryClosedClass() {
        return new LibraryClosedClass();
    }

//    @Provides
//        // This annotation tells Dagger that this method is the one to be used when creating instances of this class.
//    int provideSugarSpoons() { // this method is used to provide the data that dagger needs of type int
//        return sugarSpoons;
//    }

}