/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vitor Amorim
 */
public class DescontoDecorator extends SucoDecorator{

    public DescontoDecorator(ISuco suco) {
        super(suco);
    }

    @Override
    public double informarPreco() {
        return super.informarPreco() - (super.informarPreco() * 0.10);//To change body of generated methods, choose Tools | Templates.
    }

    
    
    
}
