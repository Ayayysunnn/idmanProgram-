import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("idman programına Hoşgeldiniz...");

        String idmanlar = "Geçerli hareketler\n"
                         +" Burpee\n"
                         +"Pushop(Şınav)\n"
                         +"Situp(Mekik)\n"
                         +"Squat" ;

        System.out.println(idmanlar);

        System.out.println("Bir idman oluşturun...");
        System.out.print("Burpee sayısı:");
        int burpee= scanner.nextInt();
        System.out.print("Pushop sayısı:");
        int pushop= scanner.nextInt();
        System.out.print("Situp sayısı:");
        int situp= scanner.nextInt();
        System.out.print("Squat sayısı:");
        int squat= scanner.nextInt();
        scanner.nextLine();

       idman idman =new idman(burpee,pushop,situp,squat);
        System.out.println("İdmanınız başlıyor...");


        while (idman.idmanBittimi()==false){
            System.out.print("Hareket Türü (burpee,pushop,situp,squat) :" );
            String tur= scanner.nextLine();
            System.out.print("Bu hareketten kaç tane yapacaksınız:");
            int sayi= scanner.nextInt();
            scanner.nextLine();
            idman.hareketYap(tur,sayi);
        }
        System.out.println("İdmanını başarıyla bitirdin...");
    }
}
