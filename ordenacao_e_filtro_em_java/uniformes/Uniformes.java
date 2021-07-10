
import java.io.*;
import java.util.*;


public class Uniformes {

    public static void main(String[] args)throws IOException {

         int line = 0 ;
         final int N = 61;
         final String[] branco = new String[3];
         final String[] vermelho = new String[3];
          branco[0] = "branco P";
          branco[1] = "branco M";
          branco[2] = "branco G";
          vermelho[0]= "vermelho P";
          vermelho[1] = "vermelho M";
          vermelho[2] = "vermelho G";

        List<String> input = new ArrayList<>();

        Set<String> itens = new HashSet<>();

        //mapa chavexvalor(lista) ordem maior menor
        Map<String,List<String>> rel_branco = new TreeMap<String,List<String>>().descendingMap();
        rel_branco.put(branco[0], new ArrayList<>());
        rel_branco.put(branco[1], new ArrayList<>());
        rel_branco.put(branco[2], new ArrayList<>());

        Map<String,List<String>> rel_vermelho = new TreeMap<String,List<String>>().descendingMap();
        rel_vermelho.put(vermelho[0], new ArrayList<>());
        rel_vermelho.put(vermelho[1], new ArrayList<>());
        rel_vermelho.put(vermelho[2], new ArrayList<>());
        
        int qnt =0;
        String saida = "";
        //TIPOS DE ENTRADAS
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader br = new BufferedReader(new FileReader("src/com/ed/exercises/input.in"));
        BufferedReader br = new BufferedReader(new FileReader("src/bootcampdio_java/inputs.txt"));
       //le stream de entrada

        while(br.ready()){

            input.add(br.readLine());
            qnt=Integer.parseInt(input.get(0));
            for (int i = 0; i < vermelho.length; i++) {
                if(input.get(line).equals(branco[i])){
                    //ADD na chave branco[i]
                    rel_branco.get(branco[i]).add(input.get(line-1));
                 
                }
                if(input.get(line).equals(vermelho[i])){
                    //ADD na chave vermelho[i]
                    rel_vermelho.get(vermelho[i]).add(input.get(line-1));
                }
                if(input.get(line).equals("0"))  break;
                
            }
            if(input.get(line).equals("0"))  break;
            line++;
            
        }

        List<String> sortedKeysB = new ArrayList(rel_branco.keySet());
       // Collections.reverse(sortedKeys);

        Collections.sort(rel_branco.get(branco[0]));
        Collections.sort(rel_branco.get(branco[1]));
        Collections.sort(rel_branco.get(branco[2]));

        List<String> sortedKeysV = new ArrayList(rel_vermelho.keySet());
        Collections.sort(rel_vermelho.get(vermelho[0]));
        Collections.sort(rel_vermelho.get(vermelho[1]));
        Collections.sort(rel_vermelho.get(vermelho[2]));

        //saida relacao brancas
        for (String key : sortedKeysB) {
            List<String> value = rel_branco.get(key);
            for(String item : value){
                System.out.println(key + " " + item);
            }
        }
        //saida relacao vermelhas
        for (String key : sortedKeysV) {
            List<String> value = rel_vermelho.get(key);
            for(String item : value){
                System.out.println(key + " " + item);
            }
        }

          br.close();

    }  

}
