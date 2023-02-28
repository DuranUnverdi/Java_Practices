package PolymorphisimEx2;


public class CarSeller {
    public static void main(String[] args){
        //overloading :aynı isim farklı signature ile aynı class da kullanabiliriz
    CarSeller obj=new CarSeller();
    obj.yakit(2012);
    obj.yakit(2012,1990.0);

    //overriding : parent class da var olan bir methodun child classta oluşturulan aynı isim
        // ve signature'a sahip bir method tarafından geçersiz kılınmasıdır

        Toyota obj2=new Toyota();
        obj2.yakit();

        Toyota obj3=new ToyotaBenzinli();
        obj3.yakit();

        Toyota obj4=new ToyotaDizel();
        obj4.yakit();

        Toyota obj5=new ToyotaElektrikli();
        obj5.yakit();
    }
    public void motor(){
        System.out.println("motor");
    }
    public void yakit(){
        System.out.println("yakit");
    }
    public void yakit(double maxTuketim){
        System.out.println("istediginiz "+maxTuketim);
    }
    public void yakit(int yil){
        System.out.println("istediginiz arac yili "+yil);
    }
    public void yakit(int yil,double maxTuketim){
        System.out.println("istediginiz arac yili "+yil +"max tuketim "+maxTuketim);
    }
}
