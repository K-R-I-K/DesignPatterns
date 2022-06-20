package AbstractFactory;

public class Intel implements AbstractFactory
{
    @Override
    public VideoCard createVideoCard() {
        return new VideoCardIntel();
    }

    @Override
    public CPU createCPU() {
        return new IntelCPU();
    }

    @Override
    public RAM createRAM() {
        return new IntelRAM();
    }
}