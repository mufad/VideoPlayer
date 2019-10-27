package implementation.androidvideoplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity implements VideoPlayerContract.view {

    private VideoPlayerContract.presenter videoPresenter;
    private ImageButton btnPlay, btnForward, btnRewind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        videoPresenter = new VideoPlayerPresenter(this, this);
        videoPresenter.initPresenter();
    }

    @Override
    public void initViews() {
        setContentView(R.layout.activity_main);
        loadVideo();

        btnPlay = findViewById(R.id.btn_play);
        btnForward = findViewById(R.id.btn_forward);
        btnRewind = findViewById(R.id.btn_rewind);
    }

    @Override
    public void playVideo(String url) {
        //Video Playing functionality will be handled here
    }

    @Override
    public void forward() {

        //Video Forwarding functionality will be handled here
    }

    @Override
    public void rewind() {

        //Video Rewinding functionality will be handled here
    }

    private void loadVideo() {
        Video video = new Video("Learning Kotlin", "https://youtube.com/asf23543", 60, true);
        videoPresenter.getVideo(video);
    }
}
