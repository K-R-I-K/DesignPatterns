package my.AbstractFactory;

public class VideoCardAMD implements VideoCard
{
    private String videoCardName;
    private int videoMemory;

    public VideoCardAMD(){
        this.videoCardName = "AMD";
        this.videoMemory = (int)(Math.random()*17)+16;
    }

    @Override
    public String creatorName() {
        return videoCardName;
    }

    @Override
    public int countVideoMemory() {
        return videoMemory;
    }

    @Override
    public String toString() {
        return videoCardName + " : " + videoMemory + " GBs of video memory";
    }
}