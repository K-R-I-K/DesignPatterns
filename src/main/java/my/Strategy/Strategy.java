package Strategy;

// It is a behavioral design pattern that defines a family of similar algorithms
// and places each in its own classroom. After that, the algorithms can be replaced
// one by one directly during program execution.

public class Strategy
{
    private Strategic strategic;
    Strategy(Strategic strategic){
        this.strategic = strategic;
    }

    public void setStrategy(Strategic strategic) {
        this.strategic = strategic;
    }

    public String executeStrategy(int a, int b){
        return (String) this.strategic.execute(a,b);
    }
}

class StrategyAddition implements Strategic<String>
{
    @Override
    public String execute(int a, int b) {
        return "Addition : " + a + " + " + b + " = " + (a+b);
    }
}

class StrategySubtraction implements Strategic<String>
{
    @Override
    public String execute(int a, int b) {
        return "Subtraction : " + a + " - " + b + " = " + (a-b);
    }
}

class StrategyMultiplication implements Strategic<String>
{
    @Override
    public String execute(int a, int b) {
        return "Multiplication : " + a + " * " + b + " = " + (a*b);
    }
}

class StrategyDivision implements Strategic<String>
{
    @Override
    public String execute(int a, int b) {
        return "Division : " + a + " / " + b + " = " + (a/b);
    }
}

interface Strategic<Type>
{
    public <Type> Type execute(int a, int b);
}