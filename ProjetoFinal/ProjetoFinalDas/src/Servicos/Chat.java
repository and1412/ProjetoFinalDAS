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

    public Chat() {
    }

    
    @Override
    public ArrayList<Msg> iniciarServico() {
        ArrayList<Msg> chat = new ArrayList<Msg>();
        return chat;
    }

    @Override
    public boolean enviarMsg(Pessoa emissor, Pessoa receptor, String texto, ArrayList<Msg> servico) {
         Msg mensagem = new Msg(receptor, emissor, texto);
            if(servico.add(mensagem)) 
            {
                return true;
            }
            else 
            {
                return false;
            }
    }

    @Override
    public ArrayList<Msg> lerMsg(Pessoa usuario,Pessoa receptor, ArrayList<Msg> servico) {
        ArrayList<Msg> mensagens_chat= new ArrayList<Msg>();
                
                for(Msg msg : servico)
                {
                    if(msg.getReceptor().equals(usuario) && msg.getEmissor().equals(msg) )
                    {
                        mensagens_chat.add(msg);
                    }    
                }
                
                return mensagens_chat;
    }
    
}
