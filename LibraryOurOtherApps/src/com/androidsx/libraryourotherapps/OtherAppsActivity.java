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

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_apps);
		Intent intent = getIntent();

		ListView listview = (ListView) findViewById(R.id.list);
		ArrayList<App> apps = (ArrayList<App>) intent
				.getSerializableExtra("listapp");

		configureAppList(listview, apps);
	}

	private void configureAppList(ListView listview,
			final ArrayList<App> listApps) {

		AppAdapter adapter = new AppAdapter(this, listApps);

		listview.setAdapter(adapter);
		listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> adapter, View view,
					int position, long id) {
				openApp(listApps.get(position).getPackageName());
			}
		});
	}

	private void openApp(String packageName) {
		try {
			startActivity(new Intent(Intent.ACTION_VIEW,
					Uri.parse("market://details?id=" + packageName)));
		} catch (android.content.ActivityNotFoundException anfe) {
			startActivity(new Intent(Intent.ACTION_VIEW,
					Uri.parse("http://play.google.com/store/apps/details?id="
							+ packageName)));
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
