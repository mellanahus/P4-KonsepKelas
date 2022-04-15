// Percobaan menggunakan keyword static

package konsepoop;

public class I_TestStatic {
    // Static method
    static void myStaticMethod() {
        System.out.println("Static  methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public  methods must be called by creating objects");
    }

    // Main method
    public static void main(String[] args) {
        myStaticMethod(); // Call the static method
        // myPublicMethod(); This would output an error

        I_TestStatic  myObj = new I_TestStatic(); // Create an object of MyClass myObj.myPublicMethod(); // Call the public method
    }
}
