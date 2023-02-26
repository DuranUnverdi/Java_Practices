package EncapsulationEx;

import java.util.Scanner;

public class Encapsulation {
    public static void main(String[] args){
        //Tc doğru ise gişe numarası veren program
        Scanner scan =new Scanner(System.in);
        TCKN tc=new TCKN();
        System.out.println(" lutfen TCKN giriniz :");
        String tckn=scan.nextLine();
        tc.setTckn(tckn);
        System.out.println(" lutfen Dogum Yerini giriniz :");
        String dogumYeri=scan.nextLine();
        tc.setDogumYeri(dogumYeri);
    }
}
