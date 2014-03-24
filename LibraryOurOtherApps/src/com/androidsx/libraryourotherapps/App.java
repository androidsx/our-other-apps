package com.androidsx.libraryourotherapps;

<<<<<<< HEAD
import java.io.Serializable;


public class App implements Serializable {


	private static final long serialVersionUID = -6395743145003950777L;
	private int iconResId;
	private String title;
	private String description;
	private String packageName;

	public App(int iconResId, String title, String description, String packageName) {
		this.iconResId = iconResId;
		this.title = title;
		this.description = description;
		this.packageName = packageName;
	}


	public int getIconResId() {
		return iconResId;
=======
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
>>>>>>> 87ae55bbb0c0a85f26b376906d7599f1ab4df582
	}

	public String getTitle() {
		return title;
	}
	
	
	public String getDescription() {
		return description;
	}
<<<<<<< HEAD
	
	public String getPackageName() {
		return packageName;
	}
=======
>>>>>>> 87ae55bbb0c0a85f26b376906d7599f1ab4df582


}
