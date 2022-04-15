/* Percobaan menggunakan metode dengan nilai kembali
yang memiliki parameter */

package konsepoop;

public class N_MethodD {
        public static void main(String[] args) {
            double hasilBagi = bagi(9, 3);
            System.out.println("Hasil bagi = " + hasilBagi);
        }

        private static double bagi(double param1, double param2) {
            return (param1 / param2);
        }
    }
