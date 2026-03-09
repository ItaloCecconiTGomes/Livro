package executavel;

import java.util.Random;

public class Livro implements Publicacao{
	
	private int livro;
	private String titulo;
	private String autor;
	private int totPaginas;
	private int pagAtual;
	private boolean aberto;
	private Pessoa leitor;
	
	public Livro (int cl, Pessoa l) {
		this.livro = cl;
		this.leitor = l;
		this.titulo = this.getTitulo();	
		this.autor = this.getAutor();
		this.totPaginas = this.getTotPaginas();
		this.pagAtual = 0;
		this.aberto = false;
		if(cl == 1) {
//			System.out.println("Informacoes do livro: ");
			this.setTitulo("O Hobbit");
//			System.out.println("Titulo: "+this.getTitulo()); 
			this.setAutor("Tokken");
//			System.out.println("Autor: "+this.getAutor());
			this.setTotPaginas(450);
//			System.out.println("Total de paginas: "+this.getTotPaginas());
		}else
		if(cl == 2){
//			System.out.println("Informacoes do livro: ");
			this.setTitulo("Percy Jackson");
//			System.out.println("Titulo: "+this.getTitulo());
			this.setAutor("Rick Riordan");
//			System.out.println("Autor: "+this.getAutor());
			this.setTotPaginas(280);
//			System.out.println("Total de paginas: "+this.getTotPaginas());	
		}else
		if(cl == 3) {
//			System.out.println("Informacoes do livro: ");
			this.setTitulo("A Revolucao dos Bichos");
//			System.out.println("Titulo: "+this.getTitulo());
			this.setAutor("George Orwell");
//			System.out.println("Autor: "+this.getAutor());
			this.setTotPaginas(320);
//			System.out.println("Total de paginas: "+this.getTotPaginas());
		}else {
			System.out.println("Codigo invalido!");
		}
	}
	
	public String detalhes() {
		return "Livro [codigo=" + livro + ", titulo=" + titulo + ", autor=" + autor + ", totPaginas=" + totPaginas
				+ ", pagAtual=" + pagAtual + ", aberto=" + aberto + ", leitor=" + leitor.getNome() 
				+ ", idade: "+leitor.getIdade()+ ", sexo: "+leitor.getSexo()+ "]";
	}
	
	@Override
	public void abrir() {
		if(this.getAberto()) {
			System.out.println("O livro ja esta aberto.");
		}else {
			this.setAberto(true);
			System.out.println("O livro está aberto!");
		}
	}

	@Override
	public void fechar() {
		if(this.getAberto()) {
			this.setAberto(false);
			System.out.println("O livro está fechado!");
		}else {
			System.out.println("O livro já está fechado.");
		}
		
	}
	
	@Override
	public void folhearRandom() {
		if(this.getAberto()) {
			int pagRandom;
			do {
				Random gerador = new Random();
				int min = 1;
				int max = this.getTotPaginas();
				pagRandom = gerador.nextInt((max - min) + 1) + min;
				System.out.println("Folheando aleatoriamente para a pagina: "+pagRandom);
			}while(pagRandom == this.getPagAtual());	
			this.setPagAtual(pagRandom);
		}
	}

	@Override
	public void folhear(int p) {
		if(this.getAberto()) {
			if(p > 0 && p <= this.totPaginas && p != this.pagAtual) {
				this.setPagAtual(p);
				System.out.println("Folheando para a pagina: "+this.getPagAtual());
			}else {
				System.out.println("Nao foi possivel folhear");
			}
		}else {
			System.out.println("O livro esta fechado!");
		}
		
	}

	@Override
	public void avancarPag() {
		if(this.getAberto()) {
			if(this.getPagAtual() < this.getTotPaginas()) {
				this.setPagAtual(this.getPagAtual() + 1);
				System.out.println("Avancado para a proxima pagina: "+ this.getPagAtual());
			}else {
				System.out.println("O livro ja chegou ao final!");
			}
		}else {
			System.out.println("O livro esta fechado!");
		}
		
	}

	@Override
	public void voltarPag() {
		if(this.getAberto()) {
			if(this.getPagAtual() > 0) {
				this.setPagAtual(this.getPagAtual() - 1);
				System.out.println("Voltando para a pagina anterior: "+ this.getPagAtual());
			}else {
				System.out.println("O livro ja esta na pagina inicial!");
			}
		}else {
			System.out.println("O livro esta fechado!");
		}
		
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public int getTotPaginas() {
		return totPaginas;
	}

	public void setTotPaginas(int totPaginas) {
		this.totPaginas = totPaginas;
	}

	public int getPagAtual() {
		return pagAtual;
	}

	public void setPagAtual(int pagAtual) {
		this.pagAtual = pagAtual;
	}

	public boolean getAberto() {
		return aberto;
	}

	public void setAberto(boolean aberto) {
		this.aberto = aberto;
	}

	public Pessoa getLeitor() {
		return leitor;
	}

	public void setLeitor(Pessoa leitor) {
		this.leitor = leitor;
	}
	
}
