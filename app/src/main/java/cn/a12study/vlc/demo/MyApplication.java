package cn.a12study.vlc.demo;

import android.app.Application;

import org.videolan.vlc.media.MediaUtils;

/**
 * Created by Administrator on 2016/9/2.
 */
public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        MediaUtils.init(this);
    }
}
