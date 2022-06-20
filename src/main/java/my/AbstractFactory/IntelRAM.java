package AbstractFactory;

public class IntelRAM implements RAM
{
    private String ramName;
    private int ramCount;

    public IntelRAM(){
        this.ramName = "Intel";
        this.ramCount = (int)(Math.random()*17)+16;
    }

    @Override
    public String creatorName() {
        return ramName;
    }

    @Override
    public int countRAM() {
        return ramCount;
    }

    @Override
    public String toString() {
        return ramName + " : " + ramCount + " GBs of RAM";
    }
}