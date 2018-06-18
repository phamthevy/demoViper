package com.example.vypt.demoviper.control;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ControlActivity extends AppCompatActivity implements ControlContracts.View {

    private ControlContracts.Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        presenter = new ControlPresenter(this);
        presenter.gotoLoginScreen();
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        presenter.onDestroy();
    }
}
