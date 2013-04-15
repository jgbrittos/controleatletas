package ValidaDados;

import java.util.Date;

public class ValidaDados {

    public static void validarNome(String nome) throws Exception {

        String validos = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZãõñáéíóú";

        if (nome == null) {
            throw new Exception("Nome inválido!");
        } else if (nome.isEmpty()) {
            throw new Exception("Nome inválido!");
        } else {
            for (int i = 0; i < nome.length(); i++) {
                if (validos.indexOf(nome.charAt(i)) == -1) {
                    throw new Exception("Caracter inválido!");
                }
            }
        }
    }
    
    public static void validarPeso(String peso) throws Exception{
        
        String validos = "0123456789.,";
        
        if(peso.isEmpty()){
            throw new Exception("Peso inválido!");
        }
        for(int i = 0; i<peso.length();i++){
            if (validos.indexOf(peso.charAt(i)) == -1) {
                throw new Exception("Caracter inválido!");
            }
        }
        
        peso = peso.replace(',' , '.');
        
        Float pe;
        try{
            pe = Float.parseFloat(peso);
        }catch(Exception e){
            throw new Exception("Peso inválido!");
        } if (pe < 2.5 || pe > 400){
            throw new Exception("Peso inválido!");
        }
        
    }
    
    public static void validarAno(String ano) throws Exception{
        
        String validos = "0123456789";
        
        if(ano.isEmpty()){
            throw new Exception("Ano inválido!");
        }
        for(int i = 0; i<ano.length();i++){
            if (validos.indexOf(ano.charAt(i)) == -1) {
                throw new Exception("Caracter inválido!");
            }
        }
               
        Integer anoTitulo;
        try{
            anoTitulo = Integer.parseInt(ano);
        }catch(Exception e){
            throw new Exception("Ano inválido!");
        } if (anoTitulo < 1900 || anoTitulo > 2013){
            throw new Exception("Ano inválido!");
        }
        
    }
    
    public static void validarQuantidade(String qntd) throws Exception{
        
        String validos = "0123456789";
        
        if(qntd.isEmpty()){
            throw new Exception("Quantidade inválida!");
        }
        for(int i = 0; i<qntd.length();i++){
            if (validos.indexOf(qntd.charAt(i)) == -1) {
                throw new Exception("Caracter inválido!");
            }
        }
               
        Integer qntdTitulo;
        try{
            qntdTitulo = Integer.parseInt(qntd);
        }catch(Exception e){
            throw new Exception("Quantidade inválida!");
        } if (qntdTitulo < 0 || qntdTitulo > 1000){
            throw new Exception("Quantidade inválida!");
        }
        
    }
    
    public static void validarRank(String rank) throws Exception{
        
        String validos = "0123456789";
        
        if(rank.isEmpty()){
            throw new Exception("Rank inválido!");
        }
        for(int i = 0; i<rank.length();i++){
            if (validos.indexOf(rank.charAt(i)) == -1) {
                throw new Exception("Caracter inválido!");
            }
        }
               
        Integer rankMundial;
        try{
            rankMundial = Integer.parseInt(rank);
        }catch(Exception e){
            throw new Exception("Rank inválido!");
        } if (rankMundial < 0 || rankMundial > 500){
            throw new Exception("Rank inválido!");
        }
        
    }
    
    public static void validarFortuna(String fortuna) throws Exception{
        
        String validos = "0123456789.,";
        
        if(fortuna.isEmpty()){
            throw new Exception("Fortuna inválido!");
        }
        for(int i = 0; i<fortuna.length();i++){
            if (validos.indexOf(fortuna.charAt(i)) == -1) {
                throw new Exception("Caracter inválido!");
            }
        }
        
        fortuna = fortuna.replace(',' , '.');
        
        double fort;
        try{
            fort = Double.parseDouble(fortuna);
        }catch(Exception e){
            throw new Exception("Fortuna inválida!");
        } if (fort > 1000000000000000.00 || fort < 0.0){
            throw new Exception("Fortuna inválida!");
        }
        
    }
}
