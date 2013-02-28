/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Autenticacao;

/**
 *
 * @author Ramon
 */
public class Pessoa
{
    private String nome;
    private String senha;

    Pessoa(){};
    Pessoa(String nome, String senha) 
    {
        this.nome=nome;
        this.senha=senha;
    }
    
    
    public void setNome(String nome)
    {
        this.nome=nome;
    }
    public void setSenha(String senha)
    {
        this.senha=senha;
    }
    
    public String getNome()
    {   
        return nome;
    }
    public String getSenha()
    {
        return senha;
    }
    
}
