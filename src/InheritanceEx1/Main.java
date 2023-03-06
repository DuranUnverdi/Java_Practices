package InheritanceEx1;

public class Main {
    public static void main(String[] args){
        Personel p1=new Personel("Duran","Unverdi",26);
        System.out.println("Kimlik Bilgileri : "+p1.getKimlikBilgileri());
        Ogrenci ogr1=new Ogrenci("Duran","Unverdi",26,123123);
        System.out.println("Kimlik Bilgileri : "+ogr1.getKimlikBilgileri());
    }
}
