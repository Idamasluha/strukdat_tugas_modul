

import java.util.ArrayList;

public class MAIN {
    public static void main(String[] args) {
        // membuat ArrayList Hewan
        ArrayList<String> Hewan = new ArrayList<String>();
        Hewan.add("kucing");
        Hewan.add("kuda");
        Hewan.add("sapi");
        Hewan.add("ayam");
        Hewan.add("kucing");
        Hewan.add("kambing");
        System.out.println("Hewan: " + Hewan);

        // membuat ArrayList DeleteHewan
        ArrayList<String> DeleteHewan = new ArrayList<String>();
        DeleteHewan.add("kucing");
        DeleteHewan.add("sapi");
        DeleteHewan.add("kelinci");
        System.out.println("DeleteHewan: " + DeleteHewan);

        // menghapus elemen-elemen dari Hewan yang sama dengan data warna dari DeleteHewan
        for (String warna : DeleteHewan) {
            while (Hewan.contains(warna)) {
                Hewan.remove(warna);
            }
        }

        // menampilkan ArrayList Hewan setelah penghapusan
        System.out.println("Hewan setelah penghapusan: " + Hewan);
    }
}
Footer
© 2023 GitHub, Inc.
Footer navigation
Term