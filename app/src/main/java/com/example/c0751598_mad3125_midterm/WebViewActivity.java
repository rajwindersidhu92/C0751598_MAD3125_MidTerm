package com.example.c0751598_mad3125_midterm;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.res.AssetManager;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import java.io.IOException;
import java.io.InputStream;

public class WebViewActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        Intent intent = getIntent();
        String url = intent.getStringExtra("wiki");

        webView = findViewById(R.id.web_view);

        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl(url);

        AssetManager mAssetManager = this.getAssets();
        try
        {
            InputStream mInputStream = mAssetManager.open("test.html");
            int size = mInputStream.available();
            byte[] buffer = new byte[size];
            mInputStream.read(buffer);
            mInputStream.close();
            String content = new String(buffer, "UTF-8");

            Log.d("DATA", content);
            //webView.loadData(content, "text/html", "utf-8");
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}



