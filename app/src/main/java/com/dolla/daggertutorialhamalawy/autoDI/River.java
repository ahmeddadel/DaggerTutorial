package com.dolla.daggertutorialhamalawy.autoDI;

import android.util.Log;

import javax.inject.Inject;

/**
 * @author adell
 * @created 25/06/2023 - 9:27 AM
 * @project DaggerTutorial
 */

public class River {

    @Inject
    // this annotation is used to tell Dagger that this is a dependency that needs to be injected
    public River() { // constructor injection
        Log.d("Dola", "River created");
    }

    public String getWater() {
        return "Water";
    }
}