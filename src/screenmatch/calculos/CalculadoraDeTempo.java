package screenmatch.calculos;

import screenmatch.modelos.Titulos;

public class CalculadoraDeTempo {
    
    private int totalDeTempo;

    public int getTotalDeTempo() {
        return totalDeTempo;
    }

    public void incluiTitulo(Titulos titulo) {

        this.totalDeTempo += titulo.getDuracaoEmMinutos();
    }
    
}
