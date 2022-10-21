
import java.util.Scanner;


public class Yolcu1 implements YurtDısıKuralları {
    
      private int harc ;
      private boolean siyasiYasak ;
      private boolean vizeDurumu ;

    public Yolcu1(int harc, boolean siyasiYasak, boolean vizeDurumu) {
        this.harc = harc;
        this.siyasiYasak = siyasiYasak;
        this.vizeDurumu = vizeDurumu;
    }
      
       public Yolcu1 () {
           
           Scanner scanner = new Scanner (System.in) ;
           
           System.out.println("Yatırmak istediginiz tutarı yazın") ;
           
           harc = scanner.nextInt() ;
              scanner.nextLine() ;
          
              System.out.println("Siyasi yasagınız var mı ? (evet yada hayır)") ;
              
              String cevap = scanner.nextLine() ;
              
              if (cevap.equals("evet")) {
                  
                  siyasiYasak = true ;
                  
              }
              else {
                  
                
                   
                  siyasiYasak = false ;
              }
              
              System.out.println("Vizeniz bulunuyor mu ?") ;
              
              String cevap2 = scanner.nextLine() ;
              if (cevap2.equals("evet")) {
                  
                  vizeDurumu = true ; ;
                  
              }
              else {
                 
               
                  
                  vizeDurumu = false  ;
              }
       }
      

    @Override
    public boolean yurtdisiHarciKontrol() {
        
        if ( harc < 15) {
            
            System.out.println("Eksik tutar girdiniz.") ;
            return false ;
        }
          
          
        else {
                
            System.out.println("Paranız yatırılmıstır.Tesekkur ederiz.") ;
            return true ;
        }
        
         
      
    }

    @Override
    public boolean siyasiYasakKontrol() {
        
        if ( siyasiYasak == true )  {
            
              System.out.println("Yurt dısına cıkamazsınız.") ;
              return false ;
        }
         
        else {
             
             
              System.out.println("Yasagınız yoktur iyi yolculuklar dileriz.") ;
              return true ;
        }
    
      
    }




    @Override
    public boolean vizeDurumuKontrol() {
      
        if (vizeDurumu == true ) {
              System.out.println("Vizeniz onaylanmıstır.") ;
         
               return true ;
        }
        
        else {
             
             
             
              System.out.println("Vizeniz onaylanmamıstır.") ;
              
              return false ;
        }
    }
      
      
  }            

