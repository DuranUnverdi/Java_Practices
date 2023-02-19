import java.util.Scanner;

public class Array_3 {
    public static void main(String[] args){
//GirileEn büyük sayıyı bulma
        Scanner scan=new Scanner(System.in);
        int[] arr=new int[5];
        for (int i=0;i<arr.length;i++){
            arr[i]=scan.nextInt();
            System.out.println("Girilen sayi : "+arr[i]);
        }
        int max=arr[0];
        for (int i=0;i<arr.length;i++){
            if(max<arr[i]){
               max=arr[i];
            }
        }
        System.out.println("En buyuk sayi " + max);
    }
}
