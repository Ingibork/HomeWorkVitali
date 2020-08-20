package habr;


public class MobilePhone {

    String model;
    String brand;
    int price;
    int releasedate;

    public static void main(String[] args) {
        MobilePhone mobile = new MobilePhone();

        mobile.price = 1000;
        mobile.model = "S8";
        mobile.releasedate = 2017;
        mobile.brand = "Samsung";

        System.out.println(mobile.brand + " " + mobile.model + " " + mobile.releasedate + " " + mobile.price + "$");
    }

}




