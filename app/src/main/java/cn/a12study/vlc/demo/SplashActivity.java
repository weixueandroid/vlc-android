package cn.a12study.vlc.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import org.videolan.vlc.gui.MainActivity;

/**
 * Created by Administrator on 2016/8/1.
 */
public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //MediaUtils.openStream(this, "http://mvvideo1.meitudata.com/579f07913f4254431.mp4", "唐唐讲段子");
        startActivity(new Intent(this, MainActivity.class));
    }
}
