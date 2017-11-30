/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import Control.PanelTabuleiroControl.corDoJogadorDaVez;
import Util.EnumDado;
import java.util.Random;

/**
 *
 * @author paabl
 */
public class Jogador {
    

    private String name; 
    private String dataDeNascimento;
    private String login;
    private String senha; 
    private String avatar;

    public Jogador() {
         randomGenerator = new Random();
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
 
    
    private Peça[] peças;
    private final Random randomGenerator;
    private int indexPeçaAtualEscolhida;
    private int qtdPeçasNaChegada = 0;

    public int getQtdPeçasNabase() {
        
        int qtdPeçasNabaseAux = 0;
        
        for(Peça p: peças){
            if(p.naBase == true)
                qtdPeçasNabaseAux++;
                
        }
        return qtdPeçasNabaseAux;
    }
    
    public boolean venceu(){
        return (qtdPeçasNaChegada == 4);
    }
    
    public void incrementaNumPeçasNaChegada(corDoJogadorDaVez cor){
        qtdPeçasNaChegada++;
        System.out.println(cor+": quantiade de peças na chegada:  "+qtdPeçasNaChegada);
        System.out.println("peçaEscolhida: "+indexPeçaAtualEscolhida);
        
    }

    public Jogador(Peça[] peças) {
        randomGenerator = new Random();
        this.peças = peças;

    }
    
    
    public void lancarDados(){
        Tabuleiro.lancarDados();
    }
    
    public void lancarDado(EnumDado dado){
        if(dado == EnumDado.Primeiro)
            Tabuleiro.lancarDadoUm();
        else{
            Tabuleiro.lancarDadoDois();
        }
    }


    public Peça escolhePeçaRandom(){
        indexPeçaAtualEscolhida = randomGenerator.nextInt(3);
        return getPeçaEscolhida();
    }

    public Peça escolhePeça(int index){
        this.indexPeçaAtualEscolhida = index;
        return getPeçaEscolhida();
    }
    
    
    public Peça getPeçaEscolhida(){
        return peças[indexPeçaAtualEscolhida];
    }      
}
