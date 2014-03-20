package com.example.ourotherapps;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import com.androidsx.libraryourotherapps.AppsActivity;



public class HelloWorld extends Activity {
	
	private Button btnOtherActivity;

	
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_hello_world);
		setupUI();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.hello_world, menu);
		return true;
	}
	
	private void setupUI(){
		btnOtherActivity = (Button) findViewById(R.id.btnNext);
		btnOtherActivity.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {			
				changeActivity(AppsActivity.class);
			}
		});
	}
	
	private void changeActivity(Class c){		
        Intent i = new Intent(this, c);
        startActivity(i);
	}

}
