public class OnlineWorker extends Worker{
    public final float internetRate=10;
    public OnlineWorker(String name, String surname, double hourlyRate) {
        super(name, surname, hourlyRate);
    }
    @Override
    public double calculateSalary(double hours){
        double salary = hours * hourlyRate + internetRate;
        return salary;
    }
}



