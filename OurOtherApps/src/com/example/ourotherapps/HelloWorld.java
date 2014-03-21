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
		generateList();
	    Intent intent = new Intent(this, c);
        intent.putExtra("listapp", apps);
        startActivity(intent);
	}
	
	private void generateList(){
		
		apps = new ArrayList<App>();
		
		apps.add(new App(R.drawable.chrome, "Google Chrome", "Navega más rápido con el navegador web Chrome en tu teléfono o tablet Android.","com.android.chrome"));
		apps.add(new App(R.drawable.gmail,"Gmail", "Gmail se basa en la idea de que el correo electrónico puede ser más intuitivo, eficiente, útil e incluso divertido.","com.google.android.gm"));
		apps.add(new App(R.drawable.drive,"Google Drive", "Con Google Drive puedes guardar todos tus archivos en un solo lugar, para que puedas acceder a ellos desde cualquier lugar y compartirlos con otras personas.","com.google.android.apps.docs"));
		apps.add(new App(R.drawable.youtube,"Youtube", "YouTube a tu manera. Descarga la aplicación de YouTube oficial para Android. Conviértete en DJ, aprende Kung Fu y comparte fácilmente con tus amigos.","com.google.android.youtube"));	

	}

}
