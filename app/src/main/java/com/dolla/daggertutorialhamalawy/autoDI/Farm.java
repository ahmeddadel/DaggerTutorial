package com.dolla.daggertutorialhamalawy.autoDI;

import android.util.Log;

import javax.inject.Inject;

/**
 * @author adell
 * @created 25/06/2023 - 9:27 AM
 * @project DaggerTutorial
 */

public class Farm {

    @Inject
    // this annotation is used to tell Dagger that this is a dependency that needs to be injected
    public Farm() { // constructor injection
        Log.d("Dola", "Farm created");
    }

    public String getBeans() {
        return "Beans";
    }
}