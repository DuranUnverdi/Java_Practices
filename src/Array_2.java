import java.util.Scanner;

public class Array_2 {
    public static void main(String[] args){
//Klavyeden girilen 5 sayı içerisinden a)100-200 arasındaki sayıların adedini b)100 den küçük sayıların toplamını
// c)200 den büyük sayıların 4 e kalansız böllünebilenleri ekrana yazdıran kodu yazınız
        Scanner scan=new Scanner(System.in);
        int[] arr=new int[5];
        for (int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
            System.out.println("Girilen sayi : "+arr[i]);
        }
        int buyukYuz=0;
        int kucukYuz=0;
        int buyukİkiYuz=0;
        int toplam=0;
        int yanlisDeger=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]>=100 && arr[i]<=200){
                buyukYuz++;
            }
            else if(arr[i]>=0 && arr[i]<100){
                kucukYuz++;
                toplam +=arr[i];
            }
            else if(arr[i]>200 && arr[i] % 4 == 0){
                buyukİkiYuz++;
            }
            else{
                yanlisDeger++;
            }

        }
        System.out.println("Yuz ikiyuz arasi  sayi adedi : "+buyukYuz);
        System.out.println("Yuzden kucuk   sayi adedi : "+kucukYuz + " Toplam sayisi = "+toplam);
        System.out.println("Ikiyuzden buyuk ve dorde bolunebilen   sayi adedi : "+buyukİkiYuz);
        System.out.println("Yanlis girilen sayi adedi = "+yanlisDeger);

    }
}
