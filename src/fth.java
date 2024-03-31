public class fth {
    public static void main(String[] args) {

        int a = 10;
        long b = 1;

        for (int i = 1; i <= a; i++) {
            b *= i;
        }

        System.out.println("Факторіал числа " + a + " за допомогою циклу for: " + b);



        int a1 = 10;
        long b1 = 1;
        int g = 1;

        while (g <= a) {
            b *= g;
            g++;
        }

        System.out.println("Факторіал числа " + a1 + " за допомогою циклу while: " + b1);






    }
}
