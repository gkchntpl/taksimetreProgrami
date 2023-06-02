import java.util.Scanner;

public class taksimetreProgrami {
    public static void main(String[] args) {

        double km;

        Scanner input = new Scanner(System.in);

        System.out.print("kaç kilometre gidileceğini giriniz: ");
        km = input.nextDouble();

        double odenecekUcret;
        odenecekUcret = 10 + km * 2.20;

        odenecekUcret = (odenecekUcret <= 20 ) ? 20 : (10 + km * 2.20);

        System.out.print("Toplam ödenecek ücret: " + odenecekUcret);





    }
}
