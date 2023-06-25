package interfacepackage;
public class PartTimeEmployee extends Employee {
    int hours;
        PartTimeEmployee(String name,double wage,int hours){
            super(name, wage);
            this.hours=hours;
        }
        public double computeSalary(){
            return wage*hours;
        }
}
