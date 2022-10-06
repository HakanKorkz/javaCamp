public class CustomerManager  {
    private Customer _customer;
    private ICreditManager _creditManager;
    public CustomerManager(Customer customer,ICreditManager creditManager){
        _customer=customer;
        _creditManager=creditManager;
    }

    public void deleted(){
        System.out.println("Müşteri silindi : ");
    }

    public void GiveCredit(){
        _creditManager.calculate();
        _creditManager.save();
        System.out.println("Kredi Verildi");
    }



}
