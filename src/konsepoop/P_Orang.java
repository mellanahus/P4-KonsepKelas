/* Percobaan memanggil konstruktor menggunakan
referensi this() dalam konstruktor dengan 4 parameter */

package konsepoop;

public class P_Orang {
    String nama;
    int umur;
    String warnaRambut;
    String warnaKulit;
    int tinggiBadan;
    int beratBadan;

    public P_Orang() {
    }

    public P_Orang(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public P_Orang(String nama, int umur, int tinggiBadan, int beratBadan) {
        this(nama,umur);
        this.tinggiBadan = tinggiBadan;
        this.beratBadan = beratBadan;
    }

    public void menangis() {
        System.out.println("hu .... Hu ....");
    }

    public void tertawa() {
        System.out.println("Ha ... Ha ....");
    }
}
