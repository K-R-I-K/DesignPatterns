package Iterator;

public class IteratorPatternDemo
{
    public static void main(String[] args) {

        int start = 1;
        int finish = 25;

        for(int i : IteratorPattern.startFinish(start,finish)){
            if(i == start)
                System.out.println(i + " - start");
            else if(i == finish)
                System.out.println(i + " - finish");
            else
                System.out.println(i);
        }

    }
}