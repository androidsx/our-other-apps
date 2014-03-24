package com.androidsx.libraryourotherapps;

import java.util.ArrayList;
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======

>>>>>>> 87ae55bbb0c0a85f26b376906d7599f1ab4df582
>>>>>>> master
import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class AppsActivity extends Activity {

<<<<<<< HEAD
	private ArrayList<App> apps;

=======
<<<<<<< HEAD
	private ArrayList<App> apps;

=======
>>>>>>> 87ae55bbb0c0a85f26b376906d7599f1ab4df582
>>>>>>> master
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_apps);
		ListView list = (ListView) findViewById(R.id.list);
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> master
		
		Intent intent = getIntent();
		apps = (ArrayList<App>) intent.getSerializableExtra("listapp");
	
		configureAppList(list, apps);
<<<<<<< HEAD
	}
	
	private void configureAppList(ListView list, ArrayList<App> arraydir){
				
=======
	}
	
	private void configureAppList(ListView list, ArrayList<App> arraydir){
				
=======
		configureAppList(list);
	}
	
	private void configureAppList(ListView list){
		
		
		ArrayList<App> arraydir = new ArrayList<App>();

		arraydir.add(new App(getResources().getDrawable(R.drawable.smileys),"Chat Toolkit", "Nuevos smileys, memes,famosos, LOLCats y emoticonos para tu aplicación favorita de chat!"));
		arraydir.add(new App(getResources().getDrawable(R.drawable.corrector),"Spell Checker", "Corrector ortográfico #1 en Android! Soporta muchos idiomas: inglés, español, francés, italiano, alemán, finés, sueco, polaco,"));
		arraydir.add(new App(getResources().getDrawable(R.drawable.lottodroid),"Lottodroid", "Consulta rápidamente los números premiados en los sorteos de la lotería española: Euromillón, Bonoloto, Once, Quiniela, etc"));
		arraydir.add(new App(getResources().getDrawable(R.drawable.gallery),"Remote Gallery 3D", "Disfruta y maneja tus fotos/vídeos en tu PC, Mac o TV con un solo click desde tu Android!"));	
		arraydir.add(new App(getResources().getDrawable(R.drawable.rss), "RSS Reader", "AnyRSS es un widget que añade el RSS que quieras en tu escritorio."));
		
>>>>>>> 87ae55bbb0c0a85f26b376906d7599f1ab4df582
>>>>>>> master
		AppAdapter adapter = new AppAdapter(this, arraydir);
	
		list.setAdapter(adapter);
		list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
			@Override
			public void onItemClick(AdapterView<?> adapter, View view,int position, long id) {
<<<<<<< HEAD
				openApp(apps.get(position).getPackageName());
=======
<<<<<<< HEAD
				openApp(apps.get(position).getPackageName());
=======

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
>>>>>>> 87ae55bbb0c0a85f26b376906d7599f1ab4df582
>>>>>>> master
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
	
<<<<<<< HEAD
	
=======
<<<<<<< HEAD
	
=======
>>>>>>> 87ae55bbb0c0a85f26b376906d7599f1ab4df582
>>>>>>> master

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
