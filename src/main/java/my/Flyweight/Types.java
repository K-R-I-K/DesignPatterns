package Flyweight;

public enum Types {

    OAK("oak"),
    MAPLE("maple"),
    BIRCH("birch");

    private String name;

    Types(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
