package com.example.vypt.demoviper.control;

import android.app.Activity;
import android.content.Intent;

import com.example.vypt.demoviper.login.LoginActivity;

public class ControlRouter implements ControlContracts.Router {
    private Activity activity;

    public ControlRouter(Activity activity){
        this.activity = activity;
    }

    @Override
    public void unRegister(){
        activity = null;
    }

    @Override
    public void presentLoginScreen(){
        Intent intent = new Intent(activity, LoginActivity.class);
        activity.startActivity(intent);
    }
}
