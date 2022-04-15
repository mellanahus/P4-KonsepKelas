/* Percobaan mengakses member class yang
di beri akses modifier dari package yang berbeda */

package paketA;

public class G_Mobil {
    private String nama;
    private String noBM;
    public int jmlRoda;
    public String bahanBakar;
    public boolean fullAC;

    public G_Mobil(String nama, String noBM) {
        this.nama = nama;
        this.noBM = noBM;
        this.jmlRoda = 4;
        this.bahanBakar  = "Bensin";
        this.fullAC = true;
    }

    public String getInfo() {
    String info = "Mobil : " + nama +
    "\nNomor BM : " + noBM +
    "\nJumlah Roda : " + jmlRoda +
    "\nJenis Bahan Bakar : " + bahanBakar +
    "\nFull AC : " + fullAC;
    return info;
    }
}


