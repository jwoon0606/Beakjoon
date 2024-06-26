import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();
        int sum = 0;
        for (byte num : br.readLine().getBytes()) {
            sum += num - '0';
        }
        StringBuilder sb = new StringBuilder();
        sb.append(sum).append("\n");
        System.out.print(sb);
    }
}
