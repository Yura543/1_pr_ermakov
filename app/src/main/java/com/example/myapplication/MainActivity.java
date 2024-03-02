package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showToast("onCreate");
        Log.d(TAG, "Activity создана");
        Log.e(TAG, "это пример Log.e()");
        Log.w(TAG, "это пример Log.w()");
        Log.i(TAG, "это пример Log.i()");
        Log.v(TAG, "это пример Log.v()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        showToast("onStart");
        Log.d(TAG, "onStart: Activity стартовала");
    }

    @Override
    protected void onResume() {
        super.onResume();
        showToast("onResume");
        Log.d(TAG, "onResume: Activity возобновлена");
    }

    @Override
    protected void onPause() {
        super.onPause();
        showToast("onPause");
        Log.d(TAG, "onPause: Activity приостановлена");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        showToast("onRestart");
        Log.d(TAG, "onRestart: Activity перезапущен");
    }

    @Override
    protected void onStop() {
        super.onStop();
        showToast("Stopped");
        Log.d(TAG, "Stopped: Activity остановлена");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        showToast("Destroyed");
        Log.d(TAG, "Destroyed: Activity уничтожена");
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}