public class Manager extends Employee {
    private boolean hasStocks;

    public Manager(String fio, int age, int salary, boolean hasStocks) {
        super(fio, age, salary);
        this.hasStocks = hasStocks;
    }

    public Manager() {
    }

    public Manager(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }

    public boolean isHasStocks() {
        return hasStocks;
    }

    public void setHasStocks(boolean hasStocks) {
        this.hasStocks = hasStocks;
    }

    static void writeProcedures(){
        System.out.println("I'm done with procedures");
    }

    @Override
    public void print() {
        super.print();
        System.out.println("Has stocks: " + hasStocks);
    }
}
