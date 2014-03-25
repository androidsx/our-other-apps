package com.androidsx.libraryourotherapps;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class AppAdapter extends BaseAdapter {
	
	protected Activity actOtherApps;
	protected ArrayList<App> appsList;

	public AppAdapter(Activity activity, ArrayList<App> appsList) {
	    this.actOtherApps = activity;
	    this.appsList = appsList;
	  }

	@Override
	public int getCount() {
		return appsList.size();
	}

	@Override
	public Object getItem(int position) {
		return appsList.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		View v = convertView;
	
		if(convertView == null){
			LayoutInflater inf = (LayoutInflater) actOtherApps.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			v = inf.inflate(R.layout.custom_list, null);
		}
		
		App app = appsList.get(position);
				
		ImageView picture = (ImageView) v.findViewById(R.id.picture);
		picture.setImageDrawable(v.getResources().getDrawable(app.getIconResId()));
		TextView title = (TextView) v.findViewById(R.id.titleApp);
		title.setText(app.getTitle());
		TextView description = (TextView) v.findViewById(R.id.description);
		description.setText(app.getDescription());
	
		return v;
	}

}
