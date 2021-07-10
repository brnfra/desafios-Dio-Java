import java.io.*;

public class Atalho {
    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("busca_e_substituicao/" +
                "atalho_weblogger/inputs.txt"));
        String word, parte1, parte2, val;
        boolean[] aberto = new boolean[2];
        aberto[0]=false;
        aberto[1]=false;
        int i;

        while (br.ready()) {
            word = br.readLine();
            for (i = 0; i< word.length();i++){
                val = word.substring(i, i + 1);
                if(val.equals("*")){

                    parte1=word.substring(0,i);
                    parte2=word.substring(i+1,word.length());
                    parte1= (aberto[0] == false )?parte1.concat("<b>"):parte1.concat("</b>");
                    word=parte1.concat(parte2);
                    if(aberto[0] == false)
                        aberto[0] = true;
                    else
                        aberto[0] = false;
                }

            }
            for (i = 0; i< word.length();i++) {
                val = word.substring(i, i + 1);
                if (val.equals("_")) {

                    parte1 = word.substring(0, i);
                    parte2 = word.substring(i + 1, word.length());
                    parte1 = (aberto[1] == false) ? parte1.concat("<i>") : parte1.concat("</i>");
                    word = parte1.concat(parte2);
                    if(aberto[1] == false)
                        aberto[1] = true;
                    else
                        aberto[1] = false;

                }
            }


            System.out.println(word);
            word=null;
        }
    }
}