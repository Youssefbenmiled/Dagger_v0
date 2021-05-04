package com.example.dagger;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;


import com.example.dagger.injection.Alimentation;
import com.example.dagger.injection.Capteur;
import com.example.dagger.injection.DaggerIRobotComponent;
import com.example.dagger.injection.Robot;
import com.example.dagger.injection.IRobotComponent;

public class MainActivity extends AppCompatActivity {
     private Robot robot;
     private Capteur capteur;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IRobotComponent component= DaggerIRobotComponent.create();
        robot =component.getRobot();
        capteur=new Capteur("cnew","20°");
        robot.setCapteur(capteur);
        robot.deplacer("injectMethod",2.63,4.5);
        Log.d("TYPE",robot.getCapteur().getType());

    }



    public void injectMethod(){
        IRobotComponent component= DaggerIRobotComponent.create();
        robot =component.getRobot();

        capteur=new Capteur("cnew","20°");
        robot.setCapteur(capteur);
    }





    public void classicMethod(){
        Capteur C =new Capteur("typeClassic","chaleurClassic");
        Alimentation A =new Alimentation(12);

        robot=new Robot(C,A);
        robot.deplacer("classicMethod",2.63,4.5);
    }


}