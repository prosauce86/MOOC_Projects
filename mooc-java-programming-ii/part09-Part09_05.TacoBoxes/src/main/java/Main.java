
public class Main {

    public static void main(String[] args) {
        // Test your code here!
        TripleTacoBox tacoBox = new TripleTacoBox();
        System.out.println(tacoBox.tacosRemaining());
        tacoBox.eat();
        tacoBox.eat();
        System.out.println(tacoBox.tacosRemaining());
        tacoBox.eat();
        System.out.println(tacoBox.tacosRemaining());

        CustomTacoBox tacos = new CustomTacoBox(10);
        tacos.eat();
        tacos.eat();
        System.out.println(tacos.tacosRemaining());
    }
}