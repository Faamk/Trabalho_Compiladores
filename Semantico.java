import java.util.ArrayList;
import java.util.stream.Collectors;

public class Semantico implements Constants {

    ArrayList<Simbolo> tabSimbolos = new ArrayList<>();
    int nivelAtual;
    int deslocamento;
    String contextoLID = "";
    int posPrimId;
    int posUltLId;
    int numElementos;
    int numParFormais = 0;
    int idUltMetodoDeclarado;
    int posId;
    int npa = 0;
    Categoria catAtual;
    String subCatAtual = "";
    String tipoAtual = "";
    String tipoMetodo = "";
    String tipoConst;
    String valorConst;
    String tipoExp = "";
    String mpp = "";
    String tipoLadEsq = "";
    String tipoVarIndexada = "";
    String contextoEXP = "";
    String tipoExpSimples= "" ;
    private String tipoTermo = "";
    private String tipoFator = "";


    public void executeAction(int action, Token token) throws SemanticError {
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
            case 110:
                acao110(token);
                break;
            case 111:
                acao111(token);
                break;
            case 112:
                acao112(token);
                break;
            case 113:
                acao113(token);
                break;
            case 114:
                acao114(token);
                break;
            case 115:
                acao115(token);
                break;
            case 116:
                acao116(token);
                break;
            case 117:
                acao117(token);
                break;
            case 118:
                acao118(token);
                break;
            case 119:
                acao119(token);
                break;
            case 120:
                acao120(token);
                break;
            case 121:
                acao121(token);
                break;
            case 122:
                acao122(token);
                break;
            case 123:
                acao123(token);
                break;
            case 124:
                acao124(token);
                break;
            case 125:
                acao125(token);
                break;
            case 126:
                acao126(token);
                break;
            case 127:
                acao127(token);
                break;
            case 128:
                acao128(token);
                break;
            case 129:
                acao129(token);
                break;
            case 130:
                acao130(token);
                break;
            case 131:
                acao131(token);
                break;
            case 132:
                acao132(token);
                break;
            case 133:
                acao133(token);
                break;
            case 134:
                acao134(token);
                break;
            case 135:
                acao135(token);
                break;
            case 136:
                acao136(token);
                break;
            case 137:
                acao137(token);
                break;
            case 138:
                acao138(token);
                break;
            case 139:
                acao139(token);
                break;
            case 140:
                acao140(token);
                break;
            case 141:
                acao141(token);
                break;
            case 142:
                acao142(token);
                break;
            case 143:
                acao143(token);
                break;
            case 144:
                acao144(token);
                break;
            case 145:
                acao145(token);
                break;
            case 146:
                acao146(token);
                break;
            case 147:
                acao147(token);
                break;
            case 148:
                acao148(token);
                break;
            case 149:
                acao149(token);
                break;
            case 150:
                acao150(token);
                break;
            case 151:
                acao151(token);
                break;
            case 152:
                acao152(token);
                break;
            case 153:
                acao153(token);
                break;
            case 154:
                acao154(token);
                break;
            case 155:
                acao155(token);
                break;
            case 156:
                acao156(token);
                break;
            case 157:
                acao157(token);
                break;
            case 158:
                acao158(token);
                break;
            case 159:
                acao159(token);
                break;
            case 160:
                acao160(token);
                break;
            case 161:
                acao161(token);
                break;
            case 162:
                acao162(token);
                break;
            case 163:
                acao163(token);
                break;
            case 164:
                acao164(token);
                break;
            case 165:
                acao165(token);
                break;
            case 166:
                acao166(token);
                break;
            case 167:
                acao167(token);
                break;
            case 168:
                acao168(token);
                break;
            case 169:
                acao169(token);
                break;
            case 170:
                acao170(token);
                break;
            case 171:
                acao171(token);
                break;
            case 172:
                acao172(token);
                break;
            case 173:
                acao173(token);
                break;
            case 174:
                acao174(token);
                break;
            case 175:
                acao175(token);
                break;
            case 176:
                acao176(token);
                break;
            case 177:
                acao177(token);
                break;
            case 178:
                acao178(token);
                break;
            case 179:
                acao179(token);
                break;
            case 180:
                acao180(token);
                break;


        }
    }

    private void acao180(Token token) {

    }

    private void acao179(Token token) {

    }

    private void acao178(Token token) {

    }

    private void acao177(Token token) {

    }

    private void acao176(Token token) {

    }

    private void acao175(Token token) {

    }

    private void acao174(Token token) {

    }

    private void acao173(Token token) {

    }

    private void acao172(Token token) {

    }

    private void acao171(Token token) {

    }

    private void acao170(Token token) {

    }

    private void acao169(Token token) {

    }

    private void acao168(Token token) {

    }

    private void acao167(Token token) {

    }

    private void acao166(Token token) {

    }

    private void acao165(Token token) {

    }

    private void acao164(Token token) {

    }

    private void acao163(Token token) {
    }

    private void acao162(Token token) {

    }

    private void acao161(Token token) {

    }

    private void acao160(Token token) {

    }

    private void acao159(Token token) {

    }

    private void acao158(Token token) {

    }

    private void acao157(Token token) {

    }

    private void acao156(Token token) {
        tipoTermo = tipoFator;
    }

    private void acao155(Token token) {

    }

    private void acao154(Token token) {
    }

    private void acao153(Token token) {

    }

    private void acao152(Token token) {

    }

    private void acao151(Token token) {

    }

    private void acao150(Token token) {
     tipoExpSimples = tipoTermo;
    }

    private void acao149(Token token) {

    }

    private void acao148(Token token) {

    }

    private void acao147(Token token) {

    }

    private void acao146(Token token) {

    }

    private void acao145(Token token) {

    }

    private void acao144(Token token) {

    }

    private void acao143(Token token) {
        //TODO Operandos incompatíveis
    }

    private void acao142(Token token) {
        tipoExp=tipoExpSimples;

    }

    private void acao141(Token token) throws SemanticError {
        if(contextoEXP.equalsIgnoreCase("par-atual")){
            numParFormais++;
            //TODO Verifica se existe
            //Parâmetro Formal correspondente e se
            //o tipo e o MPP são compatíveis
        }
        if(contextoEXP.equalsIgnoreCase("impressao")){
            if(tipoExp.equalsIgnoreCase("booleano")){
                throw new SemanticError("Tipo invalido para impressão", token.getPosition());
            }
        }

    }

    private void acao140(Token token) throws SemanticError {
        Simbolo simb = tabSimbolos.get(posId);
        if (simb.getCategoria() != Categoria.PROCEDIMENTO) {
            throw new SemanticError("Id deveria ser um método", token.getPosition());
        } else {
            if (simb.getAtrib1() != "nulo") {
                throw new SemanticError("esperava-se um método sem tipo", token.getPosition());
            } else if (numParFormais != 0) {
                throw new SemanticError("Erro na quantidade de parâmetros", token.getPosition());
            }

        }

    }

    private void acao139(Token token) throws SemanticError {
        if (npa != numParFormais) {
            throw new SemanticError("Erro na quantidade de parâmetros", token.getPosition());
        }
    }

    private void acao138(Token token) {
        npa = 0;
        contextoEXP = "par-atual";
    }

    private void acao137(Token token) throws SemanticError {
        Simbolo simb = tabSimbolos.get(posId);
        if (simb.getCategoria() != Categoria.PROCEDIMENTO) {
            throw new SemanticError("id deveria ser um método", token.getPosition());
        } else if (!simb.getAtrib1().equalsIgnoreCase("nulo")) {
            throw new SemanticError("esperava-se um método sem tipo", token.getPosition());
        }
    }

    private void acao136(Token token) throws SemanticError {
        if (!tipoExp.equalsIgnoreCase("inteiro")) {
            throw new SemanticError("Índice deveria ser inteiro", token.getPosition());
        } else {
            if (tipoVarIndexada.equalsIgnoreCase("cadeia")) {
                tipoLadEsq = "caracter";
            } else {
                tipoLadEsq = null; //TODO pegar o tipo dos elementos do vetor pra colocar aqui
            }

        }

    }

    private void acao135(Token token) throws SemanticError {
        Simbolo simb = tabSimbolos.get(posId);
        if (simb.getCategoria() != Categoria.VARIAVEL) {
            throw new SemanticError("Esperava-se uma variável", token.getPosition());
        } else if (!simb.getLink().equalsIgnoreCase("vetor") && !simb.getLink().equalsIgnoreCase("cadeia")) {
            throw new SemanticError("Apenas vetores e cadeias podem ser indexados.", token.getPosition());
        } else {
            tipoVarIndexada = simb.getLink();
        }
    }

    private void acao134(Token token) throws SemanticError {
        if (!tipoExp.equalsIgnoreCase(tipoLadEsq)) {
            throw new SemanticError("Tipos incompatíveis", token.getPosition());
        }
    }

    private void acao133(Token token) throws SemanticError {
        Simbolo simb = tabSimbolos.get(posId);
        if (simb.getCategoria() == Categoria.VARIAVEL || simb.getCategoria() == Categoria.PARAMETRO) {
            if (simb.getLink().equalsIgnoreCase("vetor")) {
                throw new SemanticError("Id deveria ser indexado.", token.getPosition());
            } else {
                tipoLadEsq = simb.getLink();
            }
        } else {
            throw new SemanticError("Id deveria ser uma variável ou parâmetro.", token.getPosition());
        }

    }


    private void acao132(Token token) throws SemanticError {
        if (tipoMetodo.equalsIgnoreCase("nulo")) {
            throw new SemanticError("'Retorne' só pode ser utilizado em um método com tipo", token.getPosition());
        } else {
            if (!tipoExp.equalsIgnoreCase(tipoMetodo)) {
                throw new SemanticError("Tipo de retorno inválido", token.getPosition());
            }

        }
    }

    private void acao131(Token token) {
        contextoLID = "impressao";
    }

    private void acao130(Token token) {
        contextoLID = "leitura";
    }

    private void acao129(Token token) throws SemanticError {
        if (!tipoExp.equalsIgnoreCase("booleano") && !tipoExp.equalsIgnoreCase("inteiro")) {
            throw new SemanticError("Tipo inválido da expressão", token.getPosition());
        }

    }

    private void acao128(Token token) throws SemanticError {
        if (!jaDeclaradoNoNA(token)) {
            throw new SemanticError("Identificador não declarado", token.getPosition());
        } else {
            posId = pegaIdDoToken(token);
        }
    }

    private void acao127(Token token) {
        mpp = "valor";
    }

    private void acao126(Token token) {
        mpp = "referencia";
    }

    private void acao125(Token token) {
        tipoMetodo = "nulo";
    }

    private void acao124(Token token) throws SemanticError {
        if (tipoAtual.equalsIgnoreCase("cadeia")) {
            throw new SemanticError("Métodos devem ser do tipo pré-definido", token.getPosition());
        } else {
            tipoMetodo = tipoAtual;
        }

    }

    private void acao123(Token token) throws SemanticError {
        if (!tipoAtual.equalsIgnoreCase("pre-definido")) {
            throw new SemanticError("Parâmetro deve ser do tipo pré-definido", token.getPosition());
        } else {
            atualizaParametros(posPrimId, posUltLId);
            //TODO - mpp? insere numa lista auxiliar?
        }

    }

    private void atualizaParametros(int posPrimId, int posUltLId) {
        for (int i = posPrimId; i <= posUltLId; i++) {
            Simbolo parametro = tabSimbolos.get(i);
            parametro.setCategoria(Categoria.PARAMETRO);
            parametro.setLink(tipoAtual);
        }
    }

    private void acao122(Token token) {
        posUltLId = tabSimbolos.size() - 1;

    }

    private void acao121(Token token) {
        contextoLID = "par-formal";
        posPrimId = tabSimbolos.size() - 1;

    }

    private void acao120(Token token) {
        tabSimbolos = tabSimbolos.stream()
                .filter(simbolo -> (
                        simbolo.getCategoria() == Categoria.VARIAVEL && simbolo.getAtrib1().equalsIgnoreCase("" + nivelAtual)
                )).collect(Collectors.toCollection(ArrayList::new));
        nivelAtual--;

    }

    private void acao119(Token token) {
        tabSimbolos.get(idUltMetodoDeclarado).setAtrib1(tipoMetodo);
    }

    private void acao118(Token token) {
        //TODO atualizar par formais na TS
    }

    private void acao117(Token token) throws SemanticError {
        if (jaDeclaradoNoNA(token)) {
            throw new SemanticError("Id já declarado.", token.getPosition());
        } else {
            addMetodo(new Simbolo(token.getLexeme(), Categoria.PROCEDIMENTO, "" + nivelAtual, null, null));
            idUltMetodoDeclarado = tabSimbolos.size() - 1;
        }
    }

    private void acao116(Token token) {
        catAtual = Categoria.VARIAVEL;
    }

    private void acao115(Token token) throws SemanticError {
        if (!tipoConst.equalsIgnoreCase(tipoAtual)) {
            throw new SemanticError("Tipo da constante incorreto.", token.getPosition());
        }
    }

    private void acao114(Token token) throws SemanticError {
        if (subCatAtual.equalsIgnoreCase("vetor") || subCatAtual.equalsIgnoreCase("cadeia")) {
            throw new SemanticError("Apenas id de tipo pré-definido podem ser declarados como constante.", token.getPosition());
        } else {
            catAtual = Categoria.CONSTANTE;
        }
    }

    private void acao113(Token token) throws SemanticError {
        if (contextoLID.equalsIgnoreCase("decl")) {
            if (jaDeclaradoNoNA(token)) {
                throw new SemanticError("Id já declarado.", token.getPosition());
            } else {
                addSimbolo(token);
            }
        }
        if (contextoLID.equalsIgnoreCase("par-formal")) {
            if (jaDeclaradoNoNA(token)) {
                throw new SemanticError("Id de parâmetro repetido.", token.getPosition());
            } else {
                addSimbolo(token);
            }
        }
        if (contextoLID.equalsIgnoreCase("leitura")) {
            if (!jaDeclaradoNoNA(token)) {
                throw new SemanticError("Id não declarado.", token.getPosition());
            } else {
                Simbolo atual = pegaSimboloDaTS(token);
                if (atual.getCategoria() != Categoria.VARIAVEL || !atual.getLink().equalsIgnoreCase("booleano") {
                    throw new SemanticError("Tipo inválido para leitura.", token.getPosition());
                }
            }
        }

    }


    private void acao112(Token token) {
        if (tipoAtual.equalsIgnoreCase("cadeia")) {
            subCatAtual = "cadeia";
        } else {
            subCatAtual = "pre-definido";
        }
    }

    private void acao111(Token token) throws SemanticError {
        if (!tipoConst.equalsIgnoreCase("inteiro")) {
            throw new SemanticError("A dimensão deve ser uma constante inteira.", token.getPosition());
        } else {
            numElementos = Integer.parseInt(valorConst);
        }
    }

    private void acao110(Token token) throws SemanticError {
        if (tipoAtual.equalsIgnoreCase("cadeia")) {
            throw new SemanticError("Vetor do tipo cadeia não é permitido.", token.getPosition());
        } else {
            subCatAtual = "vetor";
        }
    }

    private void acao109(Token token) throws SemanticError {
        if (!tipoConst.equalsIgnoreCase("inteiro")) {
            throw new SemanticError("Esperava-se uma constante inteira.", token.getId());
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
        for (int i = posPrimId; i < posUltLId; i++) {
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
        nivelAtual = 0;
        deslocamento = 0;
        tabSimbolos.add(new Simbolo(token.getLexeme(), Categoria.PROGRAMA, null, null, null));
    }

    private boolean jaDeclaradoNoNA(Token token) {
        //TODO
        return true;
    }


    private void addMetodo(Simbolo simbolo) {
        tabSimbolos.add(simbolo);
        numParFormais = 0;
        nivelAtual++;
        deslocamento = 0;

    }


    private void addSimbolo(Token token) {
        tabSimbolos.add(new Simbolo(token.getLexeme(), catAtual, "" + nivelAtual, "" + deslocamento, tipoAtual));
        deslocamento++;
    }

    private Integer pegaIdDoToken(Token token) {
        for (int i = 0; i < tabSimbolos.size(); i++) {
            if (tabSimbolos.get(i).getNome().equalsIgnoreCase(token.getLexeme())) {
                return i;
            }
        }
        return null;
    }

    private Simbolo pegaSimboloDaTS(Token token) {
        //TODO lidar c nível
        return tabSimbolos.stream().filter(simbolo -> token.getLexeme().equalsIgnoreCase(simbolo.getNome())).findAny().orElse(null);
    }
}
