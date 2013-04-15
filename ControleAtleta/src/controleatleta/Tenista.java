package controleatleta;

import java.util.ArrayList;
import java.util.HashMap;

public class Tenista extends Atleta{

    private int posicaoRankMundial;
    private double fortunaAcumuladaJogos;
    private double fortunaAcumuladaPropagandas;
    private TipoQuadra quadraPreferida;
    private ArrayList<Patrocinador> patrocinadores = new ArrayList<Patrocinador>();
    private HashMap<String, Integer> nomeQuantidadeTitulosGanhos = new HashMap<String, Integer>();
    private HashMap<Integer, Integer> vitoriasPorAno = new HashMap<Integer, Integer>();
    private HashMap<Integer, Integer> derrotasPorAno = new HashMap<Integer, Integer>();
    
    public Tenista(String nome) {
        super(nome);
    }

    public HashMap<Integer, Integer> getDerrotasPorAno() {
        return derrotasPorAno;
    }

    public TipoQuadra getQuadraPreferida() {
        return quadraPreferida;
    }

    public void setQuadraPreferida(TipoQuadra quadraPreferida) {
        this.quadraPreferida = quadraPreferida;
    }
    
    public void setDerrotasPorAno(HashMap<Integer, Integer> derrotasPorAno) {
        this.derrotasPorAno = derrotasPorAno;
    }

    public double getFortunaAcumuladaJogos() {
        return fortunaAcumuladaJogos;
    }

    public void setFortunaAcumuladaJogos(double fortunaAcumuladaJogos) {
        this.fortunaAcumuladaJogos = fortunaAcumuladaJogos;
    }

    public double getFortunaAcumuladaPropagandas() {
        return fortunaAcumuladaPropagandas;
    }

    public void setFortunaAcumuladaPropagandas(double fortunaAcumuladaPropagandas) {
        this.fortunaAcumuladaPropagandas = fortunaAcumuladaPropagandas;
    }

    public HashMap<String, Integer> getNomeQuantidadeTitulosGanhos() {
        return nomeQuantidadeTitulosGanhos;
    }

    public void setNomeQuantidadeTitulosGanhos(HashMap<String, Integer> nomeQuantidadeTitulosGanhos) {
        this.nomeQuantidadeTitulosGanhos = nomeQuantidadeTitulosGanhos;
    }

    public ArrayList<Patrocinador> getPatrocinadores() {
        return patrocinadores;
    }

    public void setPatrocinadores(ArrayList<Patrocinador> patrocinadores) {
        this.patrocinadores = patrocinadores;
    }

    public int getPosicaoRankMundial() {
        return posicaoRankMundial;
    }

    public void setPosicaoRankMundial(int posicaoRankMundial) {
        this.posicaoRankMundial = posicaoRankMundial;
    }

    public HashMap<Integer, Integer> getVitoriasPorAno() {
        return vitoriasPorAno;
    }

    public void setVitoriasPorAno(HashMap<Integer, Integer> vitoriasPorAno) {
        this.vitoriasPorAno = vitoriasPorAno;
    }
        
        
}