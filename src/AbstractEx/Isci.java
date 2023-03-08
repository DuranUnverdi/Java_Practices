package AbstractEx;

public class Isci extends Muhasebe{
    @Override
    protected int saatUcreti() {
        return 10;
    }

    @Override
    protected int aylikCalismaSuresi() {
        return 200;
    }

    @Override
    public String toString() {
        return "Isci{" +
                "sirketIsmi=" + sirketIsmi +
                ",saatUcreti=" + saatUcreti +
                ", aylikCalismaSuresi=" + aylikCalismaSuresi +
                ", maas=" + maas +
                ", isim='" + isim + '\'' +
                ", soyisim='" + soyisim + '\'' +
                ", tcNo='" + tcNo + '\'' +
                ", telefon='" + telefon + '\'' +
                ", iseBaslamaTarihi='" + iseBaslamaTarihi + '\'' +
                ", sigortaNo='" + sigortaNo + '\'' +
                ", personelNo='" + personelNo + '\'' +
                '}';
    }

    public static void main(String[] args)
    {
        Isci isci1=new Isci();
        isci1.maas=isci1.maas(isci1.saatUcreti(),isci1.aylikCalismaSuresi());
        isci1.saatUcreti=isci1.saatUcreti();
        isci1.aylikCalismaSuresi= isci1.aylikCalismaSuresi();
        isci1.isim="Duran";
        isci1.soyisim="Unverdi";
        System.out.println(isci1);
    }
}
