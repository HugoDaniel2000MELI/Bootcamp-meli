package POO_JAVA5.exercise1;

import POO_JAVA5.exercise1.classes.Corrida;

public class AppCorrida {
    public static void main(String[] args) {

        Corrida corridaMilhao = new Corrida(20, 1000000.0, "Corrida do Milhão", 10);

        corridaMilhao.addCarro(300, 30, 30, "RJ777");
        corridaMilhao.addCarro(200, 22, 17, "SP725");
        corridaMilhao.addMoto(400, 30,8, "RJ951");
        System.out.println(corridaMilhao.getListaVeiculos());

        corridaMilhao.deleteVeiculoComPlaca("RJ951");
//        System.out.println(corridaMilhao.veiculoVencedor());
        System.out.println(corridaMilhao.getListaVeiculos());
    }
}
