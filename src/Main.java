public class Main {
    public static void main(String[] args) {
        Storm monday = new Storm(39.905921, 89, -83.066559, Direction.SOUTH);
        Storm tuesday = new Storm();
        ThunderStorm wednesday = new ThunderStorm(69, 3,420, Direction.NORTH, true);
        Sharknado thursday = new Sharknado(1,1,1, Direction.WEST, true, 10);
        System.out.println(Storm.numStorms);
        wednesday.display();
        thursday.display();
        System.out.println("");
        // ^|Is the Practice we did on tuesday|^

        // v|Is the Practice we did on thursday|v
        Person peter = new Person("Peter Griffin", 100);
        Superhero batman = new Superhero("Bruce Wayne", 300, "Batman");
        System.out.println(peter.toString());
        System.out.println(batman.toString());
        batman.attack(peter);
        peter.attack(batman);
        System.out.println(peter.toString());
        System.out.println(batman.toString());
    }
}
