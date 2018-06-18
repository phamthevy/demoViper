package com.example.vypt.demoviper.login;

import android.app.Activity;
import android.content.Intent;

import com.example.vypt.demoviper.home.HomeActivity;

public class LoginRoute implements LoginContracts.Router {

    private Activity activity;

    public LoginRoute(Activity activity){
        this.activity = activity;
    }

    @Override
    public void presentHomeScreen(){
        Intent intent = new Intent(activity, HomeActivity.class);
        activity.startActivity(intent);
    }

    @Override
    public void unRegister(){
        activity = null;
    }
}
