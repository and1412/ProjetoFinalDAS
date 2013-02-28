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
public class Msg_OFF extends Servico{

    private ArrayList <Msg> mensagens_off;
    
    @Override
    public ArrayList<Msg> iniciarServico() {
        mensagens_off = new ArrayList<Msg>();
        return mensagens_off;
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
        ArrayList<Msg> mensagens_usuario= new ArrayList<Msg>();
                
                for(Msg msg : servico)
                {
                    if(msg.getReceptor().equals(usuario))
                    {
                        mensagens_usuario.add(msg);
                    }    
                }
                
                return mensagens_usuario;
		
    }
    
}
