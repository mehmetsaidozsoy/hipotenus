import java.util.Scanner;

public class hipotenus{
    public static void main(String[] args) {
     try (Scanner input=new Scanner(System.in)){
       double a,b,c, u, alanKare, hata, tahmin;
      
       System.out.println("a kenar girin  :");
       a=input.nextDouble();
       System.out.println("b kenar girin  :");
       b=input.nextDouble();
       System.out.println("c kenar girin  :");
       c=input.nextDouble();
       u=(a+b+c)/2;
       System.out.println("Ucgenin yarı cevresi  :"+u);

       alanKare=u*(u-a)*(u-b)*(u-c);
       System.out.println("Ucgenin alanın karesi :"+alanKare);
       tahmin=alanKare/2;
       hata=1e-15;
       while(tahmin*tahmin-alanKare>hata){
        tahmin=(tahmin+alanKare/tahmin)/2.0;
       }

       System.out.println("Ucgenin alanı  :"+tahmin);

     }


        
    }

}