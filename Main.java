public class Main {
    public static void main(String[] args) {
        Fish f=new Fish();
        Duck d=new Duck();

        Animal[] animals={f,d};
        for (Animal animal:animals){
            if(animal instanceof Swimmable){
                ((Swimmable)animal).swim();
            }
        }
        for (Animal animal:animals){
            if(animal instanceof Flyable){
                ((Flyable)animal).fly();
            }
        }
        for (Animal animal:animals){
            animal.move();
        }
    }
}