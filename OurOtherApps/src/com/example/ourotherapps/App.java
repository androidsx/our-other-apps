package com.example.ourotherapps;

import android.graphics.drawable.Drawable;

public class App {
	
	private Drawable picture;
	private String title;
	private String description;	

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


}
