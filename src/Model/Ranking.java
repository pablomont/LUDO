/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Jose George
 */
public class Ranking {
    
    private String login; 
    private int partJogadas; 
    private int quantidadeVitorias;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getPartJogadas() {
        return partJogadas;
    }

    public void setPartJogadas(int partJogadas) {
        this.partJogadas = partJogadas;
    }

    public int getQuantidadeVitorias() {
        return quantidadeVitorias;
    }

    public void setQuantidadeVitorias(int quantidadeVitorias) {
        this.quantidadeVitorias = quantidadeVitorias;
    }
    
    
    
}
