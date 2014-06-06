package com.androidsx.libraryourotherapps;

import java.util.ArrayList;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class OtherAppsActivity extends Activity {

    @SuppressWarnings("unchecked")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apps);
        Intent intent = getIntent();

        ListView listview = (ListView) findViewById(R.id.list);

        ArrayList<App> apps = (ArrayList<App>) intent.getSerializableExtra("listapp");
        configureAppList(listview, apps);

        String textTitle = intent.getStringExtra("textTitle");
        int textColorTitle = intent.getIntExtra("colorTitle", Color.BLACK);
        int backgroundColor = intent.getIntExtra("backgroundColor", Color.parseColor("#E1E3DA"));
        int borderItemColor = intent.getIntExtra("borderItemColor", Color.BLACK);
        int borderItemPressedColor = intent.getIntExtra("borderItemPressedColor", Color.BLACK);
        int itemColor = intent.getIntExtra("backgroundItemColor", Color.WHITE);
        int itemPressedColor = intent.getIntExtra("backgroundItemPressedColor", Color.parseColor("#B5B1B1"));

        setStyles(textTitle, textColorTitle, backgroundColor, itemColor, borderItemColor, borderItemPressedColor,
                itemPressedColor);
    }

    private void setStyles(String textTitle, int textColorTitle, int backgroundColor, int itemColor,
            int borderItemColor, int borderItemPressedColor, int itemPressedColor) {
        View view = this.getWindow().getDecorView();
        TextView txtTitle = (TextView) findViewById(R.id.check);
        view.setBackgroundColor(backgroundColor);
        txtTitle.setText(textTitle);
        txtTitle.setTextColor(textColorTitle);
        GradientDrawable shape = (GradientDrawable) getResources().getDrawable(R.drawable.customshape);
        GradientDrawable shapeItem = (GradientDrawable) getResources().getDrawable(R.drawable.item_selected);
        shape.setColor(itemColor);
        shapeItem.setColor(itemPressedColor);
        shape.setStroke(2, borderItemColor);
        shapeItem.setStroke(2, borderItemPressedColor);
    }

    private void configureAppList(ListView listview, final ArrayList<App> listApps) {

        AppAdapter adapter = new AppAdapter(this, listApps);

        listview.setAdapter(adapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapter, View view, int position, long id) {
                openApp(listApps.get(position).getPackageName());
            }
        });
    }

    private void openApp(String packageName) {
        try {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("market://details?id=" + packageName)));
        } catch (android.content.ActivityNotFoundException anfe) {
            startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse("http://play.google.com/store/apps/details?id="
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
