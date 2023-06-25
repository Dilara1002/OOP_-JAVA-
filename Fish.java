public class Fish extends Animal implements Swimmable{
        @Override
        void move(){
            System.out.println("Fish moves");
        }
        @Override
        public void swim(){
            System.out.println("Fish swims");
        }
}
