package ChainOfResponsibility;


public class LineChecker {

    private static LineChecker lineChecker;
    private LineChecker(){}

    public static LineChecker getInstance() {
        if(lineChecker == null){
            lineChecker = new LineChecker();
        }
        return lineChecker;
    }

    public void isRegular(String line){
        Container container = new Container();
        ChainOfResponsibility lengthHandler = new LengthHandler();
        CaseHandler caseHandler = new CaseHandler();
        PalindromeHandler palindromeHandler = new PalindromeHandler();

        container.add(caseHandler);
        container.add(lengthHandler);
        container.add(palindromeHandler);
        container.start(line);
    }
}
