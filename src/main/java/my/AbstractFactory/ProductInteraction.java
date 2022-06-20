package AbstractFactory;

public class ProductInteraction
{
    private static ProductInteraction productInteraction;
    private AbstractFactory abstractFactory;
    private CPU cpu;
    private VideoCard videoCard;
    private RAM ram;

    private ProductInteraction(){}

    public static ProductInteraction getInstance(){
        if(productInteraction == null){
            productInteraction = new ProductInteraction();
        }
        return productInteraction;
    }

    public void createFactory(String manufacturer){
        if(manufacturer.equals("AMD") && !(abstractFactory instanceof AMD) ){
           abstractFactory = new AMD();
           cpu = null;
           videoCard = null;
           ram = null;
           System.out.println(" -> AMD factory crated");
        } else if(manufacturer.equals("Intel") && !(abstractFactory instanceof Intel)) {
            abstractFactory = new Intel();
            cpu = null;
            videoCard = null;
            ram = null;
            System.out.println(" -> Intel factory crated");
        }
    }

    public AbstractFactory getAbstractFactory(){
        return abstractFactory;
    }

    public void createCPU(){
        if(abstractFactory == null){
            System.out.println("First of all create factory (Intel or AMD)");
        } else {
            cpu = abstractFactory.createCPU();
            System.out.println("CPU created = " + cpu);
        }
    }

    public CPU getCPU(){
        return cpu;
    }

    public void createVideoCard(){
        if(abstractFactory == null){
            System.out.println("First of all create factory (Intel or AMD)");
        } else {
            videoCard = abstractFactory.createVideoCard();
            System.out.println("Video card created = " + videoCard);
        }
    }

    public VideoCard getVideoCard(){
        return videoCard;
    }

    public void createRAM(){
        if(abstractFactory == null){
            System.out.println("First of all create factory (Intel or AMD)");
        } else {
            ram = abstractFactory.createRAM();
            System.out.println("RAM created = " + ram);
        }
    }

    public RAM getRAM(){
        return ram;
    }

}