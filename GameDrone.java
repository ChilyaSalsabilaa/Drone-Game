package dasar;

public class GameDrone {
    public static void main(String[] args){
        
        int ketinggian = 0 ;
        int energi = 0;
        
        //membuat objek drone 
        Drone IniDrone = new Drone ();
        
        //mengisi atribut drone 
        IniDrone.merek = "DJI drone" ;
        IniDrone.energi = 50;
        IniDrone.kecepatan = 25;
        IniDrone.ketinggian = 10;
        
        //method 
        IniDrone.terbang();
   
        IniDrone.matikanMesin();
        
        IniDrone.belok();
        
        IniDrone.maju();
        
        IniDrone.mundur();
    }
}
