import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.BigInteger;import java.util.*;

class smallfactorials {
    public static void main (String[] args) throws java.lang.Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            int n = Integer.parseInt(br.readLine());
            BigInteger result = new BigInteger("1");

            for (int i = 2; i <= n; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
            System.out.println(result);
        }
    }
}
