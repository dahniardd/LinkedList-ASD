import java.util.Scanner;

public class ScavengerHunt {
    NodeGame head;
    NodeGame tail;

    public ScavengerHunt() {
        this.head = null;
        this.tail = null;
    }
    public void addPoint(String pertanyaan, String jawaban) {
        NodeGame newNode = new NodeGame(pertanyaan, jawaban);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }
    public void startHunt() {
        Scanner scanner = new Scanner(System.in);
        NodeGame current = head;
        while (current != null) {
            System.out.println(current.pertanyaan);
            String userJawaban = scanner.nextLine();
            if (userJawaban.equalsIgnoreCase(current.jawaban)) {
                System.out.println("Benar! Silahkan lanjut ke pertanyaan selanjutnya.");
                current = current.next;
                if (current == null) {
                    System.out.println("Selamat! Kamu telah menemukan Treasure!");
                }
            } else {
                System.out.println("Jawabanmu salah. Ayo coba lagi.");
            }
        }
        scanner.close();
    }
}
