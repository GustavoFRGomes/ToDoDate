package xyz.jagedlabs.edge.tododate;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import xyz.jagedlabs.edge.tododate.login.LoginActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoginActivity login = new LoginActivity();

        this.getApplication();
    }
}
