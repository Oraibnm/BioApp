package com.example.bioapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //first declare if i have buttons , textViews or EditTexts
    private Button btn ;
    private TextView textView;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        test();
    }
    private  void test () {
     btn = findViewById(R.id.Addbutton);
     textView = findViewById(R.id.txtHobbies);
     editText = findViewById(R.id.editHobbies);

     btn.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             String hobbies = editText.getText().toString();
             if (!hobbies.isEmpty()){
                 textView.setText(hobbies);
                 textView.setVisibility(View.VISIBLE);
             }
         }
     });
    }
}