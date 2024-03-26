/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Pacote;

/**
 *
 * @author Admin
 */
public class Carro implements Automovel{
    
    @Override
    public String ligar() {
        return "RAWWW";
    }
    @Override
    public String acelerar (){
        return "VRUMMMM";
    }

    @Override
    public String freiar() {
        return "IRRR";
    }

    @Override
    public String desligar() {
        return "TCHIRR";
    }
    
}
