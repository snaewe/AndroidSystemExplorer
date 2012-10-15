package com.example.systemexplorer;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.Spinner;
import com.example.systemexplorer.ChoiceActivity;

public class SystemInformation extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_system_information);
        Spinner spinner = (Spinner) findViewById(R.id.choices);
        ChoiceActivity listener = new ChoiceActivity();
        spinner.setOnItemSelectedListener(listener);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_system_information, menu);
        return true;
    }
}
