
import Pacote.Automovel;
import Pacote.Carro;
import Pacote.Corrida;
import Pacote.Pista;
import Pacote.Moto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class AP 
    {
        
    public static void main( String[] args )
    {
        Automovel fordfiesta = new Carro();
        Automovel UnoComEscada = new Carro();
        
        Automovel Crosser = new Moto();
        Automovel XJ6 = new Moto();
        
       Corrida corrida = new Corrida();
       Pista AyrtonSenna = new Pista();
       corrida.pistaEscolhida(AyrtonSenna);
       
       corrida.addAutomovel(fordfiesta);
       corrida.addAutomovel(UnoComEscada);
                                                                                                                                                                      
       corrida.addAutomovel(Crosser); 
       corrida.addAutomovel(XJ6); 


       
       corrida.iniciarCorrida();
    }
    
}
