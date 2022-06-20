package AbstractFactory;

public class AMD implements AbstractFactory
{

    @Override
    public VideoCard createVideoCard() {
        return new VideoCardAMD();
    }

    @Override
    public CPU createCPU() {
        return new AMDCPU();
    }

    @Override
    public RAM createRAM() {
        return new AMDRAM();
    }
}