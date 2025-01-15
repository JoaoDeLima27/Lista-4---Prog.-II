package exercio;

import java.util.ArrayList;

public class Biblioteca {
	
	private ArrayList<Livro>livros;
	
	public Biblioteca() {
		this.livros = new ArrayList<Livro>();
	}
	
	public void addLivros(String titulo) {
		this.livros.add(new Livro(titulo));
	}
	
	public void addLivros(String titulo, String autor) {
		this.livros.add(new Livro(titulo, autor));
	}
	
	public void addLivros(String titulo, String autor, int ano) {
		this.livros.add(new Livro(titulo, autor, ano));
	}
	
}
