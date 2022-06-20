package ChainOfResponsibility;

public class CaseHandler extends ChainOfResponsibility {

    @Override
    public boolean checkWordsCount(String line) {
        for (int i=0;i<line.length();i++){
            if (!(line.charAt(i) >= 97 && line.charAt(i) <= 122)){
                System.out.println("Low case check failed...");
                return false;
            }
        }
        System.out.println("Low case check completed...");
        return true;
    }
}
