package com.androidsx.libraryourotherapps;

import java.util.ArrayList;
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class OtherAppsActivity extends Activity {

	private ArrayList<App> apps;

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_apps);
		ListView list = (ListView) findViewById(R.id.list);
		
		Intent intent = getIntent();
		apps = (ArrayList<App>) intent.getSerializableExtra("listapp");
	
		configureAppList(list, apps);
	}
	
	private void configureAppList(ListView list, ArrayList<App> arraydir){
				
		AppAdapter adapter = new AppAdapter(this, arraydir);
	
		list.setAdapter(adapter);
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> adapter, View view,int position, long id) {
				openApp(apps.get(position).getPackageName());
			}
		});
	}
	
	private void openApp(String app) {
		try {
			startActivity(new Intent(Intent.ACTION_VIEW,
					Uri.parse("market://details?id=" + app)));
		} catch (android.content.ActivityNotFoundException anfe) {
			startActivity(new Intent(Intent.ACTION_VIEW,
					Uri.parse("http://play.google.com/store/apps/details?id="+ app)));
		}
	}
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
