package com.cuncisboss.datamahasiswa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.cuncisboss.datamahasiswa.db.DatabaseHelper;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new DatabaseHelper(this);
    }
}
