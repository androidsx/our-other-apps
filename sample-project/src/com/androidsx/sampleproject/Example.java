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
                    ArrayList<App> listApplications = test.readAplications();

                    Intent intent = new Intent(Example.this, OtherAppsActivity.class);
                    intent.putExtra("listapp", listApplications);
                    intent.putExtra("textTitle", "Check out our other apps!");
                    intent.putExtra("colorTitle", Color.parseColor("#FFFFFF"));
                    intent.putExtra("backgroundColor", Color.parseColor("#595C59"));
                    intent.putExtra("borderItemColor", Color.parseColor("#8BE872"));
                    intent.putExtra("borderItemPressedColor", Color.parseColor("#343634"));
                    intent.putExtra("backgroundItemColor", Color.parseColor("#FFFFFF"));
                    intent.putExtra("backgroundItemPressedColor", Color.parseColor("#68FF54"));

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
