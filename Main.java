public class Main {
    public static void main(String[] args) {

        Specialist Andrew = new Specialist("Adrew Wiggins", 34, 3000, 2);
        Specialist Steph = new Specialist("Steph Curry", 32, 3000, 3);
        Specialist Kelly = new Specialist("Kelly Oubre", 30, 5000, 4);

        Developer Lebron = new Developer("Lebron James", 34, 2500, "Upper");
        Developer Anthony = new Developer("Anthony Davis", 30, 3000, "Upper");
        Developer Montrazl = new Developer("Montrazl Harris", 21, 3000, "Upper");
        Developer Shrodder = new Developer("Dennis Shrodder", 28, 1500, "Beginner");

        Manager Michael = new Manager("Michael Jordan", 45, 30000, false);
        Manager Magic = new Manager("Magic Johnson", 46, 60000, true);

        CEO Larry = new CEO("Larry Bird", 50, 75000, true, true);

        Andrew.print();
        Steph.print();
        Kelly.print();
        Lebron.print();
        Anthony.print();
        Montrazl.print();
        Shrodder.print();
        Michael.print();
        Magic.print();
        Larry.print();

        System.out.println(" ");
        System.out.println("Unique programs begin below:");

        Specialist.workWithClients();
        Developer.writeCode();
        Manager.writeProcedures();
        CEO.goPublic();

        //I've developed Linux for the world

    }
}
