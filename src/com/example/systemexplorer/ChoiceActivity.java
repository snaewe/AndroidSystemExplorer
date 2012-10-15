/**
 * 
 */
package com.example.systemexplorer;

import android.app.Activity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;

public class ChoiceActivity extends Activity implements OnItemSelectedListener {

	/* (non-Javadoc)
	 * @see android.widget.AdapterView.OnItemSelectedListener#onItemSelected(android.widget.AdapterView, android.view.View, int, long)
	 */
	public void onItemSelected(AdapterView<?> arg0, View view, int pos,
			long id) {
        // An item was selected. You can retrieve the selected item using
        // parent.getItemAtPosition(pos)
	}

	/* (non-Javadoc)
	 * @see android.widget.AdapterView.OnItemSelectedListener#onNothingSelected(android.widget.AdapterView)
	 */
	public void onNothingSelected(AdapterView<?> parent) {
	}

}
