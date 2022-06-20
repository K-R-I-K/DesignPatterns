package ChainOfResponsibility;

public class ChainOfResponsibilityDemo {
    public static void main(String[] args) {

        LineChecker lineChecker = LineChecker.getInstance();

        lineChecker.isRegular("Apple");
        System.out.println("--------------------");
        lineChecker.isRegular("thermonuclear");
        System.out.println("--------------------");
        lineChecker.isRegular("abba");
    }
}
