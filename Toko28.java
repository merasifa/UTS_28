import java.util.Scanner;

public class Toko28 {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            int totalItem = 0;
            double totalHargaSebelumDiskon = 0.0;
            double totalDiskonProduk = 0.0;
            double totalDiskonMember = 0.0;
            boolean tambah = true;
            System.out.println("PROGRAM TOKO");
            System.out.print("Masukkan nama Anda: ");
            String nama = input.nextLine();
            System.out.print("Apakah pelanggan adalah member? (Y/N): ");
            boolean isMember = input.nextLine().equalsIgnoreCase("Y");
    
            while (tambah) {
                System.out.print("Masukkan Produk yang Anda beli: ");
                String namaProduk = input.nextLine();
                System.out.print("Banyaknya: ");
                int kuantitas = input.nextInt();
                System.out.print("Harga: ");
                double harga = input.nextDouble();
                System.out.print("Diskon (%): ");
                double diskonProduk = input.nextDouble();
                input.nextLine();  // Membaca newline
    
                totalItem += kuantitas;
                totalHargaSebelumDiskon += (kuantitas * harga);
    
                double diskon = (harga * diskonProduk / 100) * kuantitas;
                totalDiskonProduk += diskon;
    
                tambah = tanya();
    
                if (isMember) {
                    if (totalHargaSebelumDiskon >= 200000) {
                        totalDiskonMember = totalHargaSebelumDiskon * 0.10;
                    } else {
                        totalDiskonMember = totalHargaSebelumDiskon * 0.05;
                    }
                }
            }
    
            double totalAkhir = totalHargaSebelumDiskon - totalDiskonProduk - totalDiskonMember;


            System.out.println("====================Total Pembelian====================");
            System.out.println("Nama Pelanggan             : " + nama);
            System.out.println("Tipe                       : " + (isMember ? "Member" : "Bukan Member"));
            System.out.println("Total Item Barang yang beli: " + totalItem);
            System.out.println("Subtotal                   : " + totalHargaSebelumDiskon);
            System.out.println("Total Diskon               : " + totalDiskonProduk);
            System.out.println("Total Diskon Member: " + totalDiskonMember);
            System.out.println("Total yang harus dibayar: " + totalAkhir);
            System.out.println("========================================");
        }
    
        public static boolean tanya() {
            Scanner input = new Scanner(System.in);
            System.out.print("Tambah produk lagi? (Y/N): ");
            return input.nextLine().equalsIgnoreCase("ya");
}
}