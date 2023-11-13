
import java.util.Scanner;
public class latihanFungsiSoal {
    static void tampilNama(int id) {
        String namaPelanggan[] = {"Ali", "Budi", "Dani", "Edi", "Umar"};
        System.out.println(namaPelanggan[id - 1]);
    }

    static void Tarif(int jumlahPakai) {
        int harga = 0;
        int admin = 1000;
        if (jumlahPakai < 0 || jumlahPakai < 10) {
            harga = jumlahPakai * 2000;

        } else if (jumlahPakai >= 11 && jumlahPakai <= 20) {
            harga = jumlahPakai * 3000;

        } else if (jumlahPakai >= 21 && jumlahPakai <= 30) {
            harga = jumlahPakai * 4000;

        } else if (jumlahPakai >= 31) {
            harga = jumlahPakai * 5000;

        }
        int total = harga + admin;
        System.out.println(harga);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
       
            System.out.println("ID PELANGGAN: ");
            int namaPelanggan = input.nextInt();
            System.out.println("ID PELANGGAN: "+ namaPelanggan);
            System.out.println("NAMA PELANGGAN: ");
            tampilNama(namaPelanggan);

            
            
            System.out.println("Masukkan banyak pemakaian dari AIR: ");
            int jumlahPakai = input.nextInt();
            System.out.println("Jumlah Tarif: ");
            Tarif(jumlahPakai);

    

        }
    }
    



