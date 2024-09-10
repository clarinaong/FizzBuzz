public class Multiples {
    public static void main(String[] args) {
        int i = 0;
        for (int j = 0; j < 1000; j++) {
            if (j % 3 == 0) {
                i = i + 1;
            }
            else if (j % 5 == 0) {
                i = i + 1;
            }
        }
        System.out.println(i);
    }
}
