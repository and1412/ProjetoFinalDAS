/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicos;

import Autenticacao.Pessoa;

/**
 *
 * @author André Cruz
 */
public class Msg {
    
    Pessoa receptor;
    Pessoa emissor;
    String Texto;

    public Msg(Pessoa receptor, Pessoa emissor, String Texto) {
        this.receptor = receptor;
        this.emissor = emissor;
        this.Texto = Texto;
    }

    public Pessoa getReceptor() {
        return receptor;
    }

    public Pessoa getEmissor() {
        return emissor;
    }

    public String getTexto() {
        return Texto;
    }

    public void setReceptor(Pessoa receptor) {
        this.receptor = receptor;
    }

    public void setEmissor(Pessoa emissor) {
        this.emissor = emissor;
    }

    public void setTexto(String Texto) {
        this.Texto = Texto;
    }
    
    
 
    
}
