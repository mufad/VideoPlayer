package implementation.androidvideoplayer;

public class Video {
    private String videoName, videoUrl;
    private int videoLength;
    private boolean isAvailable;

    public Video(String videoName, String videoUrl, int videoLength, boolean isAvailable) {
        this.videoName = videoName;
        this.videoUrl = videoUrl;
        this.videoLength = videoLength;
        this.isAvailable = isAvailable;
    }


    public String getVideoName() {
        return videoName;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public int getVideoLength() {
        return videoLength;
    }

    public boolean isAvailable() {
        return isAvailable;
    }
}
