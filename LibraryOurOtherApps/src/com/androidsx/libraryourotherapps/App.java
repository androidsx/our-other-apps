package com.androidsx.libraryourotherapps;

<<<<<<< HEAD
import java.io.Serializable;
=======
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
>>>>>>> master


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


<<<<<<< HEAD
	public int getIconResId() {
		return iconResId;
=======
	public Drawable getPicture() {
		return picture;
>>>>>>> 87ae55bbb0c0a85f26b376906d7599f1ab4df582
>>>>>>> master
	}

	public String getTitle() {
		return title;
	}
	
	
	public String getDescription() {
		return description;
	}
<<<<<<< HEAD
=======
<<<<<<< HEAD
>>>>>>> master
	
	public String getPackageName() {
		return packageName;
	}
<<<<<<< HEAD
=======
=======
>>>>>>> 87ae55bbb0c0a85f26b376906d7599f1ab4df582
>>>>>>> master


}
