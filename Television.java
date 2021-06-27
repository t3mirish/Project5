

public class Television extends ServiceCommunicator{

    public Television(String tvServiceName) {
        super("http://api.tvmaze.com/singlesearch/shows?q=" + tvServiceName.replaceAll(" ", "-"));
         //if tvServiceName has more than one word, connect with hyphen
    }

    public static void main(String[] argv) {
        System.out.println(new Television("Blackish").get());
        System.out.println("==================================");

    }
}

