package com.dolla.daggertutorialhamalawy.autoDI;

import android.util.Log;

/**
 * @author adell
 * @created 03/07/2023 - 5:25 PM
 * @project DaggerTutorialHamalawy
 */

public class LibraryClosedClass { // this class is not open for modification

    public LibraryClosedClass() {
        Log.d("Dola", "LibraryClosedClass created");
    }

    public String getClosedClass() {
        return " Closed class";
    }

}