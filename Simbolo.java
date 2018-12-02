import java.util.ArrayList;

public class Simbolo {
    private String nome;
    private Categoria categoria;
    private ArrayList<String> atribs;
    private Link link;
    private Tipo tipo;
    private ArrayList<Integer> params;


    public Simbolo(String nome, Categoria categoria, ArrayList<String> atribs, Link link,Tipo tipo,ArrayList<Integer> params) {
        this.nome = nome;
        this.categoria = categoria;
        this.atribs=atribs;
        this.link = link;
        this.tipo= tipo;
        this.params = params;
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

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }

    public ArrayList<Integer> getParams() {
        return params;
    }

    public void setParams(ArrayList<Integer> params) {
        this.params = params;
    }
}
