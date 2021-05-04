package com.example.dagger.injection;

import android.util.Log;

import javax.inject.Inject;

public class Robot {
    private Capteur capteur;
    private Alimentation alimentatnion;
    @Inject
    public Robot(Capteur capteur, Alimentation alimentatnion) {
        this.capteur = capteur;
        this.alimentatnion = alimentatnion;
    }

    public void deplacer(String type,double x,double y){
        Log.d("Robot",type+" Déplacement dans le sens :"+"("+x+","+y+")");
    }

    public void setCapteur(Capteur c){
        this.capteur=c;
    }

    public Capteur getCapteur(){
        return this.capteur;
    }


    public void setAlimentation(Alimentation A){
        this.alimentatnion=A;
    }

    public Alimentation getAlimentation(){
        return this.alimentatnion;
    }

}
