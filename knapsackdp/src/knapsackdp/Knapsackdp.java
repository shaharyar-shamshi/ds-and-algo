
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Knapsackdp {

    public static void main(String[] args) {
        FastReader in = new FastReader();
        int item = in.nextInt();
        int[] weight = new int[item];
        int[] price = new int[item];
        for (int i = 0; i < item; i++) {
            weight[i] = in.nextInt();

        }
        for (int i = 0; i < item; i++) {
            price[i] = in.nextInt();

        }

        int weightreq = in.nextInt();
        Knapsackdp k = new Knapsackdp();
        int ans = k.knapsack(weight, price, item, weightreq);
        System.out.println(ans);
    }

    int knapsack(int[] weight, int[] price, int item, int weightreq) {

        int[][] sack = new int[item + 1][weightreq + 1];
        for (int i = 0; i < item + 1; i++) {

            for (int j = 0; j < weightreq + 1; j++) {
                int inc = 0, exc = 0;
                if (i == 0 || j == 0) {
                    sack[i][j] = 0;
                } else {
                    int x = 0, y = 0;
                    if (weight[i - 1] <= j) {
                        if ((i - 2) >= 0 && (weight[i - 2]) <= (j - weight[i - 1])) {
                            inc = price[i - 1] + sack[i - 1][j - weight[i - 1]];
                        } else {
                            inc = price[i - 1];
                        }

                    }

                    exc = sack[i - 1][j];
                    if (exc > inc) {
                        sack[i][j] = exc;
                    } else {
                        sack[i][j] = inc;
                    }
                }
                System.out.print(sack[i][j] + " ");
            }

            System.out.println();
        }
        return sack[item][weightreq];

    }

}

class FastReader {

    
    BufferedReader br;
    StringTokenizer st;

    public FastReader() {
        br = new BufferedReader(new InputStreamReader(System.in));
    }

    String next() {
        while (st == null || !st.hasMoreElements()) {
            try {
                st = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return st.nextToken();
    }

    int nextInt() {
        return Integer.parseInt(next());
    }

    long nextLong() {
        return Long.parseLong(next());
    }

    double nextDouble() {
        return Double.parseDouble(next());
    }

    String nextLine() {
        String str = "";
        try {
            str = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}
