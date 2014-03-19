package com.example.ourotherapps;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class AppsActivity extends Activity {

	private String[] values = new String[] { "Chat Toolkit", "Spell Checker","Lottodroid", "Remote Gallery 3D", "RSS Reader" };
	private String[] descriptions = new String[] 
			{"Nuevos smileys, memes,famosos, LOLCats y emoticonos para tu aplicación favorita de chat!",
			"Corrector ortográfico #1 en Android! Soporta muchos idiomas: inglés, español, francés, italiano, alemán, finés, sueco, polaco,",
			"Consulta rápidamente los números premiados en los sorteos de la lotería española: Euromillón, Bonoloto, Once, Quiniela, etc",
			"Disfruta y maneja tus fotos/vídeos en tu PC, Mac o TV con un solo click desde tu Android!",
			"AnyRSS es un widget que añade el RSS que quieras en tu escritorio."
			};

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_apps);
		configureAppList();
		
	}
	
	
	private void configureAppList(){
		
		ListView list = (ListView) findViewById(R.id.list);
		list.setBackgroundResource(R.drawable.customshape);
		ArrayList<App> arraydir = new ArrayList<App>();

		arraydir.add(new App(getResources().getDrawable(R.drawable.smileys),values[0], descriptions[0]));
		arraydir.add(new App(getResources().getDrawable(R.drawable.corrector),values[1], descriptions[1]));
		arraydir.add(new App(getResources().getDrawable(R.drawable.lottodroid),values[2], descriptions[2]));
		arraydir.add(new App(getResources().getDrawable(R.drawable.gallery),values[3], descriptions[3]));	
		arraydir.add(new App(getResources().getDrawable(R.drawable.rss), values[4], descriptions[4]));
		
		AppAdapter adapter = new AppAdapter(this, arraydir);
		
		list.setAdapter(adapter);
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> adapter, View view,int position, long id) {

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
				case 4:
					openApp("com.androidsx.anyrss");
					break;
				}
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
		getMenuInflater().inflate(R.menu.apps, menu);
		return true;
	}

}
