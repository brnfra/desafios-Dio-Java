
import java.io.*;
import java.util.*;


public class Fila_Banco {

/*
* Para cada caso de teste imprima uma linha, contendo um inteiro,
* indicando o número de
* clientes que não precisaram trocar de lugar mesmo após a fila ser reordenada.
*
* */
   public static void main(String[] args) throws IOException{
            int qnt =0;
            int line=0;
            String aux;
            String saida = "";
            List<String> fila = new ArrayList<>();
            List<Integer> filaC = new ArrayList<>();
            int []clienteNum = new int[1000];
            List<String> input = new ArrayList<>();

            //TIPOS DE ENTRADAS
            //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            //BufferedReader br = new BufferedReader(new FileReader("src/com/ed/exercises/input.in"));
            BufferedReader br = new BufferedReader(new FileReader("src/bootcampdio_java/in_fila.txt"));
            //le stream de entrada
            while(br.ready()){
                String linhas = br.readLine();
                input.add(linhas);
                qnt=Integer.parseInt(input.get(0));
                line++;
            }
      for (int i = 1;i <= input.size()-1;i++) {
          StringTokenizer it = new StringTokenizer(input.get(i));
          int ind =0;
          int comparador = 0;
        if(i%2 == 0) {
            //preenchendo os vetores
            fila.add(input.get(i));
            while(it.hasMoreTokens()) {
                aux = it.nextToken();
                clienteNum[ind] = Integer.parseInt(aux);
                filaC.add(Integer.parseInt(aux));
                ind++;
            }

            //reverse sort
            Collections.sort(filaC, Collections.reverseOrder());
            int k = 0;
            for (int cliente : filaC ) {

                int v = clienteNum[k];

                if( v != filaC.get(k) ){
                    comparador++;
                }
                k++;
            }
            System.out.println(filaC.size() - comparador);
            filaC.clear();

        }



      }



    }
}
