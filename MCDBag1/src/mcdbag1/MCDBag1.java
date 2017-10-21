package mcdbag1;
/**
 *
 * @author arie
 */
public class MCDBag1 {

  
    public static void main(String[] args) {
     Hewan hewan = new Hewan("meow meow");
     System.out.println(hewan.suara + " " + hewan.umur());
     hewan.makan();
     Orang orang = new Orang();
     orang.setNama("Ari");
     System.out.println(orang.getNama());
     Kucing kucing = new Kucing("meow meow meow");
     kucing.makan();
     System.out.println(kucing.umur());
    }
}
