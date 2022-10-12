import java.util.Objects;

public class Person {
  
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(Person source) {
        this.name = source.name;
        this.age = source.age;
    }

    public String getName() {
        return name;
    }

    public int getAge(){
        return age;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }
        if(!(obj instanceof Person)){
            return false;
        }

        Person person = (Person)obj;
        return ((this.name.equals(person.getName())) && (this.age == person.getAge()));
    }

    @Override
    public int hashCode(){
        return Objects.hash(name,age);
    }


    @Override
    public String toString() {
        return ("age: "+this.age+" name: "+this.name);
    }
}
