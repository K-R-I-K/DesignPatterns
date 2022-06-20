package Visitor;

public class PersonVisit implements Visitor {

    public StringBuilder allAttractions(Building... building){
        StringBuilder temp = new StringBuilder();
        for (Building building1 : building){
            temp.append(building1.visit(this));
            temp.append("\n");
        }
        return temp;
    }

    @Override
    public String visitMuseum(Museum museum) {
        return "Person is visiting museum...";
    }

    @Override
    public String visitHouse(House house) {
        return "Person is staying at home...";
    }
}
