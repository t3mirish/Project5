import java.util.Scanner;

public class QueryApp {
    public static void main(String[] args) { // main method
        String input = "Y";
        Scanner reader = new Scanner(System.in); //this is your reader
        ServiceCommunicator service = null;

        do {
            System.out.println("to query for Zipcode, type 1");
            System.out.println("to query for television show, type 2");
            System.out.println("to query for song name, type 3");
            int choice = Integer.parseInt(reader.nextLine());
            if (choice < 1 || choice > 3) {

                continue;
            }
            if (choice == 1 ) {
                System.out.println("Please enter the Zipcode");
                input = reader.nextLine();
                service = new Zipcode(input);

            }

            else if (choice == 2) {
                System.out.println("Please enter the TV show name or episode");
                input = reader.nextLine();
                service = new Television(input);
            }

            else if (choice ==3) {
                System.out.println("Please enter the song title or artist name");
                input = reader.nextLine();
                service = new Music(input);

            }
            input = service.get();
            if (input.length()> 0) {
                System.out.println("The result of your query is " + input);
            }
            else {
                System.out.println("There is no result for your query");

            }
            System.out.println("Do you want to continue? Y/N?");
            input = reader.nextLine();
        }
        while(input.equalsIgnoreCase("Y"));
    }
}
