package regression;

public class Car extends Vehicle {
    protected int name;
    protected void stopping(){
        System.out.println("This is stopping from Car class");
    }

    public void stopping(String firstName){
        System.out.println("This is stopping from Car class with Name: " + firstName);
    }

    public void stopping(String firstName, int age){
        System.out.println("This is stopping from Car class with Name: " + firstName + " AND the age: " + age);
    }

    public void running(){
        System.out.println("This is running from Car class");
    }

    public void viewName(){
        System.out.println("Car name: " + name);
    }
}
