package AbstractFactory;

public class IntelCPU implements CPU
{
    private String cpuName;
    private int cores;

    public IntelCPU(){
        this.cpuName = "Intel";
        this.cores = (int)(Math.random()*8)+1;
    }

    @Override
    public String creatorName() {
        return cpuName;
    }

    @Override
    public int coreCount() {
        return cores;
    }

    @Override
    public String toString() {
        return cpuName + " : " + cores + " core(s)";
    }
}