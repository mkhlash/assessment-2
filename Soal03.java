import java.util.Scanner;

public class Soal03 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int h = s.nextInt();
        int m = s.nextInt();
        int v = s.nextInt();

        int jumlahMenit = m + v;
        int hasilMenit = jumlahMenit - 60;

        System.out.println(h + ":" +hasilMenit);
        
    }
}
