package implementation.androidvideoplayer;

public class VideoPlayerContract {

    interface view {
        void initViews();

        void playVideo(String url);

        void forward();

        void rewind();

    }

    interface presenter {
        void initPresenter();

        void getVideo(Video video);
    }
}
