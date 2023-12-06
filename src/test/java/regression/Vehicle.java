package regression;

public class Vehicle {
    protected int size;
    protected int name;
    protected void stopping(){
        System.out.println("This is stopping from Vehicle class");
    }

    public void stopping(String firstName){
        System.out.println("This is stopping from Vehicle class with Name: " + firstName);
    }

    public void stopping(String firstName, int age){
        System.out.println("This is stopping from Vehicle class with Name: " + firstName + " AND the age: " + age);
    }

    public void fixing(){
        System.out.println("This is fixing from Vehicle class");
    }
}
