package Composite;

class ComplexObject implements Component {

    private ComplexObject complexObject;
    private SimpleObject simpleObject;

    ComplexObject(SimpleObject simpleObject){
        this.simpleObject = simpleObject;
    }

    public ComplexObject(ComplexObject complexObject) {
        this.complexObject = complexObject;
    }

    public ComplexObject getComplexObject() {
        return complexObject;
    }

    public SimpleObject getSimpleObject() {
        return simpleObject;
    }

    @Override
    public int execute() {
        int result = 0;
        while (complexObject != null ||
                simpleObject != null){
            if(simpleObject != null){
                System.out.println("   - " + simpleObject.getComponents() +
                        " = " + simpleObject.getComponents().getPrice());
                result += simpleObject.getComponents().getPrice();
            }
            if (complexObject != null){
                this.simpleObject = complexObject.simpleObject;
                this.complexObject = complexObject.complexObject;
            } else {
                break;
            }
        }
        return result;
    }
}
