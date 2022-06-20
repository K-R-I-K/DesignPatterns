package ChainOfResponsibility;

public class LengthHandler extends ChainOfResponsibility {

    @Override
    public boolean checkWordsCount(String line) {
        if(line.length() < 10){
            System.out.println("Length check completed...");
            return true;
        }
        System.out.println("Length check failed...");
        return false;
    }
}
