class Desktop extends Computer{
    int id;
    int memorySize;
    public Desktop(int year, String model) {
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