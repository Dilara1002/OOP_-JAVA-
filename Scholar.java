public class Scholar extends Worker{

    public String department,job;
    public String[] classes;

    public Scholar(String name,String surname,int phone,String email,String department,String job, String[] classes){
        super( name,surname,phone, email);
        this.department=department;
        this.job=job;
        this.classes=classes;
    }
    public void enter_class(){
        System.out.println("Entered The Class");
    }
}
