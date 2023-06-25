
class ChiefEngineer extends Worker{
    public ChiefEngineer(String name, int hour) {
        super(name, hour);
        this.wage = 20;
    }
    @Override
    int Salary() {
        return this.hour * wage * 2 +
                super.baseSalary();
    }
}