/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vitor Amorim
 */
public class SucoLaranja implements ISuco{

    @Override
    public String preparar() {
       return "Adicionar Laranja" +"\n" +"Adicionar água";
    }

    @Override
    public double informarPreco() {
        return 4;
    }
    
}
