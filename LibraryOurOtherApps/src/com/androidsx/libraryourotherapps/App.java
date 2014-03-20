package com.androidsx.libraryourotherapps;

import java.io.Serializable;


public class App implements Serializable {


	private static final long serialVersionUID = -6395743145003950777L;
	private int picture;
	private String title;
	private String description;
	private String namePackage;

	public App(int picture, String title, String description, String namePackage) {
		this.picture = picture;
		this.title = title;
		this.description = description;
		this.namePackage = namePackage;
	}


	public int getPicture() {
		return picture;
	}

	public String getTitle() {
		return title;
	}
	
	
	public String getDescription() {
		return description;
	}
	
	public String getNamePackage() {
		return namePackage;
	}


}
