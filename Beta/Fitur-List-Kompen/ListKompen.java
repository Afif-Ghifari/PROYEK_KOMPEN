import java.util.Scanner;
public class ListKompen {

    public static void main(String[] args) {
        String jenisKompen1, jenisKompen2 = "", konfirmasi;

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jenis pekerjaan kompen yang ingin anda berikan : ");
        jenisKompen1 = sc.nextLine();
        System.out.print("Apakah anda ingin menambahkan pekerjaan lagi? (y/t): ");
        konfirmasi = sc.nextLine();

        if(konfirmasi.equalsIgnoreCase("y")) {
            System.out.print("Masukkan jenis pekerjaan baru : ");
            jenisKompen2 = sc.nextLine();

        } else if (konfirmasi.equalsIgnoreCase("t")) {
            System.out.println("List Kompen : ");
            System.out.println(jenisKompen1);
        } else {
            System.out.println("List Kompen : "); {
            System.out.println(jenisKompen1);
            System.out.println(jenisKompen2);
        }
        }
    }
}