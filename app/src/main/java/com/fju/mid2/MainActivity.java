package com.fju.mid2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private static final int FUNC = 1;
    private Button b1;
    private Button b2;
    private Button b3;
    private Button b4;
    private Button b5;
    private Button b6;
    private Button b7;
    private Button b8;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
    }
    public void func1 (View view){
        Intent intent = new Intent(this, Func1Activity.class);
        startActivity(intent);
    }
    public void func2 (View view){
        Intent intent = new Intent(this, Func2Activity.class);
        startActivity(intent);
    }
    public void func3 (View view){
        Intent intent = new Intent(this, Func3Activity.class);
        startActivityForResult(intent, FUNC);
    }
    public void func4 (View view){
        Intent intent = new Intent(this, Func4Activity.class);
        startActivity(intent);
    }
    public void func5 (View view){
        Intent intent = new Intent(this, Func5Activity.class);
        startActivity(intent);
    }
    public void func6 (View view){
        Intent intent = new Intent(this, Func6Activity.class);
        startActivity(intent);
    }
    public void func7 (View view){
        Intent intent = new Intent(this, Func7Activity.class);
        startActivityForResult(intent, FUNC);
    }
    public void func8 (View view){
        Intent intent = new Intent(this, Func8Activity.class);
        startActivityForResult(intent, FUNC);
    }
}
