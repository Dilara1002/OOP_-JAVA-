public class Duck extends Animal implements Swimmable,Flyable{
    @Override
    public void swim(){
            System.out.println("Duck swims");
        }
    @Override
    public void fly(){
        System.out.println("Duck flies");
    }
    @Override
    void move(){
        System.out.println("Duck moves");
    }
}
