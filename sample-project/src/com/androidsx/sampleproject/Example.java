package com.androidsx.sampleproject;

import java.io.InputStream;
import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

import com.androidsx.libraryourotherapps.App;
import com.androidsx.libraryourotherapps.AppParseXml;
import com.androidsx.libraryourotherapps.OtherAppsActivity;
import com.androidsx.sample_project.R;

public class Example extends Activity {

    private Button btnLibrary;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_example);

        btnLibrary = (Button) findViewById(R.id.btnLibrary);
        btnLibrary.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    InputStream in = getResources().openRawResource(R.raw.listapps);
                    AppParseXml test = new AppParseXml(in);
                    ArrayList<App> a = test.readAplications();

                    Intent intent = new Intent(Example.this, OtherAppsActivity.class);
                    intent.putExtra("listapp", a);
                    intent.putExtra("textColorTitle", Color.RED);
                    intent.putExtra("title", "Nuestras aplicaciones");
                    // intent.putExtra("backgroundColor", Color.WHITE);
                    startActivity(intent);
                } catch (Exception e) {
                    Toast.makeText(Example.this, "Ooh, error reading xml file", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.example, menu);
        return true;
    }

}
