import Pessoas.Pessoa;


    public class Main {
        public static void main(String[] args) {
            Pessoa pessoa = new Pessoa();
            Pessoa pessoa1 = new Pessoa("Hugo", 22, "M5222");
            Pessoa pessoa2 = new Pessoa("Hugo", 22, "M7222", 70.5, 1.80);

            if(pessoa2.calcularIMC() == 1){
                System.out.println(pessoa2.getNome() + " esta com sobrepeso");
            } else if (pessoa2.calcularIMC() == -1) {
                System.out.println(pessoa2.getNome() + " esta abaixo do peso");
            }else {
                System.out.println(pessoa2.getNome() + " esta no peso ideal");
            }

        }
    }