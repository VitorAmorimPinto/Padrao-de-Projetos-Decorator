/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vitor Amorim
 */
public class ComAcucarDecorator extends SucoDecorator{

    public ComAcucarDecorator(ISuco suco) {
        super(suco);
    }

    @Override
    public double informarPreco() {
        return super.informarPreco() + 0.5; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String preparar() {
        return super.preparar() +"\n" +"Adicionar Açúcar"; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
