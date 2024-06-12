import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanning = new Scanner(System.in);
        System.out.println("Please enter your Verbrauch auf 100km");

        double verbrauch = scanning.nextDouble();
        System.out.println("Der Verbrauch ist:" + verbrauch);

        System.out.println("Please enter the Strecke in km");
        double strecke =scanning.nextDouble();
        System.out.println("Die laenge Ihrer Strecke ist :" + strecke);

        System.out.println("Please enter how often you drive this route per week: ");
        int anzahl = scanning.nextInt();
        System.out.println("Die haufigkeit pro Woche betraegt:" + anzahl);

        scanning.close();

        double literpreis = 1.8;

        double streckenpreis_einmalig = (strecke/100)*verbrauch*literpreis;

        double streckenpreis_beide = streckenpreis_einmalig*2;

        double im_monat = streckenpreis_beide*4*anzahl;

        double im_jahr = im_monat*12;

        double steuern = strecke*2*anzahl*4*12*0.3;

        if (steuern > 840){
            steuern = 840;
        }

        double kosten_km = (verbrauch*literpreis)/100;

        System.out.println("Kosten pro km: " + kosten_km);
        System.out.println("Kosten pro Strecke :" + streckenpreis_einmalig);
         System.out.println("Kosten fuer beide Strecken :" + streckenpreis_beide); 
         System.out.println("Kosten im Monat :" + im_monat);
         System.out.println("Kosten im Jahr :" + im_jahr);
         System.out.println("Steuerlich absetzbar (30ct pro km): " + steuern +"(max. 840)");
    }
}
