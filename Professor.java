public class Professor extends Aula {

    //Atributo da classe Professor
    public Professor(String nome) {
        super(nome);
    }

    //Usando o método saudação no programa
    @Override
    public String saudar() {
        return "Olá Prof. " + getNome() + "!";
    }
}
