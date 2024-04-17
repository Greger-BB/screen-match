package screenmatch.modelos;

import screenmatch.calculos.Classificavel;

/**
 *  Classe filmes além de herdar de Titulos, também possui dois novos atributos e um novo método.
 *  O método retornará a ficha técnica do filme.
 */
public class Filmes extends Titulos implements Classificavel{

    public Filmes(String titulo) {
        
        super(titulo);
    }

    private String diretor;
    private int duracaoEmMinutos;

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void exibirFichaTecnica() {

        System.out.println("******************************************");
        System.out.println("Título do filme: " + this.getTitulo());
        System.out.println("Diretor: " + this.getDiretor());
        System.out.println("Ano de lançamento: " + this.getAnoDeLancamento());
        System.out.println("Duração: " + this.getDuracaoEmMinutos() + " minutos");
        System.out.println("Nota: " + retornaMedia());
        System.out.println("******************************************");
    }

    @Override
    public double getClassificacao() {
        
        return retornaMedia() / 2;
    }
}
