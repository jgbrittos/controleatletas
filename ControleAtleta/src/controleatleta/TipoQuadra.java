
package controleatleta;

public class TipoQuadra {
    
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
