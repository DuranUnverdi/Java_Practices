import java.util.Scanner;

public class Array_1 {
    public static void main(String[] args){
        int[] arr1={10,20,30,40,50};
        int[] arr2=new int[5];

        arr2[0]=1;
        arr2[1]=2;
        arr2[2]=3;
        arr2[3]=4;
        arr2[4]=5;
        System.out.println("Array 2'nin birinci elemanı : "+arr2[0]);
        System.out.println("Array 1'nin ikinci elemanı : "+arr1[2]);
        for(int i=0;i<arr2.length;i++){
            System.out.println("Array 2'nin "+i+". elemanı "+arr1[i]);
        }
        scannerText();

    }
    public static void scannerText(){
        Scanner scanner=new Scanner(System.in);
        int[] arr2=new int[5];

        System.out.println("Array 2 icin degerleri girin");
        for(int i=0;i<arr2.length;i++){
            arr2[i]=scanner.nextInt();
        }
        System.out.println("Array 2 icin degerlerini okuyun");
        for(int i=0;i<arr2.length;i++){
            System.out.println("Array 2'nin "+i+". elemanı "+arr2[i]);
        }
        toplamDeger(arr2);
    }
    public static void toplamDeger(int[] arr2){
        int total=0;
        for(int i=0;i<arr2.length;i++){
            total +=arr2[i];
        }
        System.out.print("Toplam deger = "+total);

    }

}
