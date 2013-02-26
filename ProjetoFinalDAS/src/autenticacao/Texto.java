package autenticacao;

public class Texto extends Autenticacao {

String lixo=null;

	
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
