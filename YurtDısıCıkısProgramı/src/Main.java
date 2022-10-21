
public class Main {
    
     public static void main(String[] args) throws InterruptedException {
         
         System.out.println("Sabiha Gokcen Havaalanına hosgeldiniz..");
         
         String islemler = "Yurtdısına cıkabilmeniz icin asagıdaki bütün islemlerin yerine getirilmesi gerekiyor.\n"
                          + "Yurtdısı harcının tam yatırılmıs olması lazım\n"
                          + "Herhangi bir siyasi yasağınızın olmaması gerekiyor.\n"
                          + "Vize onayınızın olması gerekiyor." ;
         
           
           
           String message = ("Yurt dısına cıkabilmek icin gerekli islemler") ;
           
           while (true) {
               
               System.out.println(message) ;
                 System.out.println("******************************") ;
                 System.out.println(islemler) ;
                 
            Yolcu1 yolcu = new Yolcu1() ;
            
              System.out.println("Yurtdısı harc bedeli kontrol ediliyor") ;
              
              Thread.sleep(3000) ;
              
              if( yolcu.yurtdisiHarciKontrol() == false ) {
                  
                    System.out.println(message) ;
                  continue ;
                  
              }
              System.out.println("Siyasi yasagınız kontrol ediliyor.") ;
               Thread.sleep(3000) ;
              
              if  (yolcu.siyasiYasakKontrol() == true ) {
                  System.out.println(message) ;
                  continue ;
              }
               
              System.out.println("Vize onayınız kontrol ediliyor.") ;
              
              Thread.sleep(3000) ;
              
              if ( yolcu.vizeDurumuKontrol() == false ) {
               System.out.println(message) ;
               continue ;
           }
               
              System.out.println("İslemleriniz tamam yurtdısına cıkabilirsiniz.") ;
              
              
                  break ;
           }
                
     }

    
}
