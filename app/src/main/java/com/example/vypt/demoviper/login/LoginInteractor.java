package com.example.vypt.demoviper.login;

public class LoginInteractor implements LoginContracts.Interactor {

    private LoginContracts.InteractorOutput output;

    public LoginInteractor(LoginContracts.InteractorOutput output){
        this.output = output;
    }

    @Override
    public void Login(String username, String password){
        if (username.equals("thevy") && password.equals("1234")){
            output.loginSuccessful();
        }
        else output.loginFail();
    }

    @Override
    public void unRegister(){
        output = null;
    }
}
