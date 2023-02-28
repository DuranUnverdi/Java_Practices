package PolymorphisimEx2;

public class ToyotaBenzinli extends Toyota{
    public void motor(){System.out.println("motorB");}
    public void yakit(){System.out.println("yakitB");}

    public void yakit(Double maxTuketim){
        if (maxTuketim>6.8){
            System.out.println("Benzinli bir toyota alabilirsiniz");
        }
        else {
            System.out.println("İsteginize uygun bir toyota bulunamaistir");
        }
    }
}
