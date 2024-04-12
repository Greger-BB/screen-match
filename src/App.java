import screenmatch.calculos.CalculadoraDeTempo;
import screenmatch.calculos.FiltroRecomendacao;
import screenmatch.modelos.Filmes;
import screenmatch.modelos.Series;

public class App {
    public static void main(String[] args) throws Exception {
        
        Filmes condeMonteCristo = new Filmes();
        condeMonteCristo.setTitulo("O Conde de Monte Cristo");
        condeMonteCristo.setAnoDeLancamento(2002);
        condeMonteCristo.setDuracaoEmMinutos(131);
        condeMonteCristo.setDiretor("Kevin Reynolds");
        condeMonteCristo.avaliaTitulo(10);
        condeMonteCristo.exibirFichaTecnica();

        Series vikings = new Series();
        vikings.setTitulo("Vikings");
        vikings.setAnoDeLancamento(2016);
        vikings.setEpisodiosPorTemporada(12);
        vikings.setFinalizado(false);
        vikings.setTemporadas(7);
        vikings.setMinutosPorEpisodio(50);
        vikings.avaliaTitulo(10);
        vikings.exibirFichaTecnica();

        CalculadoraDeTempo calculadoraDeTempo = new CalculadoraDeTempo();
        calculadoraDeTempo.incluiTitulo(vikings);
        calculadoraDeTempo.incluiTitulo(condeMonteCristo);
        System.out.println(calculadoraDeTempo.getTotalDeTempo());
        System.out.println(vikings.getClassificacao());
        System.out.println(condeMonteCristo.getClassificacao());

        FiltroRecomendacao filtroRecomendacao = new FiltroRecomendacao();
        filtroRecomendacao.filtrar(vikings);
        filtroRecomendacao.filtrar(condeMonteCristo);
    }
}
