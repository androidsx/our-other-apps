package com.example.ourotherapps;

import android.graphics.drawable.Drawable;

public class App {
	
	private Drawable picture;
	private String title;
	private String description;	
	private long id;

	public App(Drawable picture, String title, String description) {
		this.picture = picture;
		this.title = title;
		this.description = description;
	}


	public Drawable getPicture() {
		return picture;
	}

	public String getTitle() {
		return title;
	}
	
	
	public String getDescription() {
		return description;
	}

	public long getId() {
		return id;
	}


}
