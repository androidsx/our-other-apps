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

First you create a InputStream and get data from xml file. You need a XML file with get the apps in res/raw folder. It automatically searches for res/raw/listapp.xml but you can customize file.


	<?xml version="1.0" encoding="utf-8"?>
	<applications>
    		<app>
			<icon>drawable/smileys</icon>
        		<title>Smyleys</title>
        		<description>New smyleis, memes,famous, LOLCats y emoticon for your favorite chat application!</description>
        		<packagename>com.androidsx.smileys</packagename>       
    		</app>
	</applications>

If you would like a multi language, you just have to put the translated files listapp.xml in the appropriate folders res/raw-xx/.


Once you have a xml file in res/raw, the next step is a create the event button.

On the button click event, you have add this code:

	InputStream in = getResources().openRawResource(R.raw.listapps);
	AppParseXml test = new AppParseXml(in);
	ArrayList<App> listApplications = test.readAplications();

For adapt the ListView look you can change the colors, as you like, thought the Extras.

	Intent intent = new Intent(Example.this, OtherAppsActivity.class);
	intent.putExtra("listapp", listApplications);
	intent.putExtra("textTitle", "Check out our other apps!");
	intent.putExtra("colorTitle", Color.parseColor("#FFFFFF"));
	intent.putExtra("backgroundColor", Color.parseColor("#595C59"));
	intent.putExtra("borderItemColor", Color.parseColor("#8BE872"));
	intent.putExtra("borderItemPressedColor", Color.parseColor("#343634"));
	intent.putExtra("backgroundItemColor", Color.parseColor("#FFFFFF"));
	intent.putExtra("backgroundItemPressedColor", Color.parseColor("#68FF54"));

	startActivity(intent);
	
	
This is other way to use this library without using de xml files. On the button click event, you have add this code.

In order to add items into the ListView you need add objects App into de ArrayList<App>

	ArrayList<App> appslist = new ArrayList<App>();
	
	appslist.add(new App("drawable/smileys", "Chat Toolkit", "Nuevos smileys, memes,famosos, LOLCats y emoticonos para tu aplicación 		favorita de chat!","com.androidsx.smileys"));

	Intent intent = new Intent(Example.this, OtherAppsActivity.class);
	intent.putExtra("listapp", applist);
	intent.putExtra("listapp", listApplications);
	intent.putExtra("textTitle", "Check out our other apps!");
	intent.putExtra("colorTitle", Color.parseColor("#FFFFFF"));
	intent.putExtra("backgroundColor", Color.parseColor("#595C59"));
	intent.putExtra("borderItemColor", Color.parseColor("#8BE872"));
	intent.putExtra("borderItemPressedColor", Color.parseColor("#343634"));
	intent.putExtra("backgroundItemColor", Color.parseColor("#FFFFFF"));
	intent.putExtra("backgroundItemPressedColor", Color.parseColor("#68FF54"));
	startActivity(intent);







Licence
-------------------------

MIT

