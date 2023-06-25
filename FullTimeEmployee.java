package interfacepackage;
public class FullTimeEmployee extends Employee{
    FullTimeEmployee(String name,double wage){
        super(name,wage);
    }
    public double computeSalary(){
        return wage*10;
    }
}
