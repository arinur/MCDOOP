package mcdbag1;
/**
 *
 * @author arie
 */
class Hewan {
     public String suara;
    
    public Hewan(String suara){
        this.suara = suara;
    }
    public int umur(){
        int umur = 10;
        return umur;
    }
    public void makan(){
        System.out.println("Makan ayam");
    }
    public void umurKucing(){
        int umur = 20;
        String umur2 = String.valueOf(umur);
    }
}
