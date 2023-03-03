package com.example.p1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MyApp";
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Context context = getApplicationContext();
        CharSequence text = "Toast Created";
        int duration = Toast.LENGTH_LONG;
        Toast.makeText(context, text, duration).show();
        Log.i(TAG,"Информация");
    }
    protected void onStart() {
        super.onStart();
        Context context = getApplicationContext();
        CharSequence text = "Toast Started";
        int duration = Toast.LENGTH_LONG;
        Toast.makeText(context, text, duration).show();
    }
    protected void onPause() {
        super.onPause();
        Context context = getApplicationContext();
        CharSequence text = "Toast Paused";
        int duration = Toast.LENGTH_LONG;
        Toast.makeText(context, text, duration).show();
    }
    protected void onResume() {
        super.onResume();
        Context context = getApplicationContext();
        CharSequence text = "Toast Resumed";
        int duration = Toast.LENGTH_LONG;
        Toast.makeText(context, text, duration).show();
    }
    protected void onStop() {
        super.onStop();
        CharSequence text = "Toast Stopped";
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast.makeText(context, text, duration).show();
    }
    protected void onDestroy() {
        super.onDestroy();
        CharSequence text = "Toast Destroyed";
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast.makeText(context, text, duration).show();
    }
}