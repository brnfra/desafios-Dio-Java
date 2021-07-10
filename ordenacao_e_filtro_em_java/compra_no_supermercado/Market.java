import java.io.*;
import java.util.*;


public class Market {

    public static void main(String[] args)throws IOException {

         int line = 0 ;

        List<String> listas = new ArrayList<>();
        Set<String> itens = new HashSet<>();

        String saida = "";
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader br = new BufferedReader(new FileReader("src/com/ed/exercises/input.in"));
        BufferedReader br = new BufferedReader(new FileReader("ordenacao_e_filtro_em_java/"+
                "compra_no_supermercado/inputs.txt"));
        //le stream de entrada

        while(br.ready()){

            listas.add(br.readLine());
            line++;
        }
        StringTokenizer it ;

        for(int i = 1 ;i < line; i++){
            it = new StringTokenizer(listas.get(i));
            while(it.hasMoreTokens()){
                itens.add(it.nextToken());
            }
            TreeSet sortedItens = new TreeSet<String>(itens);
            saida = sortedItens.toString().replaceAll("[^a-z]"," ");
            System.out.println(saida);
            itens.clear();

        }
        
       br.close();

    }

}