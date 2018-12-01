import java.util.ArrayList;

public class Simbolo {
    private String nome;
    private Categoria categoria;
    private ArrayList<String> atribs;
    private String link;
    private Tipo tipo;


    public Simbolo(String nome, Categoria categoria, ArrayList<String> atribs, String link,Tipo tipo) {
        this.nome = nome;
        this.categoria = categoria;
        this.atribs=atribs;
        this.link = link;
        this.tipo= tipo;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public ArrayList<String> getAtribs() {
        return atribs;
    }

    public void setAtribs(ArrayList<String> atribs) {
        this.atribs = atribs;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
