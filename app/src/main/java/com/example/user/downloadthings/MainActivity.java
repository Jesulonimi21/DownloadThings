package com.example.user.downloadthings;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
DownloadManager downloadManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    public  void download(View v){
        downloadManager=(DownloadManager) getSystemService(Context.DOWNLOAD_SERVICE);
        Uri uri=Uri.parse("https://firebasestorage.googleapis.com/v0/b/gliadeworks-e6864.appspot.com/o/ImageMessage%2FoLyBLYrhvOYCHxfusQL9fbGjn4u2February%2013%2C2019%2012%3A58%3A41%20PM1550061954059.mp3?alt=media&token=4423c14e-b852-40f6-aa33-e3780d720f2f");
        DownloadManager.Request request=new DownloadManager.Request(uri);
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE);
        request.setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED);
        long reference=downloadManager.enqueue(request);
    }
}
