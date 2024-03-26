/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pacote;

import java.util.*;

/**
 *
 * @author Admin
 */
public class Corrida {
    public Date inicio;
    Pista pistaEscolhida;
    private ArrayList<Automovel> automoveis = new ArrayList<Automovel>();

    public void addAutomovel(Automovel a){
        this.automoveis.add(a);
    }
    
    public void pistaEscolhida(Pista pista){
        this.pistaEscolhida = pista;    
    }
    
    private void liguemSeusMotores(){
        for(Automovel a : this.automoveis){
           System.out.println(a.ligar());
           System.out.println(a.acelerar());
           System.out.println(a.freiar());
           System.out.println(a.desligar());
        }
    }
        
        public void iniciarCorrida(){
            this.liguemSeusMotores();
        }   
}
