Our Other Apps Library
==============

Our Other Apps is a librery for Android 2.3+ that provide us a screen that shows others applications made by the developer who integrate it, with aim to do cross promotion.

[![img1](https://raw.githubusercontent.com/androidsx/our-other-apps/master/images-readme/readmephoto.png)]()

You can see the <a href="https://github.com/androidsx/our-other-apps/tree/master/SampleProject">source code of an application example</a> in which that library is integrated

Including in your project
-------------------------

In the propertys of the project add the library. 

    android.library.reference.1=../LibraryOurOtherApps

Next, in the AndroidManifest.xml you have to add a new line doing reference to the library activity.

        <activity
            android:name="com.androidsx.libraryourotherapps.AppsActivity"
            android:label="@string/title_activity_apps" >
        </activity>
        


Usage
-------------------------

Using the library is really simple, <a href="https://github.com/androidsx/our-other-apps/tree/master/SampleProject">that example</a> allows you to know how to link the activity apps through a button.

In order to add items into the ListView you need create an ArrayList of App objects.

This is an example for add one item.

    appslist.add(new App(R.drawable.smileys, "Chat Toolkit", "Nuevos smileys, memes,famosos, LOLCats y emoticonos para tu aplicación favorita de chat!","com.androidsx.smileys"));



Licence
-------------------------

