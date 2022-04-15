/* Percobaan menjalankan class G_Mobil
pada package paketA */

package konsepoop;

import paketA.G_Mobil;

public class H_TestMobil {
    public static void main(String[] args) {
        G_Mobil avanza  = new G_Mobil("Innova", "BM3210");
        avanza.jmlRoda = 4;
        avanza.bahanBakar = "Solar";
        avanza.fullAC  = true;
        System.out.println(avanza.getInfo());

    }
}

