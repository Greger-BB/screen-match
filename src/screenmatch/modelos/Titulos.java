package screenmatch.modelos;

/**
 *  Classe títulos, terá como filhos as classes filmes e series.
 *  Além de atributos pais, também terá dois métodos.
 *  Um método receberá um valor double como nota do filme/série e incrementará o total de notas registradas.
 *  O outro método retornará um valor double como a média das notas do filme/série.
 */

public class Titulos implements Comparable<Titulos>{

    public Titulos(String titulo) {
        setTitulo(titulo);
    }
    
    private String titulo;
    private int anoDeLancamento;
    private double somaDasNotas;
    private int totalDeNotas;

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public void avaliaTitulo(double nota) {

        somaDasNotas += nota;
        totalDeNotas++;
    }

    double retornaMedia() {
        
        return somaDasNotas / totalDeNotas;
    }

    public int getDuracaoEmMinutos() {
        return anoDeLancamento;
    }

    @Override
    public String toString() {
        
        return "Nome do título: " + getTitulo() + "(" + getAnoDeLancamento() + ")";
    }

    @Override
    public int compareTo(Titulos o) {
    
        return getTitulo().compareTo(o.getTitulo());
    }
}
