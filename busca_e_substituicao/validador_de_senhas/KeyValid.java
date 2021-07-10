import java.io.*;

class Criterio{

    private String word;
    private int points;
    private int comprimento;
    private boolean valid;

    public Criterio(String _word) {

        this.word = _word;
        this.points = 0;
        this.comprimento = _word.length();
        if( (checkChars(_word) && checkMinimum(_word))
                && checkComprimento(_word) ) {
           setValid(true);
        } else {
           setValid(false);
        }
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public boolean checkChars(String _word) {
        String val;
        if (_word == null) return false;

        for (int i = 0; i < _word.length(); i++) {
            val = _word.substring(i, i + 1);
            //regex whitespace \s unsupported jdk 11
            if (val.matches("[^a-zA-Z0-9]") || val.matches("[\r\n\\x0B\t\\xA0\\u1680\\u180e\\u2000-\\u200a\\u202f\\u205f\\u3000\f]")) {
                return false;
            }

        }
       return true;
    }
    public boolean checkComprimento(String _word){

        return (_word.length()>=6 && _word.length()<=32);
    }
    public boolean checkMinimum(String _word){
        String val;
        int countCap = 0, countMinuscula = 0, countNum = 0;
        if (_word == null) return false;

        for (int i = 0; i < _word.length(); i++) {
            val = _word.substring(i, i + 1);
            //cap
            if (val.matches("[A-Z]")) {
                countCap++;
            }
            //min
            if (val.matches("[a-z]")) {
                countMinuscula++;
            }
            //num
            if (val.matches("[0-9]")) {
                countNum++;
            }
        }
        return (countCap>=1 && countMinuscula>=1 && countNum>=1);
    }
}

public class KeyValid {
    public final static int MAX = 200;

    public static void main(String[] args) throws IOException {
        //static BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

                BufferedReader  in = new BufferedReader(new FileReader("busca_e_substituicao/"+
                "validador_de_senhas/inputs.txt"));
                String word;
                Criterio key ;
        boolean val;
        while (in.ready()){

            word = in.readLine();
            in.readLine();
            key = new Criterio(word);
                    if(key.isValid()) {
                        System.out.println("Senha valida.");
                    } else {
                        System.out.println("Senha invalida.");
                    }
                    key.setWord(null);

                }

       }
}

