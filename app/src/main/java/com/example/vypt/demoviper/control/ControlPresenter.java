package com.example.vypt.demoviper.control;

import android.app.Activity;

public class ControlPresenter implements ControlContracts.Presenter{

    private ControlContracts.Interactor interactor;
    private ControlContracts.Router router;

    public ControlPresenter(ControlContracts.View view){
        interactor = new ControlInteractor();
        router = new ControlRouter((Activity) view);
    }

    @Override
    public void onDestroy(){
        interactor.unRegister();
        interactor = null;
        router.unRegister();
        router = null;
    }

    @Override
    public void gotoLoginScreen(){
        router.presentLoginScreen();
    }
}
