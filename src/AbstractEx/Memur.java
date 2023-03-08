package AbstractEx;

public class Memur extends Muhasebe{
    @Override
    protected int saatUcreti() {
        return 10;
    }

    @Override
    protected int aylikCalismaSuresi() {
        return 180;
    }
}
