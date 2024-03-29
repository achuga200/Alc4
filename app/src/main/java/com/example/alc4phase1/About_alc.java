package com.example.alc4phase1;

import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebSettings;
import android.os.Bundle;
import android.view.View;
import android.os.Handler;
import android.webkit.SslErrorHandler;
import android.net.http.SslError;


public class About_alc extends AppCompatActivity {

     private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_alc);

        webView = findViewById(R.id.webView);

        webView.loadUrl("https://andela.com/alc/");
        webView.setWebViewClient(new WebViewClient());
        WebSettings webSettings = webView.getSettings();
        webView.clearCache(true);
        webView.getSettings().setDomStorageEnabled(true);
        webSettings.setJavaScriptEnabled(true);

        }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();
        } else {
            super.onBackPressed();
        }
    }
}
