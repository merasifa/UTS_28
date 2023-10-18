import java.util.Scanner;
public class HitungIP28 {

    public static void main(String[] args) {
        Scanner input28 = new Scanner(System.in);
        
        int sks, jml_matkul;
        String Nama, Matakuliah, Nilai;
        double ip, bobot, total_bobot = 0;
        int total_sks = 0, remidi = 0;

        System.out.println("PROGRAM HITUNG IP");
        System.out.print("Masukkan nama mahasiswa : ");
        String nama = input28.nextLine();
        System.out.print("Masukkan jumlah mata kuliah : ");
        int a = input28.nextInt();
        for (int i = 1; i <= a; i++) {
            System.out.println("\nMata kuliah ke" + i);
            input28.nextLine();
            System.out.print("Masukkan nama matkul : ");
            String MATKUL = input28.nextLine();
            System.out.print("Masukkan indeks nilai (A/B+/B/C+/C/D/E) : ");
            String nilai = input28.nextLine();
            System.out.print("Masukkan jumlah SKS : ");
            int Sks = input28.nextInt();

            
            switch (nilai) {
                case "A":
                    bobot = 4.0;
                    break;
                case "B+":
                    bobot = 3.5;
                    break;
                case "B":
                    bobot = 3.0;
                    break;
                case "C+":
                    bobot = 2.5;
                    break;
                case "C":
                    bobot = 2.0;
                    break;
                case "D":
                    bobot = 1.0;
                    remidi++;
                    break;
                default:
                    bobot = 0.0;
                    remidi++;
            }

            total_bobot += Sks * bobot;
            total_sks += Sks;
        }

        double IP = total_bobot / total_sks;

        System.out.println("Nama Mahasiswa: " + nama);
        System.out.printf("Indeks Prestasi (IP): %.2f\n", IP);
        System.out.println("Total mata kuliah: " + a);
        System.out.println("Total SKS: " + total_sks);
        System.out.println("Jumlah mata kuliah yang harus perbaikan/remidi: " + remidi);
    }
}