package com.androidsx.sample_project;

<<<<<<< HEAD
import java.util.ArrayList;

=======
<<<<<<< HEAD
import java.util.ArrayList;

=======
>>>>>>> 87ae55bbb0c0a85f26b376906d7599f1ab4df582
>>>>>>> master
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
<<<<<<< HEAD

import com.androidsx.libraryourotherapps.App;
=======
>>>>>>> 87ae55bbb0c0a85f26b376906d7599f1ab4df582
import com.androidsx.libraryourotherapps.AppsActivity;

import com.androidsx.libraryourotherapps.App;
import com.androidsx.libraryourotherapps.AppsActivity;

public class Example extends Activity {
	
	private Button btnLibrary;
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
		setContentView(R.layout.activity_example);
<<<<<<< HEAD
		
		btnLibrary = (Button)findViewById(R.id.btnLibrary);	
		btnLibrary.setOnClickListener(new OnClickListener() {	
=======
<<<<<<< HEAD
		generateList();
		
		btnLibrary = (Button)findViewById(R.id.btnLibrary);	
		btnLibrary.setOnClickListener(new OnClickListener() {	
=======
		btnLibrary = (Button)findViewById(R.id.btnLibrary);
		btnLibrary.setOnClickListener(new OnClickListener() {
			
>>>>>>> 87ae55bbb0c0a85f26b376906d7599f1ab4df582
>>>>>>> master
			@Override
			public void onClick(View v) {				
				changeActivity(AppsActivity.class);				
			}
		});
	}
	
<<<<<<< HEAD
	private void changeActivity(Class c){	
		generateList();
=======
	private void changeActivity(Class c){		
<<<<<<< HEAD
>>>>>>> master
	    Intent intent = new Intent(this, c);
        intent.putExtra("listapp", apps);
        startActivity(intent);
	}
	
	private void generateList(){
		
		apps = new ArrayList<App>();
		
		apps.add(new App(R.drawable.smileys, "Chat Toolkit", "Nuevos smileys, memes,famosos, LOLCats y emoticonos para tu aplicación favorita de chat!","com.androidsx.smileys"));
		apps.add(new App(R.drawable.corrector,"Spell Checker", "Corrector ortográfico #1 en Android! Soporta muchos idiomas: inglés, español, francés, italiano, alemán, finés, sueco, polaco,","com.androidsx.checkspelling"));
		apps.add(new App(R.drawable.lottodroid,"Lottodroid", "Consulta rápidamente los números premiados en los sorteos de la lotería española: Euromillón, Bonoloto, Once, Quiniela, etc","com.androidsx.lottodroid"));
		apps.add(new App(R.drawable.gallery,"Remote Gallery 3D", "Disfruta y maneja tus fotos/vídeos en tu PC, Mac o TV con un solo click desde tu Android!","com.androidsx.easygallery"));	
		apps.add(new App(R.drawable.rss, "RSS Reader", "AnyRSS es un widget que añade el RSS que quieras en tu escritorio.","com.androidsx.anyrss"));

<<<<<<< HEAD
=======
=======
        Intent i = new Intent(this, c);
        startActivity(i);
>>>>>>> 87ae55bbb0c0a85f26b376906d7599f1ab4df582
>>>>>>> master
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
<<<<<<< HEAD
=======
<<<<<<< HEAD
=======
		// Inflate the menu; this adds items to the action bar if it is present.
>>>>>>> 87ae55bbb0c0a85f26b376906d7599f1ab4df582
>>>>>>> master
		getMenuInflater().inflate(R.menu.example, menu);
		return true;
	}

}
