package com.example.tutorial4;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.tutorial4.Database.DBHelper;
import com.example.tutorial4.Database.DBHelper;


public class MainActivity extends AppCompatActivity
{
    DBHelper mDatabaseHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDatabaseHelper = new DBHelper(this);
        mDatabaseHelper.readAllInfo();

    }

}
