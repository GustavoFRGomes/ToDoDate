package xyz.jagedlabs.edge.tododate.login;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;

import xyz.jagedlabs.edge.tododate.R;

/**
 * By Gustavo Gomes on 2/21/2018.
 */

public class LoginActivity extends AppCompatActivity {

    private EditText usernameField;
    private EditText passwordField;
    Button loginButton;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        this.usernameField = findViewById(R.id.username_or_email_field);
        this.passwordField = findViewById(R.id.password_field);
        this.loginButton = findViewById(R.id.login_button);
    }
}
