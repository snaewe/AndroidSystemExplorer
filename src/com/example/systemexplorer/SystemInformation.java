package com.example.systemexplorer;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class SystemInformation extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system_information);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_system_information, menu);
        return true;
    }
}
