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
   
	public abstract ArrayList<Msg> iniciarServico();
	public abstract boolean enviarMsg(Pessoa emissor, Pessoa receptor,String texto,ArrayList<Msg> Mensagem);
	public abstract  ArrayList<Msg> lerMsg(Pessoa usuario,ArrayList<Msg> Mensagem);
    
}
