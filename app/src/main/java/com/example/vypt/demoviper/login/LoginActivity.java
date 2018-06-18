package com.example.vypt.demoviper.login;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.vypt.demoviper.R;

public class LoginActivity extends AppCompatActivity implements LoginContracts.View{

    TextView tv_name, tv_pass;
    EditText et_name, et_pass;
    Button b_login;

    private LoginContracts.Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Binding();
        presenter = new LoginPresenter(this);

        b_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onButtonLoginPress();
            }
        });
    }

    public void onButtonLoginPress(){
        String user = et_name.getText().toString();
        String pass = et_pass.getText().toString();
        presenter.pressLoginButton(user,pass);
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        presenter.onDestroy();
    }

    @Override
    public void showError(String error){
        Toast.makeText(this, error, Toast.LENGTH_LONG).show();
    }

    public void Binding(){
        tv_name = (TextView) findViewById(R.id.tv1);
        tv_pass = (TextView) findViewById(R.id.tv2);
        et_name = (EditText) findViewById(R.id.et_name);
        et_pass = (EditText) findViewById(R.id.et_pass);
        b_login = (Button) findViewById(R.id.b_login);
    }
}
