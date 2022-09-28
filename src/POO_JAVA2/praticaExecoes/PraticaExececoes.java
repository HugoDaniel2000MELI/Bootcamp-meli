package praticaExecoes;

public class PraticaExececoes {
    public static void main(String[] args) {
        try {
            encontrarRazao(0, 300);
        }catch(Exception exception) {
            System.out.println(exception.getMessage());
            System.out.println("Ocorreu um erro");
        }finally {
            System.out.println("Programa Finalizado");
        }
    }

    public static int encontrarRazao(int a, int b) {
        if (a == 0) {
            throw new ArithmeticException("Não pode ser dividido por zero");
        }
        return b / a;
    }
}
