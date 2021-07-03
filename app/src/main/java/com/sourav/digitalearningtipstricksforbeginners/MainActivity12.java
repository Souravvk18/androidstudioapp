package com.sourav.digitalearningtipstricksforbeginners;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity12 extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main12);
        getSupportActionBar().setTitle("Coding & Programming");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        webView=findViewById(R.id.webView4);

        int position=getIntent().getIntExtra("story_key",0);
        webView.getSettings().setBuiltInZoomControls(true);
        webView.getSettings().setDisplayZoomControls(false);

        if (position==0){
            webView.loadUrl("file:///android_asset/proglanguage.html");
        }

        else if (position==1){
            webView.loadUrl("file:///android_asset/bewebdev.html");
        }

        else if (position==2){
            webView.loadUrl("file:///android_asset/webdev.html");
        }

        else if (position==3){
            webView.loadUrl("file:///android_asset/resources.html");
        }

        else if (position==4){
            webView.loadUrl("file:///android_asset/ethical.html");
        }

        else if (position==5){
            webView.loadUrl("file:///android_asset/machine.html");
        }

        else if (position==6){
            webView.loadUrl("file:///android_asset/learnexcel.html");
        }

        else if (position==7){
            webView.loadUrl("file:///android_asset/frontend.html");
        }

        else if (position==8){
            webView.loadUrl("file:///android_asset/backend.html");
        }

        else if (position==9){
            webView.loadUrl("file:///android_asset/gaming.html");
        }

        else if (position==10){
            webView.loadUrl("file:///android_asset/webcode.html");
        }

        else if (position==11){
            webView.loadUrl("file:///android_asset/appdevelop.html");
        }

        else if (position==12){
            webView.loadUrl("file:///android_asset/soft.html");
        }

        else if (position==13){
            webView.loadUrl("file:///android_asset/smartprog.html");
        }

        else if (position==14){
            webView.loadUrl("file:///android_asset/techskills.html");
        }


    }
}