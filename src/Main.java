/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Vitor Amorim
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
//       SUCO DE LARANJA
        SucoLaranja s = new SucoLaranja();
        System.out.println("-----SUCO DE LARANJA-----");
        System.out.println("Preparo: \n"+s.preparar());
        System.out.println("Preço: R$"+ s.informarPreco());
        System.out.println();

        ComAcucarDecorator c = new ComAcucarDecorator(s);
        System.out.println("-----SUCO DE LARANJA COM AÇÚCAR-----");
        System.out.println("Preparo: \n"+c.preparar());
        System.out.println("Preço: R$"+ c.informarPreco());
        System.out.println();
        
        DescontoDecorator d = new DescontoDecorator(c);
        System.out.println("-----SUCO DE LARANJA COM AÇÚCAR E COM DESCONTO-----");
        System.out.println("Preparo: \n"+d.preparar());
        System.out.println("Preço: R$"+ d.informarPreco());
        System.out.println();
        
//       SUCO DE UVA 
        SucoUva su = new SucoUva();
        System.out.println("-----SUCO DE UVA-----");
        System.out.println("Preparo: \n"+su.preparar());
        System.out.println("Preço: R$"+ su.informarPreco());
        System.out.println();
        
        DescontoDecorator dd = new DescontoDecorator(su);
        System.out.println("-----SUCO DE UVA COM DESCONTO-----");
        System.out.println("Preparo: \n"+dd.preparar());
        System.out.println("Preço: R$"+ dd.informarPreco());
        System.out.println();
        
        ComAcucarDecorator cad = new ComAcucarDecorator(dd);
        System.out.println("-----SUCO DE UVA COM AÇÚCAR E DESCONTO-----");
        System.out.println("Preparo: \n"+cad.preparar());
        System.out.println("Preço: R$"+ cad.informarPreco());
        System.out.println();

    }
    
}
