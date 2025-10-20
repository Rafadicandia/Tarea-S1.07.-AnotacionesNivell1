public class PresentWorker extends Worker{

    private static double gas = 100;


        public PresentWorker(String name, String surname, double hourlyRate) {
            super(name, surname, hourlyRate);
        }
        @Override
        public double calculateSalary(double hours){
            double salary =  super.calculateSalary(hours)+gas;
            return salary;
        }





}
