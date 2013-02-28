/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicos;

import Autenticacao.Pessoa;
import java.util.ArrayList;

/**
 *
 * @author André Cruz
 */
public class Chat extends Servico {

    @Override
    public ArrayList<Msg> iniciarServico() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public boolean enviarMsg(Pessoa emissor, Pessoa receptor, String texto, ArrayList<Msg> Mensagem) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public ArrayList<Msg> lerMsg(Pessoa usuario, ArrayList<Msg> Mensagem) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
