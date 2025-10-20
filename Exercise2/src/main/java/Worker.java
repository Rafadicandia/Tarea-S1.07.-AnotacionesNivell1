public class Worker {

    private String name;
    private String surname;
    protected double hourlyRate;

public Worker(String name, String surname, double hourlyRate){
    if (name==(null)){
        throw new IllegalArgumentException("The name of the product can't be null");
    }

    if (name.isBlank()){
        throw new IllegalArgumentException("The name of the product can't be empty");
    }

    if (surname==(null)){
        throw new IllegalArgumentException("The name of the product can't be null");
    }

    if (surname.isBlank()){
        throw new IllegalArgumentException("The name of the product can't be empty");
    }

    if (hourlyRate<=0){
        throw new IllegalArgumentException("Hourly rate can't be negative or zero");
    }
    this.name = name;
    this.surname = surname;
    this.hourlyRate = hourlyRate;
}
    public double calculateSalary(double hours){
        double salary = hours * hourlyRate;
        return salary;
}
public String getName(){
    return name;
}
}
