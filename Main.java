import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder out = new StringBuilder();

        int t = Integer.parseInt(br.readLine().trim());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int x0 = Integer.parseInt(st.nextToken());
            int y0 = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());

            int x = x0 + R;
            int y = y0;

            out.append(x).append(" ").append(y).append('\n');
        }

        System.out.print(out);
    }
}