package dasar;

public class Drone {
   // atribut
    String merek;
    int energi;
    int ketinggian;
    int kecepatan;

    // method
    void terbang(){
        System.out.println("Jenis Drone : " +merek);
        if(energi > 10){
            // terbang berarti nilai ketinggian bertambah
            ketinggian++;
            System.out.println("Drone terbang... Energi drone saat ini : " +energi);
        } else {
            System.out.println("Energi lemah drone tidak bisa terbang... Energi drone saat ini : " +energi);
        }
    }

    void matikanMesin(){
        ketinggian--;
        if(ketinggian > 0){
            System.out.println("Mesin tidak bisa dimatikan karena sedang terbang... Ketinggian drone saat ini : " +ketinggian);
        } else {
            System.out.println("Mesin dimatikan...");
        }
    }

    void turun(){
        // ketinggian berkurang, karena turun
        ketinggian--;
        energi--;
        System.out.println("Drone turun");
    }

    void belok(){
        energi--;
        System.out.println("Drone belok");
        // belok ke mana? perlu dicek ;)
    }

    void maju(){
        energi--;
        System.out.println("Drone maju ke depan");
        kecepatan++;
    }

    void mundur(){
        energi--;
        System.out.println("Drone mundur kebelakang");
        kecepatan++;
    } 
}
