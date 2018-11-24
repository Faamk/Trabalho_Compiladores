public class Simbolo {
    private String nome;
    private Categoria categoria;
    private String atrib1;
    private String atrib2;
    private String link;


    public Simbolo(String nome, Categoria categoria, String atrib1, String atrib2, String link) {
        this.nome = nome;
        this.categoria = categoria;
        this.atrib1 = atrib1;
        this.atrib2 = atrib2;
        this.link = link;
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

    public String getAtrib1() {
        return atrib1;
    }

    public void setAtrib1(String atrib1) {
        this.atrib1 = atrib1;
    }

    public String getAtrib2() {
        return atrib2;
    }

    public void setAtrib2(String atrib2) {
        this.atrib2 = atrib2;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
