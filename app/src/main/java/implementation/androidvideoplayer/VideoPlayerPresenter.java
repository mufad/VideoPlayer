package implementation.androidvideoplayer;

import android.content.Context;

public class VideoPlayerPresenter implements VideoPlayerContract.presenter {

    private Context mContext;
    private VideoPlayerContract.view mView;

    public VideoPlayerPresenter(Context mContext, VideoPlayerContract.view mView) {
        this.mContext = mContext;
        this.mView = mView;
    }

    @Override
    public void initPresenter() {
        mView.initViews();
    }

    @Override
    public void getVideo(Video video) {
        if (video.isAvailable()) {
            mView.playVideo(video.getVideoUrl());
        }
    }
}
