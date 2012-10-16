package com.example.systemexplorer;

import android.os.Bundle;
import android.annotation.TargetApi;
import android.app.Activity;
import android.text.method.ScrollingMovementMethod;
import android.view.Menu;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.systemexplorer.ChoiceActivity;

import java.io.*;

public class SystemInformation extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_system_information);
        Spinner spinner = (Spinner) findViewById(R.id.choices);
        ChoiceActivity listener = new ChoiceActivity();
        spinner.setOnItemSelectedListener(listener);

        TextView tv = (TextView)findViewById(R.id.textView1);
        tv.setMovementMethod(new ScrollingMovementMethod());

        File[] files = new File("/").listFiles();
        for (File aFile : files) {
            tv.append(aFile.getAbsolutePath());
            tv.append("    ");
            if(aFile.isFile()) {
                tv.append(Long.valueOf(aFile.length()).toString());
            } else {
                tv.append("00000000");
            }
            tv.append("    ");
            boolean x = false; /* aFile.canExecute(); */
            boolean r = aFile.canRead();
            boolean w = aFile.canWrite();
            tv.append(r ? "R" : "-");
            tv.append(w ? "W" : "-");
            tv.append(x ? "X" : "-");
            tv.append("\n");
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_system_information, menu);
        return true;
    }
}
