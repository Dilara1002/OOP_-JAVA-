public class Item {
    int id;
    String name;
    double price;

    public Item(int id,String name,double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }

    @Override
    public String toString(){
        return String.format("%d %s %f",id,name,price);
    }
}
