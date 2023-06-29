import java.util.Scanner;
public class Main {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen doğduğunuz ayı yazınız:");
        String moon=input.nextLine();
        System.out.println("Lütfen doğduğunuz günü giriniz:");
        int day=input.nextInt();

        String horoscope="";

        if(moon.equalsIgnoreCase("ocak"))
        {
            if(day>22)
            {
                horoscope="kova";
            }
            else
            {
                horoscope="oğlak";
            }
        }
        if(moon.equalsIgnoreCase("şubat"))
        {
            if (day>20)
            {
                horoscope="balık";
            }
            else
            {
                horoscope="kova";
            }
        }
        if (moon.equalsIgnoreCase("mart"))
        {
            if(day>21)
            {
                horoscope="koç";
            }
            else
            {
                horoscope="balık";
            }
        }
        if(moon.equalsIgnoreCase("nisan"))
        {
            if(day>21){
                horoscope="boğa";
            }
            else
            {
                horoscope="koç";
            }
        }
        if (moon.equalsIgnoreCase("mayıs"))
        {
            if(day>22)
            {
                horoscope="ikizler";
            }
            else
            {
                horoscope="boğa";
            }
        }
        if (moon.equalsIgnoreCase("haziran"))
        {
            if (day>23)
            {
                horoscope="yengeç";
            }
            else
            {
                horoscope="ikizler";
            }
        }
        if (moon.equalsIgnoreCase("temmuz"))
        {
            if (day>23)
            {
                horoscope="aslan";
            }
            else
            {
                horoscope="yengeç";
            }
        }
        if (moon.equalsIgnoreCase("agustos"))
        {
            if (day>23)
            {
                horoscope="başak";
            }
            else
            {
                horoscope="aslan";
            }
        }
        if (moon.equalsIgnoreCase("eylül"))
        {
            if (day>23)
            {
                horoscope="terazi";
            }
            else
            {
                horoscope="başak";
            }
        }
        if (moon.equalsIgnoreCase("ekim"))
        {
            if (day>23)
            {
                horoscope="akrep";
            }
            else
            {
                horoscope="terazi";
            }
        }
        if (moon.equalsIgnoreCase("kasım"))
        {
            if (day>22)
            {
                horoscope="yay";
            }
            else
            {
                horoscope="akrep";
            }
        }
        if (moon.equalsIgnoreCase("aralık"))
        {
            if (day>22)
            {
                horoscope="oğlak";
            }
            else
            {
                horoscope="yay";
            }


        }
        System.out.println(day+" "+moon+" "+"gününde doğduysanız burcunuzda"+" "+horoscope+"olur");
    }
}