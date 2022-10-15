package models;

public class Employee {
    private String name;
    private String position;

    public Employee(String name, String position) {
        if(name == null || name.isBlank() || position == null || position.isBlank()){
            throw new IllegalArgumentException("Name or position cannot be null or blank.");
        }
        this.name = name;
        this.position = position;
    }
    public Employee(Employee source) {
        this.name = source.name;
        this.position = source.position;
    }

    public String getName() {
        return name;
    }
    
    public String getPosition() {
        return position;
    }

    public String toString() {

        return "\tName: " + name + "\tPosition: " + this.position + "\n";
    }
}
