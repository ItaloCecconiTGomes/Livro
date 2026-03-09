package executavel;

public class Pessoa {
	
	private String nome;
	private int idade;
	private String sexo;
	
	public Pessoa(String nome, int idade, String sexo) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;
	}
	
	public void fazerAniversario() {
		this.setIdade(this.getIdade() + 1);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		if(this.idade > 120){
			System.out.println("Idade Invalida!");
		}else {
			this.idade = idade;
		}
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		if(this.sexo.equalsIgnoreCase("m") || this.sexo.equalsIgnoreCase("f")) {
			this.sexo = sexo;
		}else {
			System.out.println("Insira m ou f para indicar o sexo.");
		}
	}
	
	

}
