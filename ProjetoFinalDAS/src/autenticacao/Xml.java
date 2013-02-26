package autenticacao;

import java.util.ArrayList;

public class Xml extends Autenticacao{

        private String  nome;
        private String senha;
	String lixo;

	
	public boolean autenticar(String nome, String senha)
	{
		lixo=nome;
		lixo=senha;
		return false;
	}
	public boolean cadastrar(String nome, String senha)
	{
		lixo=nome;
		lixo=senha;
		return false;
	}
	public boolean alterar(String nome, String senha, String novoNome,
			String novaSenha) 
	{
		lixo=nome;
		lixo=senha;
		return false;
	}

	
	public boolean excluir(String nome, String senha) 
	{
		lixo=nome;
		lixo=senha;
		return false;
	}
        
        

}
