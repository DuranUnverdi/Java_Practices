package AbstractEx;

public abstract class Personel {
    static final String sirketIsmi="Yildiz Celik";
    static final String sirketAdresi="Ankara / Turkey";

    protected String isim="Deger girilmemis";
    protected String soyisim="Deger girilmemis";
    protected String tcNo="Deger girilmemis";
    protected String telefon="Deger girilmemis";
    protected String iseBaslamaTarihi="Deger girilmemis";
    protected String sigortaNo="Deger girilmemis";
    static int personelSayac=1000;

    protected String personelNo;

    protected String personelNo(){
        personelSayac++;
        String no=personelSayac+"";
        return no;
    }

}
