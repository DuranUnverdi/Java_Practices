package PolymorphisimEx2;

public class ToyotaDizel extends Toyota{
    public void motor(){System.out.println("motorD");}
    public void yakit(){System.out.println("yakitD");}
    public void yakit(String renk){
        if (renk.equalsIgnoreCase("Beyaz")||renk.equalsIgnoreCase("Siyah")||
                renk.equalsIgnoreCase("Mavi")){
            System.out.println("istediginiz renkte arac bulunmaktadir");
        }
        else {
            System.out.println("istediginiz renkte arac bulunmamaktadir");
        }
    }

}
