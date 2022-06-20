package State;

public class MaterialObject {
    private State state;

    public MaterialObject(State state){
        this.state = state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public boolean isGaseous(){
        if (state.getStateName().equals("Gaseous")){
            return true;
        }
        return false;
    }

    public boolean isSolid(){
        if (state.getStateName().equals("Solid")){
            return true;
        }
        return false;
    }

    public boolean isLiquid(){
        if (state.getStateName().equals("Liquid")){
            return true;
        }
        return false;
    }

    public void throwAnObject(){
        if(state.takeInHand()){
            System.out.println("This object can be thrown");
        } else {
            System.out.println("This object can't be thrown");
        }
    }

    public void pourItOut(){
        if(state.drink()){
            System.out.println("This object can be poured out");
        } else {
            System.out.println("This object can't be poured out");
        }
    }

    public void smellIt(){
        if(state.smell()){
            System.out.println("This object can be smelled");
        } else {
            System.out.println("This object can't be smelled");
        }
    }
}
