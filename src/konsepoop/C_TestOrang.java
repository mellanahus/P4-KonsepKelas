/* Percobaan membuat class dan objek
 dengan dua file kode sumber yang berbeda */

package konsepoop;

public class C_TestOrang {
    public static void main(String[] args) {
        B_Orang dido= new B_Orang();
        dido.nama  = "Dido";
        dido.umur  = 4;
        System.out.println("Nama :   "+ dido.nama);
        System.out.println("Umur: "+ dido.umur + " tahun.");
        dido.menangis();

        System.out.println();

        B_Orang dodo= new B_Orang("Dodo");
        System.out.println("Nama :   "+ dodo.nama);
        System.out.println("Umur: "+ dodo.umur +"tahun.");
        dodo.tertawa();
    }
}
