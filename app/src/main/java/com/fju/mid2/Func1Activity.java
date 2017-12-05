package com.fju.mid2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class Func1Activity extends AppCompatActivity {

    private Button random;
    int n = (int) (Math.random()*6+1);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_func1);
        random = (Button) findViewById(R.id.random);
    }
   
}
