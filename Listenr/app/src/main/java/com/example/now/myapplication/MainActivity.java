package com.example.now.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //textView에 앞서 만든 laydout의 textView라는 아이디 넘겨주기
        textView = findViewById(R.id.textView);

        //한큐에 바로 listener 선언하기
       textView.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent intent = new Intent(MainActivity.this,SecondActivity.class);
               startActivity(intent);
           }
       });



        //선언하고 변수 넘겨주기
 /*       View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        };
        textView.setOnClickListener(listener);
*/

        editText = findViewById(R.id.editText);
        editText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
                //text가 변하기 전에 호출되는 method
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                //text가 변하는 중에 호출되는 method
            }

            @Override
            public void afterTextChanged(Editable s) {
                //text가 변하기 후에 호출되는 method
            }
        });





    }
}
