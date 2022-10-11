public class Main {
  
    public static void main(String[] args) {
        Employee nimi = new Employee("Nimi", "Assistant Manager");
        Employee pus = new Employee("Pus","CEO");
        Employee magna = new Employee("Magna", "Renholder");

        System.out.println("Headcount: "+Employee.getHiredCount());
    }
  
}
