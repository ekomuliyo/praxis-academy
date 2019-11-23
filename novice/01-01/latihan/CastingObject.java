abstract class Binatang {
 
    public void makan(){
     System.out.println("Makan");
    }
    
    public void bergerak(){
     System.out.println("Bergerak");
    }
    
    public void tidur(){
     System.out.println("Tidur");
    }
    
   }
   
   class Kambing extends Binatang {
    
    public void kambingBersuara(){
     System.out.println("Mbeeek!");
    }
    
    public void makan(){
     System.out.println("Kambing makan");
    }
    
   }
   
   class Sapi extends Binatang {
    
    public void sapiBersuara(){
     System.out.println("Mooooo!");
    }
    
    public void makan(){
     System.out.println("Sapi makan");
    }
    
    public void bergerak(){
     System.out.println("Sapi bergerak");
    
    }
    
   }
   
   class Peternak{
       void memberiMakan(Binatang b){
           b.bergerak();
           b.makan();
           
           if(b instanceof Kambing){
               Kambing kambing = (Kambing) b;
               kambing.makan();
           }else{
               Sapi sapi = (Sapi) b;
               sapi.makan();
           }
       }
   }
   
   public class CastingObject {
    
    public static void main (String args []){
        
       // Upcasting, dari sub class casting ke super class
       // menajalankan method yang ada di sub class nya
       // Kambing kambing = new Kambing();
       // Binatang binatang = (Binatang) kambing;
       // kambing.makan();
       
       // ini berguna ketika memanggil object dengan tingkah laku yang sama
       // hanya menggunakan satu method yang referensi dari class absctrak
       // Kambing kambing = new Kambing();
       // Sapi sapi = new Sapi();
       // Peternak peternak = new Peternak();
       // peternak.memberiMakan(sapi);
       // peternak.memberiMakan(sapi);
       
       // Downcasting, dari super class casting ke sub class
       // menjalankan method yang ada di supper class nya
       // Binatang binatang = new Kambing();
       // Kambing kambing = (Kambing) binatang;
       // kambing.makan();
         
    }
   }