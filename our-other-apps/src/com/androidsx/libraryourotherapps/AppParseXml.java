package com.androidsx.libraryourotherapps;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import android.util.Xml;

public class AppParseXml {

    private static final String ns = null;
    private XmlPullParser parser;
    
    public AppParseXml(InputStream in) throws XmlPullParserException, IOException{
        
        parser = Xml.newPullParser();
        parser.setFeature(XmlPullParser.FEATURE_PROCESS_NAMESPACES, false);
        parser.setInput(in, null);
        parser.nextTag();       
    }

    public ArrayList<App> readAplications() throws XmlPullParserException, IOException {
        
        ArrayList<App> entries = new ArrayList<App>();

        parser.require(XmlPullParser.START_TAG, ns, "applications");
        while (parser.next() != XmlPullParser.END_TAG) {
            if (parser.getEventType() != XmlPullParser.START_TAG) {
                continue;
            }
            String name = parser.getName();

            if (name.equals("app")) {
                entries.add(readApp());
            } else {
                skip();
            }
        }
        return entries;
    }

    private App readApp() throws XmlPullParserException, IOException {
        parser.require(XmlPullParser.START_TAG, ns, "app");
        String title = null;
        String description = null;
        String packagename = null;
        String iconID = null;
        while (parser.next() != XmlPullParser.END_TAG) {
            if (parser.getEventType() != XmlPullParser.START_TAG) {
                continue;
            }
            String name = parser.getName();
            if (name.equals("icon")) {
                iconID = readIcon();
            } else if (name.equals("title")) {
                title = readTitle();
            } else if (name.equals("description")) {
                description = readDescription();
            } else if (name.equals("packagename")){
                packagename = readPackageName();
            }else{
                skip();
            }
        }
        return new App(iconID, title, description, packagename);
    }

    private String readTitle() throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, ns, "title");
        String title = readText();
        parser.require(XmlPullParser.END_TAG, ns, "title");
        return title;
    }

    private String readDescription() throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, ns, "description");
        String description = readText();
        parser.require(XmlPullParser.END_TAG, ns, "description");
        return description;
    }
    
    private String readPackageName() throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, ns, "packagename");
        String packagename = readText();
        parser.require(XmlPullParser.END_TAG, ns, "packagename");
        return packagename;
    }
    
    private String readIcon() throws IOException, XmlPullParserException {
        parser.require(XmlPullParser.START_TAG, ns, "icon");
        String iconID = readText();
        parser.require(XmlPullParser.END_TAG, ns, "icon");
        return iconID;
    }

    private String readText() throws IOException, XmlPullParserException {
        String result = "";
        if (parser.next() == XmlPullParser.TEXT) {
            result = parser.getText();
            parser.nextTag();
        }
        return result;
    }
    
    private void skip() throws XmlPullParserException, IOException {
        if (parser.getEventType() != XmlPullParser.START_TAG) {
            throw new IllegalStateException();
        }
        int depth = 1;
        while (depth != 0) {
            switch (parser.next()) {
            case XmlPullParser.END_TAG:
                depth--;
                break;
            case XmlPullParser.START_TAG:
                depth++;
                break;
            }
        }
     }

}
