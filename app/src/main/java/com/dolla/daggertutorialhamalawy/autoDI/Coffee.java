package com.dolla.daggertutorialhamalawy.autoDI;

import android.util.Log;

import javax.inject.Inject;

/**
 * @author adell
 * @created 25/06/2023 - 9:28 AM
 * @project DaggerTutorial
 */

public class Coffee {

//    private Farm farm;
//    private River river;
//
//    @Inject // This annotation tells Dagger that this constructor is the one to be used when creating instances of this class.
//    public Coffee(Farm farm, River river) { // constructor injection
//        this.farm = farm;
//        this.river = river;
//    }


//    ====================================================================================================


//    @Inject
//    Farm farm; // field injection (must be public and not private)
//    @Inject
//    River river; // field injection (must be public and not private)
//
//    @Inject
//    // This annotation tells Dagger that this constructor is the one to be used when creating instances of this class.
//    public Coffee() {
//    }
//
//    public String getCoffeeCup() {
//        return farm.getBeans() + " + " + river.getWater();
//    }


//    ====================================================================================================


//    @Inject
//    Farm farm; // field injection (must be public and not private)
//    @Inject
//    River river; // field injection (must be public and not private)
//
//    @Inject
//    // This annotation tells Dagger that this constructor is the one to be used when creating instances of this class.
//    public Coffee() {
//    }
//
//    @Inject
//    public void connectElectricity() { // method injection (dagger will call this method after creating the object)
//        Log.d("Dola", "Electricity connected");
//    }
//
//    public String getCoffeeCup() {
//        return farm.getBeans() + " + " + river.getWater();
//    }


//    ====================================================================================================


//    @Inject
//    Farm farm; // field injection (must be public and not private)
//
//    River river;
//
//    @Inject
//    // This annotation tells Dagger that this constructor is the one to be used when creating instances of this class.
//    public Coffee(River river) { // constructor injection
//        this.river = river;
//    }
//
//    @Inject
//    public void connectElectricity() { // method injection (dagger will call this method after creating the object)
//        Log.d("Dola", "Electricity connected");
//    }
//
//    public String getCoffeeCup() {
//        return farm.getBeans() + " + " + river.getWater();
//    }


//    ====================================================================================================


//    @Inject
//    Farm farm; // field injection (must be public and not private)
//
//    LibraryClosedClass libraryClosedClass;
//
//    int sugarSpoons;
//
//    @Inject
//    // This annotation tells Dagger that this constructor is the one to be used when creating instances of this class.
//    public Coffee(LibraryClosedClass libraryClosedClass, int sugarSpoons) { // constructor injection
//        this.libraryClosedClass = libraryClosedClass;
//        this.sugarSpoons = sugarSpoons;
//    }
//
//    @Inject
//    public void connectElectricity() { // method injection (dagger will call this method after creating the object)
//        Log.d("Dola", "Electricity connected");
//    }
//
//    public String getCoffeeCup() {
//        return farm.getBeans() + " + " + libraryClosedClass.getClosedClass() + " + " + "Sugar Spoons: " + sugarSpoons;
//    }


    @Inject
    Farm farm; // field injection (must be public and not private)

    LibraryClosedClass libraryClosedClass;

    int sugarSpoons;
    int milkSpoons;

    @Inject
    // This annotation tells Dagger that this constructor is the one to be used when creating instances of this class.
    public Coffee(LibraryClosedClass libraryClosedClass, @Sugar int sugarSpoons, @Milk int milkSpoons) { // constructor injection
        this.libraryClosedClass = libraryClosedClass;
        this.sugarSpoons = sugarSpoons;
        this.milkSpoons = milkSpoons;
    }

    @Inject
    public void connectElectricity() { // method injection (dagger will call this method after creating the object)
        Log.d("Dola", "Electricity connected");
    }

    public String getCoffeeCup() {
        return farm.getBeans() + " + " + libraryClosedClass.getClosedClass() + " + " + "Sugar Spoons: " + sugarSpoons + " + " + "Milk Spoons: " + milkSpoons;
    }
}