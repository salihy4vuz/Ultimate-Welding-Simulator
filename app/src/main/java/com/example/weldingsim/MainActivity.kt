package com.example.weldingsim

import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.WebView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    @SuppressLint("SetJavaScriptEnabled")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val webView = findViewById<WebView>(R.id.myWebView)

        // Javascript'in çalışması için izin veriyoruz (Hesaplamalar için şart)
        webView.settings.javaScriptEnabled = true

        // Dosyamızı çağırıyoruz
        webView.loadUrl("file:///android_asset/TigMigAyar.html")
    }
}