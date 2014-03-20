package com.androidsx.sample_project;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Example extends Activity {
	
	private Button btnLibrary;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_example);
		btnLibrary = (Button)findViewById(R.id.btnLibrary);
		btnLibrary.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {				
				changeActivity(com.androidsx.libraryourotherapps.AppsActivity.class);				
			}
		});
	}
	
	private void changeActivity(Class c){		
        Intent i = new Intent(this, c);
        startActivity(i);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.example, menu);
		return true;
	}

}
