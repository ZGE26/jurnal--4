import java.util.LinkedList;
import java.util.Collections;
import java.util.ListIterator;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        LinkedList<Tugas> linkedList = new LinkedList<Tugas>();
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("Memilih Inputan : \n 1. Input Tugas\n 2. Delet Tugas\n 3. Melihat List Tugas\n 4. Keluar");
            System.out.print("Pilihan :");
            int pilihan = s.nextInt();s.nextLine();

            if (pilihan == 1) {
                System.out.print("Mata Kuliah :");
                String matkul = s.nextLine();
                System.out.println();
                System.out.print("Nama Tugas :");
                String Tugas = s.nextLine();
                System.out.println();
                System.out.print("Deadline :");
                String Deadline = s.nextLine();
                System.out.println();

                linkedList.add(new Tugas(matkul, Tugas, Deadline));
            } else if (pilihan == 2) {

                ListIterator<Tugas> iterator = linkedList.listIterator();
                System.out.print("Hapus Matkul :");

                String masukan = s.nextLine();
                while (iterator.hasNext()) {
                    Tugas t = iterator.next();
                    if (t.getMatkul().equals(masukan)) {
                        iterator.remove();
                    }
                }

            } else if (pilihan == 3) {

                Collections.sort(linkedList, Tugas.tanggalComparator);

                for (Tugas tugas : linkedList) {
                    System.out.println(tugas);
                }
            } else if (pilihan == 4) {
                break;
            }
        }
        s.close();
    }
}
