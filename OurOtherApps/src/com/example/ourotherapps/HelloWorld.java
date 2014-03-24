package com.example.ourotherapps;

import java.util.ArrayList;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.androidsx.libraryourotherapps.App;
import com.androidsx.libraryourotherapps.AppsActivity;


public class HelloWorld extends Activity {
	
	private Button btnOtherActivity;
	private ArrayList<App> apps;

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

	}

}
