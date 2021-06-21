import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int r,a;
        double sonuc, pi=3.14;

        Scanner input = new Scanner(System.in);

        System.out.print("Yarıçap Giriniz: ");
        r=input.nextInt();

        double alan=Math.PI*Math.pow(r,2);
        double cevre=2*Math.PI*r;

        System.out.println("Dairenin Alanı: "+ alan);
        System.out.println("Dairenin Çevresi: "+ cevre);

        System.out.print("Merkez Açısının Ölçüsü: ");
        a=input.nextInt();

        sonuc=(pi*Math.pow(r,2)*a)/360;

        System.out.println("Daire Diliminin Alanı: "+sonuc);


    }
}
