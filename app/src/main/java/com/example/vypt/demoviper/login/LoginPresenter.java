package com.example.vypt.demoviper.login;

import android.app.Activity;

import com.example.vypt.demoviper.control.ControlInteractor;

public class LoginPresenter implements LoginContracts.Presenter, LoginContracts.InteractorOutput {
    private LoginContracts.Interactor interactor;
    private LoginContracts.Router router;
    private LoginContracts.View view;

    LoginPresenter(LoginContracts.View view){
        interactor = new LoginInteractor(this);
        router = new LoginRoute((Activity) view);
        this.view = view;
    }

    @Override
    public void onDestroy(){
        interactor.unRegister();
        interactor = null;
        router.unRegister();
        router = null;
    }

    @Override
    public void pressLoginButton(String username, String password){
        interactor.Login(username, password);
    }

    @Override
    public void loginFail(){
        view.showError("Login fail");
    }

    @Override
    public void loginSuccessful(){
        router.presentHomeScreen();
    }

}
