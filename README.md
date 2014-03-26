Our Other Apps Library
==============

Our Other Apps is a library for Android 2.3+ that provide us a screen that shows others applications made by the developer who integrate it, with aim to do cross promotion.

[![img1](https://raw.githubusercontent.com/androidsx/our-other-apps/master/images-readme/readmephoto.png)]()

You can see the <a href="https://github.com/androidsx/our-other-apps/tree/master/sample-project">source code of an application example</a> in which that library is integrated

Including in your project
-------------------------

In the propertys of the project add the library. 

Next, in the AndroidManifest.xml you have to add a new line doing reference to the library activity.

        <activity
            android:name="com.androidsx.libraryourotherapps.OtherAppsActivity"
            android:label="@string/title_activity_apps" >
        </activity>
        


Usage
-------------------------

Using the library is really simple, <a href="https://github.com/androidsx/our-other-apps/blob/master/sample-project/src/com/androidsx/sampleproject/Example.java">that example</a> allows you to know how to link the activity apps through a button.

On the button click event, you have add this code.

        Intent intent = new Intent(Example.this,OtherAppsActivity.class);
		intent.putExtra("listapp", generateAppList());
		startActivity(intent);


The generateAppList() method return an ArrayList<App> witch all items for the list:

	private ArrayList<App> generateAppList() {

		ArrayList<App> apps = new ArrayList<App>();

		apps.add(new App(
				R.drawable.smileys,
				"Chat Toolkit",
				"Nuevos smileys, memes,famosos, LOLCats y emoticonos para tu aplicación favorita de chat!",
				"com.androidsx.smileys"));
				
		return apps;
	}
	
In this case, this item is the only.

In order to add items into the ListView you need add an object App into de ArrayList<App>

This is an example for add one item.

    appslist.add(new App(R.drawable.smileys, "Chat Toolkit", "Nuevos smileys, memes,famosos, LOLCats y emoticonos para tu aplicación favorita de chat!","com.androidsx.smileys"));



Licence
-------------------------

GPL v3

