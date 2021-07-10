import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class Words implements Comparable<Words> {
    private String letras;
    private int tamanho;

    //construct
    public Words(String palavra){
        this.letras = palavra;
        setTam(palavra.length());
    }

    public String getLetras() {
        return letras;
    }

    public void setLetras(String letras) {
        this.letras = letras;
    }

    public int getTam() {
        return tamanho;
    }

    public void setTam(int tam) {
        this.tamanho = tam;
    }

    @Override
    public int compareTo(Words words) {
        //regras de enunciado
        if(this.getTam() == words.getTam()) return this.letras.compareTo(words.getLetras());
        //decrescente
        return words.getTam() - this.getTam();
    }
}


public class Palavras {
    public static void main(String[] args) throws IOException {
        int linhas = 0, qnt = 0 ;
        String word;
        List<Words> wordList = new ArrayList<>();
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //BufferedReader br = new BufferedReader(new FileReader("src/com/ed/exercises/input.in"));
        BufferedReader br = new BufferedReader(new FileReader("desafios_dio/busca_e_substituicao/"+
                "sort_palavra_por_tamanho/inputs.txt"));
        StringTokenizer fileIn;
        //le stream de entrada
        while (br.ready()){
            word = br.readLine();

            if( linhas == 0 )qnt = Integer.parseInt(word);

            //trato a linha
            if(linhas > 0){
                fileIn =new StringTokenizer(word);
                while(fileIn.hasMoreTokens()){
                    //trato palavras na linha na ordem da lista
                    wordList.add(new Words(fileIn.nextToken()));
                }
                //Collections.sort(wordList, new compareTo());
               // wordList.sort((first ,second) -> second.getTam() - first.getTam());
                wordList.sort(Words::compareTo);
                for (Words name : wordList ) {
                    System.out.print(name.getLetras()+" ");

                }
            }

            System.out.println();
            wordList.clear();
            linhas++;

        }
        br.close();
    }
}