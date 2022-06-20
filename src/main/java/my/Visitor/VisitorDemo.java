package Visitor;

public class VisitorDemo {
    public static void main(String[] args) {
        House house = new House("Main house",10000);
        Museum museum = new Museum("Main museum", 200000);

        PersonVisit personVisit = new PersonVisit();
        System.out.println(personVisit.allAttractions(house,museum));
    }
}
