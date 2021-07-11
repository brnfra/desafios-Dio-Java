import java.io.*;

public class Atalho {
    public static void main(String[] args) throws IOException {
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader br = new BufferedReader(new FileReader("busca_e_substituicao/" +
                "atalho_weblogger/inputs.txt"));
        String word, parte1, parte2, parte3, aux = "", val;
        boolean[] aberto = new boolean[2];
        aberto[0] = false;
        aberto[1] = false;
        int i, fecha;

        while (br.ready()) {
            word = br.readLine();
            for (i = 0; i < word.length(); i++) {
                val = word.substring(i, i + 1);
                if (val.equals("*")) {

                    parte1 = word.substring(0, i);
                    fecha = word.indexOf("*", i + 1);
                    parte2 = word.substring(i + 1, fecha);
                    parte3 = word.substring(fecha + 1, word.length());
                    parte1 = parte1 + "<b>";
                    //usando método concat
  //                  parte1 = parte1.concat("<b>");
                    parte2 = parte2 + "</b>";
  //                  parte2 = parte2.concat("</b>");
                    word="";
                    word=parte1+parte2+parte3;

//                    word = word.concat(parte1);
//                    word = word.concat(parte2);
//                    word = word.concat(parte3);
                  }

                }

                for (i = 0; i < word.length(); i++) {
                    val = word.substring(i, i + 1);
                    if (val.equals("_")) {

                        parte1 = word.substring(0, i);
                        parte2 = word.substring(i + 1, word.length());
                        parte1 = (aberto[1] == false) ? parte1.concat("<i>") : parte1.concat("</i>");
                        word = parte1.concat(parte2);
                        if (aberto[1] == false)
                            aberto[1] = true;
                        else
                            aberto[1] = false;

                    }
                }


                System.out.println(word);
                word = null;
            }
        }
    }
