/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Autenticacao;

/**
 *
 * @author Ramon
 */
public abstract class Autenticacao 
{
        public abstract boolean autenticar(String nome, String senha);
	public abstract boolean cadastrar(String nome, String senha);
	public abstract boolean alterar(String nome, String senha, String novoNome,String novaSenha);
	public abstract boolean excluir(String nome, String senha);

}
