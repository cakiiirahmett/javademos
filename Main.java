import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);

        int bakiye=100;
        String islemler="1.İşlem : Bakiye Öğrenme \n" +
                "2.İşlem : Para Çekme \n" +
                "3.İşlem :Para Yatırma\n" +
                "Çıkış için q'ya basını. ";
        System.out.println("***************************");
        System.out.println(islemler);
        System.out.println("***************************");

        while (true){


            System.out.print("İşlem Seçiniz : ");
            String islem=scanner.nextLine();

            if (islem.equals("q")){
                System.out.println("İşlemden Çıkılıyor...");
                break;
            }else if (islem.equals("1")){
                System.out.println("Bakiyeniz : "+bakiye);
            }else if (islem.equals("2")){
                System.out.print("Ne Kadar Çekiceksiniz :");
                int tutar=scanner.nextInt();
                scanner.nextLine();

                if (bakiye-tutar <0){
                    System.out.println("Yeterli Bakiyeniz Yoktur..");
                }else {
                    bakiye-=tutar;
                    System.out.println("Güncel Bakiyeniz : "+bakiye);
                }
            }else if (islem.equals("3")){

                System.out.print("Ne Kadar Yatıracaksınız : ");
                int tutar=scanner.nextInt();
                scanner.nextLine();

                bakiye+=tutar;

                System.out.println("Güncel Bakiyeniz : "+bakiye);


            }





        }


    }
}
