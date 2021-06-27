public class Music extends ServiceCommunicator{//this is a subclass

    public Music(String songTitle) {
        super("https://itunes.apple.com/search?term=" + songTitle.replaceAll(" ", "-") + "&limit=1" );
    }

    public static void main(String[] argv) {
        System.out.println(new Music ("All of Me").get());
        System.out.println("==================================");

    }

}
