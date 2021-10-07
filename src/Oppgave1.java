import static javax.swing.JOptionPane.*;

public class Oppgave1 {
    public static void main(String[] args) {
        int sumKilometer = 0;
        double sumBensin = 0;
        int innKilometer = Integer.parseInt(showInputDialog("Oppgi antall kilometer: "));
        double innBensin = Double.parseDouble(showInputDialog("Oppgi bensinmengde brukt: "));
        while (innKilometer > 0) {
            sumKilometer += innKilometer;
            sumBensin += innBensin;
            innKilometer = Integer.parseInt(showInputDialog("Oppgi antall kilometer, avslutt med 0"));
            innBensin = Double.parseDouble(showInputDialog("Oppgi bensinmengde brukt, avslutt med 0"));
        }
        int mil = sumKilometer / 10;
        double gjennomsnitt = sumBensin / mil; //Husk da at bensin deles på mil og ikke omvendt
        System.out.println("Total km kjørt = "+sumKilometer+" total bensinforbruk total = "+sumBensin);
        System.out.println("Snittforbruket per mil er: "+gjennomsnitt);
    }
}
