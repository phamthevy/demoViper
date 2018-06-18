package com.example.vypt.demoviper.login;

public class LoginContracts {
    interface View{
        void onDestroy();
        void showError(String error);
    }

    interface Presenter{
        void onDestroy();
        void pressLoginButton(String username, String password);
    }

    interface Interactor{
        void Login(String username, String password);
        void unRegister();
    }

    interface InteractorOutput{
        void loginSuccessful();
        void loginFail();
    }

    interface Router{
        void presentHomeScreen();
        void unRegister();
    }
}
