package com.example.vypt.demoviper.control;

public class ControlContracts {
    interface View {
        void onDestroy();
    }

    interface Presenter{
        void onDestroy();
        void gotoLoginScreen();
    }

    interface Interactor{
        void unRegister();
    }

    interface Router{
        void unRegister();
        void presentLoginScreen();
    }
}
