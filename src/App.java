import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javafx.print.Collation;
import screenmatch.calculos.CalculadoraDeTempo;
import screenmatch.calculos.FiltroRecomendacao;
import screenmatch.modelos.Filmes;
import screenmatch.modelos.Series;
import screenmatch.modelos.Titulos;

public class App {
    public static void main(String[] args) throws Exception {
        
        Filmes condeMonteCristo = new Filmes("O Conde de Monte Cristo");
        condeMonteCristo.setAnoDeLancamento(2002);
        condeMonteCristo.setDuracaoEmMinutos(131);
        condeMonteCristo.setDiretor("Kevin Reynolds");
        condeMonteCristo.avaliaTitulo(10);
        condeMonteCristo.exibirFichaTecnica();

        Series vikings = new Series("Vikings");
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

        ArrayList<Titulos> listaDeTitulos = new ArrayList<>();
        listaDeTitulos.add(condeMonteCristo);
        listaDeTitulos.add(vikings);
        for (Titulos titulo : listaDeTitulos) {
            System.out.println(titulo);
        }
        System.out.println(listaDeTitulos);
        Collections.sort(listaDeTitulos);
        System.out.println(listaDeTitulos);
        listaDeTitulos.sort(Comparator.comparing(Titulos::getAnoDeLancamento));
        System.out.println(listaDeTitulos);
    }
}
