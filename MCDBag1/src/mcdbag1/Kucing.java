package mcdbag1;

/**
 *
 * @author arie
 */
public class Kucing extends Hewan {
    
    public Kucing(String suara) {
        super(suara);
    }
    public void Minum(){
        System.out.println("Kucing sudah minum jadi tidak haus");
    }
    @Override
    public void makan(){
        System.out.println("Makan ikan");
    }
}
