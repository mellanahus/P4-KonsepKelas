// Percobaan mengakses anggota kelas (member class)

package konsepoop;

public class A_Mahasiswa {
    public int nrp;
    public String nama;

    public void info() {
        System.out.println("Ini siswa RPL Polbeng");
    }

    public static void main(String args[]) {
        A_Mahasiswa it = new A_Mahasiswa();
        it.nrp = 5;
        it.nama = "Andi";
        it.info();
    }
}
