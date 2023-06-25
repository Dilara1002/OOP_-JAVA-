class Laptop extends Computer{
    int memorySize;
    int id;
    public Laptop(int year, String model) {
        super(year, model);
        this.id=counter;
    }
    public void setMemory(int memorySize){
        this.memorySize=memorySize;
    }
    @Override
    public String toString() {
        return id+". "+super.toString()+". Memory:"+memorySize;
    }
}

