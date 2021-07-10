import java.io.*;

public class MaiorSubstring {
    static PrintWriter out = new PrintWriter(System.out);

    public static void main(String[] args) throws IOException {
        //static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        BufferedReader  in = new BufferedReader(new FileReader("busca_e_substituicao/"+
                "encontre_maior_substring/inputs.txt"));
        String min, max, word1,word2  ; //declare suas variaveis aqui
        while ((   word1 = in.readLine()) != null) { // complete seu código
            word2 = in.readLine();
            if (word2.length()>word1.length()  ) {
                min = word1;
                max = word2;
            } else {
                min = word2;
                max = word1;
            }
            int minLength = min.length();
            int maxS = minLength;
            boolean f = true;
            while (maxS > 0 && f) { //altere as variaveis, se achar necessario
                int diff = minLength - maxS;
                for (int i = 0; i <= diff ;i++ ) { //complete o laco de repeticao
                    if (max.contains(min.substring(i, i + maxS))) {
                        f = false;
                        maxS++;
                        break;
                    }
                }
                maxS--;
            }
            System.out.println(maxS);
        }
        out.close();
    }

}