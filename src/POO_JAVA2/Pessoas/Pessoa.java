package POO_JAVA2.Pessoas;

public class Pessoa {
    String nome;
    int idade;
    String id;
    double peso;
    double altura;

    public Pessoa(){}

    public  Pessoa(String nome, int idade, String id){
        this.nome = nome;
        this.idade = idade;
        this.id = id;
    }

    public  Pessoa(String nome, int idade, String id, double peso, double altura){
        this.nome = nome;
        this.idade = idade;
        this.id = id;
        this.peso = peso;
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public double getPeso() {
        return peso;
    }

    public int getIdade() {
        return idade;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int calcularIMC(){
        double imc = this.peso/(Math.pow(this.altura,2));
        if(imc >= 20 || imc <= 25){
            return 0;
        } else if (imc < 20) {
            return -1;
        }else {
            return 1;
        }
    }

    public boolean ehMaiorIdade(){
        return this.idade >= 18;
    }
}
