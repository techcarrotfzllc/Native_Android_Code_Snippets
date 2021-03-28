package com.example.tashafi_mobile_native;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.basgeekball.awesomevalidation.AwesomeValidation;
import com.basgeekball.awesomevalidation.ValidationStyle;
import com.basgeekball.awesomevalidation.utility.RegexTemplate;

import static com.basgeekball.awesomevalidation.ValidationStyle.BASIC;
import static com.basgeekball.awesomevalidation.ValidationStyle.COLORATION;

public class LoginActivity extends AppCompatActivity {

    private AwesomeValidation awesomeValidation;

    EditText etRegId;

    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        getSupportActionBar().hide();


        etRegId = findViewById(R.id.reg_id);

        loginButton = findViewById(R.id.login_button);

//        awesomeValidation = new AwesomeValidation(BASIC);
//
//        awesomeValidation.addValidation(this, R.id.reg_id, RegexTemplate.NOT_EMPTY, R.string.not_empty);
//
//        loginButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                if(awesomeValidation.validate()){
//                    Toast.makeText(LoginActivity.this, "Form Validate Successfully", Toast.LENGTH_SHORT).show();
//                }
//                else{
//                    Toast.makeText(LoginActivity.this, "Form Validation Failed", Toast.LENGTH_SHORT).show();
//                }
//            }
//        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent=new Intent(LoginActivity.this,HomeActivity.class);
                startActivity(intent);
//                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);
            }
        });
    }
}