public class CustomerManager {
   private ICustomerDal customerDal;
    public CustomerManager(ICustomerDal customerDal) {
        this.customerDal=customerDal;
    }

    public void add() {
        // iş kodları
        customerDal.add();


    }








//    ICustomerDal customerDal;
//    public void add() {
//        // iş kodları
//        customerDal.add();
//
//
//    }

}
