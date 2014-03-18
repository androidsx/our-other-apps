package com.example.ourotherapps;

import android.graphics.drawable.Drawable;

public class App {
	
	protected Drawable picture;
	protected String title;
	protected String description;	
	protected long id;

	public App(Drawable picture, String title, String description) {
		this.picture = picture;
		this.title = title;
		this.description = description;
	}


	public Drawable getPicture() {
		return picture;
	}

	public void setPicture(Drawable picture) {
		this.picture = picture;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

}
