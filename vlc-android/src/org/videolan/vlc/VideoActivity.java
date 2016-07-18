package org.videolan.vlc;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

import org.videolan.vlc.media.MediaUtils;

/**
 * Created by Administrator on 2016/7/18.
 */
public class VideoActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_play);

        final EditText etvideoPath = (EditText) findViewById(R.id.etVideoPath);
        final EditText etvideoTitle = (EditText) findViewById(R.id.etVideoTitle);

        findViewById(R.id.btnPlay).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String path = etvideoPath.getText().toString().trim();
                if(TextUtils.isEmpty(path)) {
                    path = "http://mvvideo1.meitudata.com/578c3d0e800494727.mp4";
                }
                MediaUtils.openStream(VideoActivity.this, path, etvideoTitle.getText().toString().trim());
            }
        });
    }
}
