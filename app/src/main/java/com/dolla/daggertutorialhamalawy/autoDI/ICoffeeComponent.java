package com.dolla.daggertutorialhamalawy.autoDI;

import com.dolla.daggertutorialhamalawy.MainActivity;

import dagger.BindsInstance;
import dagger.Component;

/**
 * @author adell
 * @created 03/07/2023 - 4:12 PM
 * @project DaggerTutorialHamalawy
 */

//@Component // This annotation tells Dagger that this interface is a Dagger component
@Component(modules = {CoffeeModule.class})
// This annotation tells Dagger that this interface is a Dagger component
public interface ICoffeeComponent {

    Coffee getCoffee(); // this the method that dagger will implement it for us.

    void inject(MainActivity mainActivity); // this the method that dagger will implement it for us.

    @Component.Builder // this annotation is used to tell Dagger that this interface is a builder for the component
    interface Builder { // this interface is used to build the component

        @BindsInstance
            // this annotation is used to tell Dagger that this method is used to provide data to the component
        Builder sugarSpoons(@Sugar int sugarSpoons); // this method is used to provide the data that dagger needs of type int

        @BindsInstance
            // this annotation is used to tell Dagger that this method is used to provide data to the component
        Builder milkScoops(@Milk int milkScoops); // this method is used to provide the data that dagger needs of type int

        ICoffeeComponent build(); // this method is used to build the component
    }
}