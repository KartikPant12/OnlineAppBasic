package com.codewithkp.myapplication;

import android.app.Application;

import com.parse.Parse;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("RAHsd9IjWEtm3lhFoBD8HYr1S8W53mQVnpSXPNek")
                // if defined
                .clientKey("CWu5kPDExPtd3kIKlhI1mnnsDXA6ZIJ7ucjKCEdC")
                .server("https://parseapi.back4app.com/")
                .build()
        );
    }
}
