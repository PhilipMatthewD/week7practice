public class Person {
    private String name;
    private int health;
    public Person(String name, int health) {
        this.name = name;
        this.health = health;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    @Override
    public String toString() {
        return "Person: " +
                "name = " + name + ", " +
                "health = " + health + ".";
    }
    public void attack(Person a){
        if(a.getClass() == Superhero.class){
            a.setHealth(a.getHealth() - 5);
            System.out.println(a.getName() + " lost 5 health to " + this.getName() + "!");
        }else{
            a.setHealth(a.getHealth() - 10);
            System.out.println(a.getName() + " lost 10 health to " + this.getName() + "!");
        }
    }
}
