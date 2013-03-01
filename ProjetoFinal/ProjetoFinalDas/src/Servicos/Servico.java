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
public abstract class Servico {
    
    public static Servico criarServico (int numero) {
		
		Servico servico;
		switch (numero){ 
		case 1: 
			return servico = new Chat();
		case 2: 
			return servico = new Msg_OFF();
		default:
			return null;
		}	
	}
   
	public abstract ArrayList<Msg> iniciarServico();
	public abstract boolean enviarMsg(Pessoa emissor, Pessoa receptor,String texto,ArrayList<Msg> mensagens);
	public abstract  ArrayList<Msg> lerMsg(Pessoa usuario,Pessoa receptor,ArrayList<Msg> mensagem);
        public abstract void imprimir(ArrayList<Msg> mensagem);
}
