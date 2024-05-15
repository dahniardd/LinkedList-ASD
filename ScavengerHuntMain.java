import java.util.Scanner;
public class ScavengerHuntMain {
    public static void main(String[] args) {
        ScavengerHunt game = new ScavengerHunt();
        game.addPoint("Apa nama Ibukota dari Negara Perancis?", "Paris");
        game.addPoint("Berapakah hasil dari 2 + 2?", "4");
        game.addPoint("Apa lagu kebangsaan Negara Indonesia?", "Indonesia Raya");
        game.addPoint("Siapa Presiden pertama Indonesia?", "Ir.Soekarno");
        game.addPoint("Berada di Provinsi manakah kota Surabaya?", "Jawa Timur");

        game.startHunt();
    }
}
