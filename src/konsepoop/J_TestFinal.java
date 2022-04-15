// Percobaan menggunakan keyword final

package konsepoop;

public class J_TestFinal {

    final int x = 10;
    final double PI = 3.14;

    public static void main(String[] args) {
        J_TestFinal myObj = new J_TestFinal();
    //    myObj.x = 50; // will generate an error: cannot assign a value to a final variable
    //    myObj.PI = 25; // will generate an error: cannot assign a value to a final variable
        System.out.println(myObj.x);
    }
}