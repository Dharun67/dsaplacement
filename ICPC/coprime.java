import java.util.*;

public class coprime{

    static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        ArrayList<Integer> ans = new ArrayList<>();
        int ins = 0;

        ans.add(a[0]);

        for (int i = 1; i < n; i++) {

            if (gcd(a[i - 1], a[i]) != 1) {

                for (int x = 2; x <= 100; x++) {
                    if (gcd(a[i - 1], x) == 1 && gcd(a[i], x) == 1) {
                        ans.add(x);
                        ins++;
                        break;
                    }
                }
            }

            ans.add(a[i]);
        }

        System.out.println(ins);

        for (int x : ans) {
            System.out.print(x + " ");
        }
    }
}