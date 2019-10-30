package p3constructor;


public class ifan2 {
    public  String umuranda;
    public String angkatan;
    public String semester;
    
    public ifan2 (String umuranda){
        this.umuranda = umuranda;
    }
     public ifan2 (String umuranda, String angkatan){
         this.umuranda = umuranda;
         this.angkatan = angkatan;
     }
      public ifan2 (String umuranda, String semester,String angkatan){
        this.umuranda = umuranda;
        this.semester = semester;
         this.angkatan = angkatan;
    }
    public static void main (String [] args ){
                ifan2 coba = new ifan2 ("21 tahun","2016","6");
                System.out.println("umur : "+coba.umuranda);
                System.out.println("angkatan :"+coba.angkatan);
                System.out.println("semester :"+coba.semester);
                
            
        }
    }
