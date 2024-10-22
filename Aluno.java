public class Aluno extends Aula {

    //Criando um atributo para a classe Aluno
    //Usando uma super classe para o nome
    public Aluno(String nome) {
        super(nome);
    }

    //Criando um método para a saudação do aluno
    @Override
    public String saudar() {
        return "Olá Aluno " + getNome() + "!";
    }
}
