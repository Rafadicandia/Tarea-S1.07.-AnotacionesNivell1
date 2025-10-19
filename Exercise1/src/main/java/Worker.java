public class Worker {

    private String name;
    private String surname;
    protected float hourlyRate;

public Worker(String name, String surname, float hourlyRate){
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

    if (hourlyRate<0){
        throw new IllegalArgumentException("Hourly rate can't be negative");
    }
    this.name = name;
    this.surname = surname;
    this.hourlyRate = hourlyRate;
}
    public float calculateSalary(float hours){
        float salary = hours * hourlyRate;
        return salary;
}

}
