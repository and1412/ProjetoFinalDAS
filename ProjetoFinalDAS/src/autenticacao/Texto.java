package autenticacao;

public class Texto extends Autenticacao {

String lixo=null;

	
	public boolean autenticar(String nome, String senha)
	{
		lixo=nome;
		lixo=senha;
		return false;
	}

	
	public void cadastrar(String nome, String senha)
	{
		lixo=nome;
		lixo=senha;
		
		 
	}

	
	public void alterar(String nome, String senha, String novoNome,
			String novaSenha) 
	{
		lixo=nome;
		lixo=senha;
		 
	}

	
	public void excluir(String nome, String senha) 
	{
		lixo=nome;
		lixo=senha;
		 
	}

}
