package assiment1;

public class maximumnumber {

    public static void main(String[] args) {
        int a[] = {10, 20, 30, 40, 50, 60, 30, 80};
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        System.out.println(max);

    }

}
