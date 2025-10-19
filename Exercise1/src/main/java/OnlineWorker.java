public class OnlineWorker extends Worker{
    public final float internetRate=10;
    public OnlineWorker(String name, String surname, float hourlyRate) {
        super(name, surname, hourlyRate);
    }
    @Override
    public float calculateSalary(float hours){
        float salary = hours * super.hourlyRate;
        return salary;
    }
}



