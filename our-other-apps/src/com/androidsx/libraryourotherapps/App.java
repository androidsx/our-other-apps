package com.androidsx.libraryourotherapps;

import java.io.Serializable;

public class App implements Serializable {

	private static final long serialVersionUID = -6395743145003950777L;
	private int iconResId;
	private String title;
	private String description;
	private String packageName;

	public App(int iconResId, String title, String description,
			String packageName) {
		this.iconResId = iconResId;
		this.title = title;
		this.description = description;
		this.packageName = packageName;
	}

	public int getIconResId() {
		return iconResId;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

	public String getPackageName() {
		return packageName;
	}

}
