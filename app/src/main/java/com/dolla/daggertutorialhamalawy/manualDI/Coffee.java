package com.dolla.daggertutorialhamalawy.manualDI;

/**
 * @author adell
 * @created 25/06/2023 - 9:28 AM
 * @project DaggerTutorial
 */

public class Coffee {

    private final Farm farm;
    private final River river;

    public Coffee(Farm farm, River river) {
        this.farm = farm;
        this.river = river;
    }
}