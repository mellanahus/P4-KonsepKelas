/* Percobaan menjalankan atau mengeluarkan
output dari percobaan E_Event */

package konsepoop;

public class F_TestEvent {
    public static void main(String[] args) {

        E_Event even = new E_Event("Yuk Ngaji",200);
        even.tglKegiatan  = 10;
        even.blnKegiatan = 11;
        even.tahunKegiatan = 2018;
        even.infoEvent();
        System.out.println("=====================================");
        System.out.println("Tanggal Kegiatan :" + even.tglKegiatan + ""  + even.blnKegiatan + "/" + even.tahunKegiatan);
        even.jmlPeserta = 100;
        System.out.println("Jumlah Peserta:" + even.jmlPeserta);

    }
}
