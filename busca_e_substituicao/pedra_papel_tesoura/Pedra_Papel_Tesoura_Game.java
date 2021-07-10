import java.io.*;
import java.util.StringTokenizer;

class Game {

    private String wordJ1;
    private String wordJ2;
    private int vencedor;
    private boolean valid;

    public Game(String _wordJ1, String _wordJ2) {
        this.wordJ1 = _wordJ1;
        this.wordJ2 = _wordJ2;
        setVencedor(checkVencedor(_wordJ1, _wordJ2));

    }

    public int getVencedor() {
        return vencedor;
    }

    public void setVencedor(int vencedor) {
        this.vencedor = vencedor;
    }

    public String getWordJ1() {
        return wordJ1;
    }

    public void setWordJ1(String wordJ1) {
        this.wordJ1 = wordJ1;
    }

    public String getWordJ2() {
        return wordJ2;
    }

    public void setWordJ2(String wordJ2) {
        this.wordJ2 = wordJ2;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }



    public int checkVencedor(String _wordJ1, String _wordJ2) {

        if (_wordJ1 == null || _wordJ2 == null) return -100;

        if(_wordJ1.equals("tesoura") && _wordJ2.equals("papel")){
            return 1;
        }else if(_wordJ2.equals("tesoura") && _wordJ1.equals("papel")){
            return 2;
        }
        if(_wordJ1.equals("papel") && _wordJ2.equals("pedra")){
            return 1;
        }else if(_wordJ2.equals("papel") && _wordJ1.equals("pedra")){
            return 2;
        }


        if(_wordJ1.equals("pedra") && _wordJ2.equals("lagarto")){
            return 1;
        }else if(_wordJ2.equals("pedra") && _wordJ1.equals("lagarto")){
            return 2;
        }

        if(_wordJ1.equals("lagarto") && _wordJ2.equals("spock")){
            return 1;
        }else if(_wordJ2.equals("lagarto") && _wordJ1.equals("spock")){
            return 2;
        }

        if(_wordJ1.equals("spock") && _wordJ2.equals("tesoura")){
            return 1;
        }else if(_wordJ2.equals("spock") && _wordJ1.equals("tesoura")){
            return 2;
        }

        if(_wordJ1.equals("tesoura") && _wordJ2.equals("lagarto")){
            return 1;
        }else  if(_wordJ2.equals("tesoura") && _wordJ1.equals("lagarto")){
            return 1;
        }

        if(_wordJ1.equals("lagarto") && _wordJ2.equals("papel")){
            return 1;
        }else  if(_wordJ2.equals("lagarto") && _wordJ1.equals("papel")){
            return 2;
        }

        if(_wordJ1.equals("papel") && _wordJ2.equals("spock")){
            return 1;
        }else if(_wordJ2.equals("papel") && _wordJ1.equals("spock")){
            return 2;
        }

        if(_wordJ1.equals("spock") && _wordJ2.equals("pedra")){
            return 1;
        }else if(_wordJ2.equals("spock") && _wordJ1.equals("pedra")){
            return 2;
        }

        if(_wordJ1.equals("pedra") && _wordJ2.equals("tesoura")){
            return 1;
        }else if(_wordJ2.equals("pedra") && _wordJ1.equals("tesoura")){
            return 2;
        }

        if(_wordJ1.equals(_wordJ2) || _wordJ2.equals(_wordJ1)){
            return 0;
        }
        return 100;
    }

}

public class Pedra_Papel_Tesoura_Game {

     public static void main(String[] args) throws IOException {
                // BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

                BufferedReader  br = new BufferedReader(new FileReader("busca_e_substituicao/"+
                        "pedra_papel_tesoura/inputs.txt"));
                String[] wordJ = new String[3];
                Game key ;
                int line = 0, i = 0;
                boolean val ;

                br.readLine();
                while (br.ready()){
                //    word = br.readLine();

                    StringTokenizer st = new StringTokenizer(br.readLine());
                    i=0;
                    while (st.hasMoreTokens()){
                        wordJ[i] = st.nextToken().toLowerCase();
                        i++;
                    }

                   //
                    key = new Game(wordJ[0],wordJ[1]);
                    // jogador 1 é Fernanda jogador é Marcia
                    switch (key.getVencedor()){
                        case 1:
                            System.out.println("fernanda");
                            break;
                        case 2:
                            System.out.println("marcia");
                            break;
                        case 0:
                            System.out.println("empate");
                            break;
                        case 100:
                            System.out.println("Não foi possível checar quem venceu.");
                            break;
                        case -100:
                            System.out.println("Algum jogador não jogou!");
                            break;
                        default:
                            System.out.println("Erro desconhecido.");
                    }

                    key.setWordJ1(null);
                    key.setWordJ2(null);
                    line++;
                }

         }
}




