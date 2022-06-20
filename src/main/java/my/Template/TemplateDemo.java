package Template;

public class TemplateDemo
{
    public static void main(String[] args) {
        Template character = new Killer(5,7,4);
        character.attack();
        character.heal();
        character.move();
        character.characterHP();

        System.out.println("----------------------");
        character = new Healer(4,5,17);
        character.attack();
        character.heal();
        character.move();
        character.characterHP();
    }
}