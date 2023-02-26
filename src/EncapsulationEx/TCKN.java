package EncapsulationEx;

import java.util.Random;

public class TCKN {
    private long id;
    private String dogumYeri;
    private  String tckn;

    boolean control=true;
    public void setTckn(String tckn){
        if (tckn.length()==11){
            for(int i=0;i<tckn.length();i++){
               char ch= tckn.charAt(i);
               if(Character.isDigit(ch)){
                    control=true;
               }
               else{
                   control=false;
                   break;
               }
            }
            if(control){
                Random rnd=new Random();
                this.tckn=tckn;
                int giseNo=rnd.nextInt(100);
                sonucuYazdir("Gise No : "+giseNo);
            }
            else{
                sonucuYazdir("Tum karakterleri rakam olarak giriniz");
            }
        }
        else{
            sonucuYazdir("TC 11 Haneli olmak zorundadir");
        }
    }
    public void setDogumYeri(String dogumYeri){
        boolean flag=true;
        for(int i=0;i<dogumYeri.length();i++){
            char c=dogumYeri.charAt(i);
            if((c>='A' && c<='Z') || (c>='a' && c<='z')){
                this.dogumYeri=dogumYeri;
                flag=true;
            }
            else{
                sonucuYazdir("Dogum yeri rakam iceremez");
                flag=false;
                break;
            }

        }
        if (flag){
            sonucuYazdir(dogumYeri+" ilinde dogdunuz");
        }

    }
    public void sonucuYazdir(String sonuc){
        System.out.println(sonuc);
    }
}
