public class Main {
    public static void main(String[] args) {

        CustomerManager customerManager=new CustomerManager(new Customer(),new TeacherCreditManager());
        customerManager.GiveCredit();

        System.out.println("----------------------İnterfece örneği son--------------------------");


    }
}