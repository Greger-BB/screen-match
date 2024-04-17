package screenmatch.modelos;

import screenmatch.calculos.Classificavel;

/**
 *  Classe Series além de herdar de Titulos, também possui quatro novos atributos e um novo método.
 *  O método retornará a ficha técnica da série.
 */

public class Series extends Titulos implements Classificavel{
    
    public Series(String titulo) {
        
        super(titulo);
    }

    private int temporadas;
    private boolean finalizado;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    public int getTemporadas() {
        return temporadas;
    }
    
    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }
    
    public boolean isFinalizado() {
        return finalizado;
    }
    
    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }
    
    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }
    
    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }
    
    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }
    
    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public int getDuracaoEmMinutos() {
        return getEpisodiosPorTemporada() * getTemporadas() * getMinutosPorEpisodio();
    }

    public void exibirFichaTecnica() {

        System.out.println("******************************************");
        System.out.println("Título da série: " + this.getTitulo());
        System.out.println("Temporadas: " + this.getTemporadas());
        System.out.println("Episódios por temporada: " + this.getEpisodiosPorTemporada());
        System.out.println("Duração dos episódios: " + this.getMinutosPorEpisodio() + " minutos");
        if (this.finalizado == true) {
            System.out.println("A série está finalizada.");
        } else {
            System.out.println("A série não está finalizada.");
        }
        System.out.println("Ano de lançamento: " + this.getAnoDeLancamento());
        System.out.println("Nota: " + retornaMedia());
        System.out.println("******************************************");
    }

    @Override
    public double getClassificacao() {
        
        return retornaMedia() / 2;
    }  
}
