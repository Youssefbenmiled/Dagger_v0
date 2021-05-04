package com.example.dagger.injection;

import javax.inject.Inject;


public class Capteur {
    private String chaleur;
    private String type;
    @Inject
    public Capteur() {

    }

    public Capteur(String type,String chaleur) {
        this.chaleur=chaleur;
        this.type=type;
    }

    public String getChaleur() {
        return chaleur;
    }

    public String getType() {
        return type;
    }
}
