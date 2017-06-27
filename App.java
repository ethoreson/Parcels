import java.io.Console;
import java.util.Array;
import java.util.ArrayList;

public class App {
  public static void main(String[] args) {
    Console myConsole = System.console();

    List<Parcel> allParcels = new ArrayList<Parcel>();
    boolean programRunning = true;

    while (programRunning) {
      System.out.println("~~~~~~~~~~~~~~~~~");
      System.out.println("This is Emilie's Parcel Shipment Service. Would you like to 'Add a Parcel', 'View Shopping Cart', or 'Ship Order':");
      String navigationChoice = myConsole.readLine();

      if (navigationChoice.equals("Add a Parcel")) {
        System.out.println("Let's enter your package's info so we can calculate a cost.");
        System.out.println("Who is the package addressed to?");
        String userSendTo = myConsole.readLine();
        System.out.println("What is the package's length, in inches?");
        int userLength = Integer.parseInt(myConsole.readLine());
        System.out.println("What is the package's width, in inches?");
        int userWidth = Integer.parseInt(myConsole.readLine());
        System.out.println("What is the package's height, in inches?");
        int userHeight = Integer.parseInt(myConsole.readLine());
        System.out.println("What is the package's weight, in pounds?");
        int userWeight = Integer.parseInt(myConsole.readLine());

        Parcel userParcel = new Parcel(userSendTo, userLength, userWidth, userHeight, userWeight);
        allParcels.add(userParcel);
        int parcelTotal = 0;
        int volumeTotal = userParcel.calculateVolume(userLength, userWidth, userHeight);
        int initialTotal = userParcel.costToShip(volumeTotal, userWeight);
        parcelTotal += initialTotal;

        System.out.println("Would you like to pay for 2-day shipping? Only $6! Yes or No:");
        String twoDayYesOrNo = myConsole.readLine();
        if twoDayYesOrNo.equals("Yes") {
          parcelTotal += 6;
        }

        System.out.println("Would you like the parcel gift-wrapped? Only $2! Yes or No:");
        String giftWrappedYesOrNo = myConsole.readLine();
        if giftWrappedYesOrNo.equals("Yes") {
          parcelTotal += 2;
        }



      } else if ((navigationChoice.equals("View Shopping Cart")) && !allParcels.isEmpty()) {
        for (Parcel eachParcel : allParcels ) {
          System.out.println("------------");
          System.out.println("Package being sent to" + eachParcel.mName );
          System.out.println("Total Cost:" + )
        }
      }
    }
  }
}
