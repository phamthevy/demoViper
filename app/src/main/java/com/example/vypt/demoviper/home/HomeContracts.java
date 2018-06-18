package com.example.vypt.demoviper.home;

public class HomeContracts {

    interface View{
        void onDestroy();
        void onError();
    }

    interface Presenter{
        void onDestroy();

    }

    interface Interactor{
        void unRegister();

    }

    interface Router{
        void unRegister();
    }
}
