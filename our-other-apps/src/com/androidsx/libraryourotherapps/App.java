package com.androidsx.libraryourotherapps;

import java.io.Serializable;

public class App implements Serializable {

    private static final long serialVersionUID = -6395743145003950777L;
    private String pathResIcon;
    private String title;
    private String description;
    private String packageName;

    public App(String pathResIcon, String title, String description, String packageName) {
        this.pathResIcon = pathResIcon;
        this.title = title;
        this.description = description;
        this.packageName = packageName;
    }

    public App(String title, String description) {
        this.title = title;
        this.description = description;
    }

    public App() {

    }

    public void setIconResPath(String pathResIcon) {
        this.pathResIcon = pathResIcon;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPackageName(String packageName) {
        this.packageName = packageName;
    }

    public String getIconResPath() {
        return pathResIcon;
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
