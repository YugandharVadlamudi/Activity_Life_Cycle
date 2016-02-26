package com.example.kiran.activity_life_cycle;
import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;
public class Second_activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.secound_activity);
//        Toast.makeText(context, text, duration);
        Toast t=Toast.makeText(getApplicationContext(),"ONCreate;;;;;;;",Toast.LENGTH_LONG);
        t.show();
    }
    @Override
    protected void onStart() {
        super.onStart();
        Toast t=Toast.makeText(getApplicationContext(),"ONStart;;;;;;",Toast.LENGTH_LONG);
        t.show();
    }
    @Override
    protected void onResume() {
        super.onResume();
        Toast t=Toast.makeText(getApplicationContext(),"ONResume;;;;;;",Toast.LENGTH_LONG);
        t.show();
    }
    @Override
    protected void onPause() {
        super.onPause();
        Toast t=Toast.makeText(getApplicationContext(),"ONPause;;;;;;",Toast.LENGTH_LONG);
        t.show();
    }
    @Override
    protected void onStop() {
        super.onStop();
        Toast t=Toast.makeText(getApplicationContext(),"ONStop;;;;;;",Toast.LENGTH_LONG);
        t.show();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast t=Toast.makeText(getApplicationContext(),"ONdestroy;;;;;;",Toast.LENGTH_LONG);
        t.show();
    }
    @Override
    protected void onRestart() {
        super.onRestart();
        Toast t=Toast.makeText(getApplicationContext(),"ONResart;;;;;;",Toast.LENGTH_LONG);
        t.show();
    }
}
