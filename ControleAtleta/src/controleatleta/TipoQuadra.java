
package controleatleta;

public class TipoQuadra {
    
<<<<<<< HEAD
    
=======
>>>>>>> 48a47197093014719dee6361ebf902a52076c6b3
    public static final byte HARD_COURT_INDICE = 0;
    public static final byte CLAY_INDICE = 1;
    public static final byte GRASS_INDICE = 2;
    public static final String HARD_COURT_VALOR = "Hard Court";
    public static final String CLAY_VALOR = "Clay";
    public static final String GRASS_VALOR = "Grass";
    
    private String nome;

    public TipoQuadra(String nome){
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }
    
    
}
