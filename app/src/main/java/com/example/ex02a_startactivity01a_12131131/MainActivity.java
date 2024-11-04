package com.example.ex02a_startactivity01a_12131131;

import static androidx.core.content.ContextCompat.startActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity
implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        initInfo();
      ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.LinerLayout), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button btnopen = findViewById(R.id.btnopen);
        btnopen.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(MainActivity.this, SecondActivity.class);
                intent.putExtras(setupBundle());
                startActivity(intent);

            }
        });
    }

    Bundle setupBundle() {
        EditText EdiTextName = (EditText) findViewById(R.id.editTextText3);
        String Name = EdiTextName.getText().toString();

        EditText EditTextTel = (EditText) findViewById(R.id.editTextText4);
        String Tel = EditTextTel.getText().toString();

        EditText EditTextPhone = (EditText) findViewById(R.id.editTextText5);
        String Phone = EditTextPhone.getText().toString();

        EditText EditTextEmail = (EditText) findViewById(R.id.editTextText6);
        String Email = EditTextEmail.getText().toString();

        Bundle bundle = new Bundle();
        bundle.putString("Name",Name);
        bundle.putString("Tel",Tel);
        bundle.putString("Phone",Phone);
        bundle.putString("Email",Email);
    return bundle;

    }

    private void initInfo() {


    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent);


    }


}
