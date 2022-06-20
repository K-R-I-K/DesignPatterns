package Strategy;

public class StrategyDemo
{
    public static void main(String[] args) {

        Strategic<String> strategic1 = new StrategyAddition();
        Strategic<String> strategic2 = new StrategySubtraction();
        Strategic<String> strategic3 = new StrategyMultiplication();
        Strategic<String> strategic4 = new StrategyDivision();

        int a = 20;
        int b = 10;

        Strategy strategy = new Strategy(strategic1);
        System.out.println("Strategy 1 - " + strategy.executeStrategy(a,b));

        strategy.setStrategy(strategic2);
        System.out.println("Strategy 2 - " + strategy.executeStrategy(a,b));

        strategy.setStrategy(strategic3);
        System.out.println("Strategy 3 - " + strategy.executeStrategy(a,b));

        strategy.setStrategy(strategic4);
        System.out.println("Strategy 4 - " + strategy.executeStrategy(a,b));
    }
}