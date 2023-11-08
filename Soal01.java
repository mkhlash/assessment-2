    import java.util.Scanner;

public class Soal01 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int nomor1 = s.nextInt();
        int nomor2 = s.nextInt();
        int nomor3 = s.nextInt();
        int nomor4 = s.nextInt();
        int nomor5 = s.nextInt();

        if(nomor1 % 2 == 0){
            System.out.println(nomor1 + " valid");
        }else{
            System.out.println(nomor1 + " tidak valid");
        }
        if(nomor2 % 2 == 0){
            System.out.println(nomor2 + " valid");
        }else{
            System.out.println(nomor2 + " tidak valid");
        }
        if(nomor3 % 2 == 0){
            System.out.println(nomor3 + " valid");
        }else{
            System.out.println(nomor3 + " tidak valid");
        }
        if(nomor4 % 2 == 0){
            System.out.println(nomor4 + " valid");
        }else{
            System.out.println(nomor4 + " tidak valid");
        }
        if(nomor5 % 2 == 0){
            System.out.println(nomor5 + " valid");
        }else{
            System.out.println(nomor5 + " tidak valid");
        }
    }
}
