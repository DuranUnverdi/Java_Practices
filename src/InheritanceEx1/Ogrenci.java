package InheritanceEx1;

public class Ogrenci extends Personel{
    private int ogrenciNo;

    public int getOgrenciNo() {
        return ogrenciNo;
    }

    public void setOgrenciNo(int ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public Ogrenci() {
        super();
        ogrenciNo=0;
    }

    public Ogrenci(String isim, String soyisim, int yas, int ogrenciNo) {
        super(isim, soyisim, yas);
        this.ogrenciNo = ogrenciNo;
    }

    @Override
    public String getKimlikBilgileri() {
        return super.getKimlikBilgileri()+" Ogrenci No : "+ogrenciNo ;
    }

    @Override
    public String toString(){
        return super.toString() +" Ogrenci No toString "+ogrenciNo;
    }
}
