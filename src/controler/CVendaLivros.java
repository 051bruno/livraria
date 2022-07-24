/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controler;

import java.util.ArrayList;
import model.vendaLivro;

/**
 *
 * @author jairb
 */
public class CVendaLivros {
    ArrayList<vendaLivro> vendaLivros = new ArrayList<>();
    
    public void addVendaLivro(vendaLivro vl){
        vendaLivros.add(vl);
    }

    public ArrayList<vendaLivro> getVendaLivros() {
        return vendaLivros;
    }    
    
}
