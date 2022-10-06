public class Customer {
    public Customer() {
        System.out.println("Müşteri nesnesi başlatıldı");
    }

    private int Id;
    private String Cty;

    private String Phone;

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }


    public String getCty() {
        return Cty;
    }

    public void setCty(String cty) {
        Cty = cty;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}
