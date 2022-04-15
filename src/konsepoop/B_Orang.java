// Percobaan membuat class dan objek dalam satu file kode sumber java

package konsepoop;

public class B_Orang {
    String nama;
    int umur;
    String warnaRambut;
    String warnaKulit;
    int tinggiBadan;
    int beratBadan;

    public B_Orang() {
    }

    public B_Orang(String nama) {
        this.nama = nama;
    }

    public void menangis() {
        System.out.println("hu .... Hu .... ");
    }

    public void tertawa() {
        System.out.println("Ha ... Ha ... ");
    }

    public static void main(String[] args) {
        B_Orang dido = new B_Orang();
        dido.nama = "Dido";
        dido.umur = 4;
        System.out.println("Nama :    " + dido.nama);
        System.out.println("Umur: " + dido.umur + "tahun.");
        dido.menangis();

        System.out.println();

        B_Orang dodo = new B_Orang("Dodo");
        System.out.println("Nama :   " + dodo.nama);
        System.out.println("Umur: " + dodo.umur + "tahun.");
        dodo.tertawa();
    }
}