package com.example.dagger.injection;

import javax.inject.Inject;

public class Alimentation {
    private int volt;
    @Inject
    public Alimentation() {
    }
    public Alimentation(int volt) {
        this.volt=volt;
    }
}
