import java.util.ArrayList;

public class Semantico implements Constants
{

    ArrayList<Simbolo> tabSimbolos = new ArrayList<>();
    int nivelAtual;
    int deslocamento;
    String contextoLID = "";
    int posPrimId;
    int posUltLId;
    Categoria catAtual;
    String subCatAtual ="";
    String tipoAtual ="";
    String tipoConst;
    String valorConst;




    public void executeAction(int action, Token token)	throws SemanticError
    {
        switch (action) {
            case 101:
                acao101(token);
                break;
            case 102:
                acao102(token);
                break;
            case 103:
                acao103(token);
                break;
            case 104:
                acao104(token);
                break;
            case 105:
                acao105(token);
                break;
            case 106:
                acao106(token);
                break;
            case 107:
                acao107(token);
                break;
            case 108:
                acao108(token);
                break;
            case 109:
                acao109(token);
                break;
        }
    }

    private void acao109(Token token) throws SemanticError {
        if(!tipoConst.equalsIgnoreCase("inteiro")){
            throw new SemanticError("Esperava-se uma constante inteira",token.getId());
        }

    }

    private void acao108(Token token) {
        tipoAtual = "caracter";
    }

    private void acao107(Token token) {
        tipoAtual = "booleano";
    }

    private void acao106(Token token) {
        tipoAtual = "real";
    }

    private void acao105(Token token) {
        tipoAtual = "inteiro";
    }

    private void acao104(Token token) {
        for (int i = posPrimId ; i< posUltLId ;i++){
            tabSimbolos.get(i).setCategoria(catAtual);
            tabSimbolos.get(i).setAtrib1(subCatAtual);
            tabSimbolos.get(i).setAtrib2(token.getLexeme());
            //TODO fazer os deslocamento das variavel
        }
    }

    private void acao103(Token token) {
        posUltLId = tabSimbolos.size();
    }

    private void acao102(Token token) {
        contextoLID = "decl";
        posPrimId = tabSimbolos.size();
    }

    private void acao101(Token token) {
        nivelAtual=0;
        deslocamento = 0;
        tabSimbolos.add(new Simbolo(token.getLexeme(),Categoria.ID_PROGRAMA,null,null,null));
    }
}
