package com.example.ourotherapps;

import android.app.ListActivity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class AppsActivity extends ListActivity {

	private String[] values = new String[] { "Chat Toolkit", "Spell Checker",
			"Lottodroid", "Remote Gallery 3D" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
				android.R.layout.simple_list_item_1, values);
		setListAdapter(adapter);
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		switch (position) {
		case 0:
			openApp("com.androidsx.smileys");
			break;
		case 1:
			openApp("com.androidsx.checkspelling");
			break;
		case 2:
			openApp("com.androidsx.lottodroid");
			break;
		case 3:
			openApp("com.androidsx.easygallery");
			break;

		}
	}

	private void openApp(String app) {
		Intent intent = new Intent(Intent.ACTION_VIEW);
		intent.setData(Uri.parse("market://details?id="+app));
		startActivity(intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.apps, menu);
		return true;
	}

}
