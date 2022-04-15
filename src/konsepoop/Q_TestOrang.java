// Percobaan pemanggilan constructor yang memiliki 4 parameter

package konsepoop;

public class Q_TestOrang {
    public static void main(String[] args) {
        P_Orang badu = new P_Orang(); //constructor tanpa parameter badu.nama  = "Badu";
        badu.umur = 12;
        System.out.println("Nama :   " + badu.nama);
        System.out.println("Umur: "+  badu.umur + " tahun.");
        badu.tertawa();
        System.out.println();

        P_Orang  dodo  = new P_Orang("Dodo", 10); //constructor dengan  2 parameter
        System.out.println("Nama :    " + dodo.nama);
        System.out.println("Umur :   " + dodo.umur  + " tahun.");
        dodo.menangis();

        System.out.println();

        P_Orang jono  = new P_Orang("Jono",  12,  168, 76); //constructor  dengan 4 parameter
        System.out.println("Nama :    "  + jono.nama);
        System.out.println("Umur: " + jono.umur +  " tahun.");
        System.out.println("Tinggi Badan :   " + jono.tinggiBadan +"cm.");
        System.out.println("Berat  Badan :" + jono.beratBadan +  " kg."); jono.tertawa();

    }
}
