// Percobaan menggunakan objek sebagai nilai kembali dari metode

package konsepoop;

public class S_MethodG {
    public static void main(String[] args) {
        P_Orang dosen = getOrang("Depandi  Enda", 29);
        cetakOrang(dosen);
    }

    private static void cetakOrang(P_Orang  orang) {
        System.out.println("Nama = " + orang.nama);
        System.out.println("Umur =" + orang.umur + " tahun");
    }

        private static P_Orang getOrang(String  nama, int umur){
            P_Orang orang  = new P_Orang(nama, umur);
            return orang;
        }
}
