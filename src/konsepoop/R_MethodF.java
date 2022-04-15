// Percobaan menggunakan objek sebagai parameter metode

package konsepoop;

public class R_MethodF {
    public static void main(String[] args) {
        P_Orang daru = new P_Orang("Daru Nugroho", 20);
        cetakOrang(daru);
    }

    private static void cetakOrang(P_Orang orang){
        System.out.println("Nama = " + orang.nama);
        System.out.println("Umur ="+ orang.umur + " tahun");
     }
}
