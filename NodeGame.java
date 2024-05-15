public class NodeGame {
    String pertanyaan;
    String jawaban;
    NodeGame next;

    NodeGame(String pertanyaan, String jawaban) {
        this.pertanyaan = pertanyaan;
        this.jawaban = jawaban;
        this.next = null;
    }
}

