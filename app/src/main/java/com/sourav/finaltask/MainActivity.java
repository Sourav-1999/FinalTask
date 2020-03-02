package com.sourav.finaltask;

 import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import android.content.Intent;
 import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    EditText edtUsername,edPassword;
    TextView txtSignUp;

    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtUsername=findViewById(R.id.edUsername);
        txtSignUp=findViewById(R.id.txtSignUp);
        edPassword=findViewById(R.id.edPassword);
        button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Bundle bundle=new Bundle();
                bundle.putString("callFrom","Registration");

                Intent intent=new Intent(MainActivity.this,Registration.class);
                intent.putExtras(bundle);
                startActivity(intent);

            }
        });


    }

}