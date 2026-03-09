package executavel;

public class Main {

	public static void main(String[] args) {
		Pessoa [] p = new Pessoa[2];
		Livro [] l = new Livro[3];
		
//		System.out.println("Bem Vindo!\nLivros disponiveis:\nO Hobbit(1)\nPercy Jackson(2)\nA Revolucao dos Bichos(3)");
		
		p[0] = new Pessoa("Pedro", 22, "m");
		p[1] = new Pessoa("Maria", 25, "f");
		
		l[0] = new Livro(1, p[0]);
		l[1] = new Livro(2, p[1]);
		l[2] = new Livro(3, p[1]);
		
		l[0].abrir();
//		l[0].avancarPag();
		l[0].avancarPag();
//		l[0].avancarPag();
//		l[0].avancarPag();

		l[0].voltarPag();
//		l[0].voltarPag();
//		l[0].fechar();
		
		l[0].folhearRandom();
		
		System.out.println(l[0].detalhes());

	}

}
