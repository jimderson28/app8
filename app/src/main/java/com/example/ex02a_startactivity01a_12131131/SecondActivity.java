package com.example.ex02a_startactivity01a_12131131;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class SecondActivity extends AppCompatActivity
implements View.OnClickListener
{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_second);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.LinerLayout), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        Button btnreturn = (Button) this.findViewById(R.id.button1);
        btnreturn.setOnClickListener(this);
        Bundle bundle = this.getIntent().getExtras();
        String Name = bundle.getString("Name");
        String Tel = bundle.getString("Tel");
        String Phone = bundle.getString("Phone");
        String Email = bundle.getString("Email");
        TextView tv1 = (TextView) findViewById(R.id.textView6);
        TextView tv2 = (TextView) findViewById(R.id.textView14);
        TextView tv3 = (TextView) findViewById(R.id.textView15);
        TextView tv4 = (TextView) findViewById(R.id.textView16);
        tv1.setText("姓名: " + Name);
        tv2.setText("電話: " + Tel);
        tv3.setText("手機: " + Phone);
        tv4.setText("E-mail: " + Email);






    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(SecondActivity.this,MainActivity.class);
            this.finish();

    }
}