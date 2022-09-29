package models;

public class Store {
    Employee[] employees;

    public Store() {
        employees = new Employee[3];
    }

    public void setEmployees(int index, Employee employee) {
        this.employees[index] = new Employee(employee);
    }

    public void open() {
        for(int i=0; i<employees.length;i++){
            if(employees[i] == null){
                throw new IllegalStateException("The store cannot be opened unless it is staffed by three employees.");
            }
        }
        System.out.println("We're open for business!");
    }

    public String toString() {
        String temp = "";
        for (int i = 0; i < employees.length; i++) {
            temp += employees[i] != null ? employees[i].toString() : "";
            temp += "\n";
        }
        return temp;
    }

}
