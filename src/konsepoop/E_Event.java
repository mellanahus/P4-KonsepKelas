// Percobaan memberikan dan mengakses modifier pada member class

package konsepoop;

public class E_Event {

    public int tglKegiatan;
    public int blnKegiatan;
    public int tahunKegiatan;
    protected int maxPeserta;
    protected int jmlPeserta;
    public String namaEvent;
    final int biayaPendaftaran  = 50000;
    String tempatEvent;

    public E_Event(String nama, int m) {
        namaEvent = nama;
        maxPeserta = m;
    }

    void infoEvent() {

        System.out.println("Nama event :" + namaEvent);
        System.out.println("Maksimal Peserta:" + maxPeserta);
        System.out.println("Biaya Pendaftaran :" + biayaPendaftaran);
    }
    }
