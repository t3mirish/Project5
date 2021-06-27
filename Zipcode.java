

public class Zipcode extends ServiceCommunicator{


    public Zipcode(String Zipcode) {//constructor
        super("http://api.zippopotam.us/us/" + Zipcode);

    }

    public static void main(String[] argv) {
        System.out.println(new Zipcode("10011").get());
        System.out.println("==================================");
    }
}
