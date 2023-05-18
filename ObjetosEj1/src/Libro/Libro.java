/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libro;

/**
 *
 * @author user
 */
public class Libro {

    //ISBN, Título, Autor, Número de páginas
    public int ISBN;
    public String Titulo;
    public String Autor;
    public int paginas;

    public Libro(int ISBN, String Titulo, String Autor, int paginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.paginas = paginas;
    }

    public Libro() {
    }

    public int declararISBN(int ISBN2){
    
        this.ISBN=ISBN2;
        return ISBN;
    }
    public int declararPaginas(int paginas2){
    
        this.paginas=paginas2;
        return paginas;
    }
    public String declararTitulo(String titulo2){
    
        this.Titulo=titulo2;
        return Titulo;
    }
    public String declararAutor(String autor2){
    
        this.Autor=autor2;
        return Autor;
    }
    
    
    
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", Páginas=" + paginas + '}';
    }


}