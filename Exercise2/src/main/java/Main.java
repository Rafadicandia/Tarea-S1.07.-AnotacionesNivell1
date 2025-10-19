public class Main {
    public static void main(String[] args) {

        Worker w1 = new Worker("Jhon", "Jhonson", 40.6);
        OnlineWorker w2 = new OnlineWorker("Samuel", "L. Jackson", 40.6);
        PresentWorker w3 = new PresentWorker("Diego", "De la Vega", 40.6);

        System.out.println(w1.getName()+"'s salary is:" + w1.calculateSalary(100)+"euro");

        System.out.println(w2.getName()+"'s salary is:" + w2.calculateSalary(100)+"euro");

        System.out.println(w3.getName()+"'s salary is:" + w3.calculateSalary(100)+"euro");


        @SuppressWarnings("deprecation")
        System.out.println(w3.getName()+"'s salary is:" + w3.calculateSalaryPecetas(100)+"peceta");

    }
}
