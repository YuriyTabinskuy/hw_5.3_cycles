public class thr {
    public static void main(String[] args) {

        int a = 10;

        System.out.println("Додатні дільники числа " + a + ":");

        for (int b = 1; b <= a; b++) {
            if (a % b == 0) {
                System.out.println(b);
            }
        }


    }
}
