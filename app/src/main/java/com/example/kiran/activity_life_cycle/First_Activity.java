package com.example.kiran.activity_life_cycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by Kiran on 03-11-2015.
 */
public class First_Activity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);
    }
    public void Start_Secound_Activity(View view)
    {
        Intent Intent_Secound_Activity=new Intent(getApplicationContext(),Second_activity.class);
        startActivity(Intent_Secound_Activity);
    }
}
