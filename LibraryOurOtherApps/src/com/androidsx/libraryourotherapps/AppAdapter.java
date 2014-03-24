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
	
	protected Activity activity;
	protected ArrayList<App> items;

	public AppAdapter(Activity activity, ArrayList<App> items) {
	    this.activity = activity;
	    this.items = items;
	  }

	@Override
	public int getCount() {
		return items.size();
	}

	@Override
	public Object getItem(int position) {
		return items.get(position);
	}

	@Override
	public long getItemId(int position) {
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		View v = convertView;
	
		if(convertView == null){
			LayoutInflater inf = (LayoutInflater) activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
			v = inf.inflate(R.layout.custom_list, null);
		}
		
		App app = items.get(position);
				
		ImageView picture = (ImageView) v.findViewById(R.id.picture);
<<<<<<< HEAD
		picture.setImageDrawable(v.getResources().getDrawable(app.getIconResId()));
=======
		picture.setImageDrawable(app.getPicture());
>>>>>>> 87ae55bbb0c0a85f26b376906d7599f1ab4df582
		TextView title = (TextView) v.findViewById(R.id.titleApp);
		title.setText(app.getTitle());
		TextView description = (TextView) v.findViewById(R.id.description);
		description.setText(app.getDescription());
	
		return v;
	}

}
