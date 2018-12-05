import java.util.ArrayList;
import java.util.stream.Collectors;

public class Semantico implements Constants {

    ArrayList<Simbolo> tabSimbolos = new ArrayList<>();
    int nivelAtual;
    ArrayList<Integer> deslocamento;
    String contextoLID = "";
    int posPrimId;
    int posUltLId;
    int numElementos;
    int numParFormais = 0;
    int numParAtuais = 0;
    int idUltMetodoDeclarado;
    int posId;
    int idMetodoExecutado;
    int npa = 0;
    Categoria catAtual;
    Link subCatAtual;
    Tipo tipoAtual;
    Tipo tipoMetodo;
    Tipo tipoConst;
    String valorConst;
    Tipo tipoExp;
    String mpp = "";
    Tipo tipoLadEsq;
    Link catVarIndexada;
    Tipo tipoVarIndexada;
    String contextoEXP = "";
    Tipo tipoExpSimples;
    Tipo tipoTermo;
    Tipo tipoFator;
    Tipo tipoVar;
    String opRelac;
    String opAdd;
    String opMult;
    Boolean opNega;
    Boolean opUnario;


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
        tipoConst = Tipo.CADEIA;
        valorConst = token.getLexeme();
    }

    private void acao179(Token token) {
        tipoConst = Tipo.BOOLEANO;
        valorConst = token.getLexeme();
    }

    private void acao178(Token token) {
        tipoConst = Tipo.BOOLEANO;
        valorConst = token.getLexeme();
    }

    private void acao177(Token token) {
        tipoConst = Tipo.REAL;
        valorConst = token.getLexeme();
    }

    private void acao176(Token token) {
        tipoConst = Tipo.INTEIRO;
        valorConst = token.getLexeme();

    }

    private void acao175(Token token) throws SemanticError {
        if (!jaDeclaradoNoNA(token)) {
            throw new SemanticError("Id não declarado",token.getPosition());
        } else {
            if (pegaSimboloDaTS(token).getCategoria() != Categoria.CONSTANTE) {
                throw new SemanticError("Id de constante esperado",token.getPosition());
            } else {
                tipoConst = pegaSimboloDaTS(token).getTipo();
                valorConst = pegaSimboloDaTS(token).getAtribs().get(1);
            }
        }

    }

    private void acao174(Token token) throws SemanticError {
        Simbolo simbId = tabSimbolos.get(posId);
        if (simbId.getCategoria() == Categoria.VARIAVEL || simbId.getCategoria() == Categoria.PARAMETRO) {
            if (simbId.getLink() == Link.VETOR) {
                throw new SemanticError("Vetor deve ser indexado",token.getPosition());
            } else {
                tipoVar = simbId.getTipo();
            }
        } else if (simbId.getCategoria() == Categoria.PROCEDIMENTO) {
            if (simbId.getTipo() == Tipo.NULO) {
                throw new SemanticError("Esperava-se um método com tipo",token.getPosition());
            } else if (Integer.parseInt(tabSimbolos.get(posId).getAtribs().get(1)) != 0) {
                throw new SemanticError("(174)Erro na quantidade de parâmetros",token.getPosition());
            } else {
                tipoVar = simbId.getTipo();
            }
        } else if (simbId.getCategoria() == Categoria.CONSTANTE) {
            tipoVar = tipoConst;
        } else {
            throw new SemanticError("Esperava-se var, id-método ou constante.",token.getPosition());
        }
    }

    private void acao173(Token token) throws SemanticError {
        if (tipoExp != Tipo.INTEIRO) {
            throw new SemanticError("Índice deveria ser inteiro",token.getPosition());
        } else if (catVarIndexada == Link.CADEIA) {
            tipoVar = Tipo.CARACTER;

        } else {
            tipoVar = tabSimbolos.get(posId).getTipo();
        }

    }

    private void acao172(Token token) throws SemanticError {
        if (numParFormais == numParAtuais) {
            tipoVar = tabSimbolos.get(posId).getTipo();
        } else {
            throw new SemanticError("(172)Erro na quantidade de parâmetros.", token.getPosition());
        }

    }

    private void acao171(Token token) throws SemanticError {
        if (tabSimbolos.get(posId).getCategoria() != Categoria.PROCEDIMENTO) {
            throw new SemanticError("Id deveria ser um método.");
        } else if (tabSimbolos.get(posId).getTipo() == Tipo.NULO) {
            throw new SemanticError("Esperava-se método com tipo.", token.getPosition());
        } else {
            numParAtuais = 0;
            contextoEXP = "par-atual";
            numParFormais = Integer.parseInt(tabSimbolos.get(posId).getAtribs().get(1));
            tipoMetodo = tabSimbolos.get(posId).getTipo();
            idMetodoExecutado = posId;
        }

    }

    private void acao170(Token token) {
        tipoFator = tipoConst;
    }

    private void acao169(Token token) {
        tipoFator = tipoVar;
    }

    private void acao168(Token token) {
        tipoFator = tipoExp;

    }

    private void acao167(Token token) {
        opUnario = false;
        opNega = false;

    }

    private void acao166(Token token) throws SemanticError {
        if (tipoFator != Tipo.INTEIRO && tipoFator != Tipo.REAL) {
            throw new SemanticError("Operador unário exige operando numérico.",token.getPosition());
        } else {
            opUnario = false;
        }

    }

    private void acao165(Token token) throws SemanticError {
        if (opUnario) {
            throw new SemanticError("Operador unário repetido",token.getPosition());
        } else {
            opUnario = true;
        }

    }

    private void acao164(Token token) throws SemanticError {
        if (tipoFator != Tipo.BOOLEANO) {
            throw new SemanticError("Operador 'não' exige operando booleano",token.getPosition());
        } else {
            opNega = false;
        }

    }

    private void acao163(Token token) throws SemanticError {
        if (opNega) {
            throw new SemanticError("Operador 'não' repetido não é permitido",token.getPosition());
        } else {
            opNega = true;
        }
    }

    private void acao162(Token token) {
        opMult = token.getLexeme();
    }

    private void acao161(Token token) {
        opMult = token.getLexeme();
    }

    private void acao160(Token token) {
        opMult = token.getLexeme();
    }

    private void acao159(Token token) {
        opMult = token.getLexeme();
    }

    private void acao158(Token token) {

        System.out.println();


    }

    private void acao157(Token token) throws SemanticError {
        String oper = token.getLexeme();
        if (oper.equalsIgnoreCase("+") || oper.equalsIgnoreCase("-") || oper.equalsIgnoreCase("/") || oper.equalsIgnoreCase("*") || oper.equalsIgnoreCase("DIV")) {
            if (tipoFator != Tipo.REAL && tipoFator != Tipo.INTEIRO) {
                throw new SemanticError("Operadores aritméticos somente pode ser aplicado para números reais ou inteiros",token.getPosition());
            }
        }
        if (oper.equalsIgnoreCase("e") || oper.equalsIgnoreCase("ou") || oper.equalsIgnoreCase("nao")) {
            if (tipoFator != Tipo.BOOLEANO) {
                throw new SemanticError("Operadores lógicos somente pode ser aplicado para booleanos",token.getPosition());
            }
        }
    }

    private void acao156(Token token) {
        tipoTermo = tipoFator;
    }

    private void acao155(Token token) {
        opAdd = token.getLexeme();
    }

    private void acao154(Token token) {
        opAdd = token.getLexeme();
    }

    private void acao153(Token token) {
        opAdd = token.getLexeme();
    }

    private void acao152(Token token) throws SemanticError {
        if((tipoTermo!=Tipo.INTEIRO&&tipoTermo!=Tipo.REAL)||(tipoExpSimples!=Tipo.INTEIRO&&tipoExpSimples!=Tipo.REAL)){
            throw new SemanticError("Operandos incompatíveis",token.getPosition());
        }else {
            if(tipoTermo==Tipo.REAL||tipoExpSimples==Tipo.REAL){
                tipoExpSimples = Tipo.REAL;
            }else{
                tipoExpSimples = tipoExpSimples;
            }
        }

    }

    private void acao151(Token token) throws SemanticError {
        if(tipoExpSimples!=Tipo.INTEIRO&&tipoExpSimples!=Tipo.REAL){
            throw new SemanticError("Operador e operando incompatíveis",token.getPosition());
        }
    }

    private void acao150(Token token) {
        tipoExpSimples = tipoTermo;
    }

    private void acao149(Token token) {
        opRelac = token.getLexeme();
    }

    private void acao148(Token token) {
        opRelac = token.getLexeme();
    }

    private void acao147(Token token) {
        opRelac = token.getLexeme();
    }

    private void acao146(Token token) {
        opRelac = token.getLexeme();
    }

    private void acao145(Token token) {
        opRelac = token.getLexeme();
    }

    private void acao144(Token token) {
        opRelac = token.getLexeme();
    }

    private void acao143(Token token) throws SemanticError {
        if (tipoExpSimples == Tipo.INTEIRO || tipoExpSimples == Tipo.REAL) {
            if (tipoExp == Tipo.INTEIRO || tipoExp == Tipo.REAL) {
                tipoExp = Tipo.BOOLEANO;
                return;
            }

        }
        if (tipoExpSimples == Tipo.CADEIA || tipoExpSimples == Tipo.CARACTER) {
            if (tipoExp == Tipo.CADEIA || tipoExp == Tipo.CARACTER) {
                tipoExp = Tipo.BOOLEANO;
                return;
            }
        }
        if (tipoExpSimples == tipoExp) {
            tipoExp = Tipo.BOOLEANO;
        } else {
            throw new SemanticError("Operandos incompatíveis", token.getPosition());
        }
    }

    private void acao142(Token token) {
        tipoExp = tipoExpSimples;

    }

    private void acao141(Token token) throws SemanticError {
        if (contextoEXP.equalsIgnoreCase("par-atual")) {
            numParAtuais++;
            Simbolo metodo = tabSimbolos.get(idMetodoExecutado);
//
            if (metodo.getParams().size()>=numParAtuais) {
                if (tipoExp != tabSimbolos.get(metodo.getParams().get(numParAtuais - 1)).getTipo()) {
                    throw new SemanticError("Tipo de parametro incorreto", token.getPosition()); //TODO resolver como saber o tipo da exp e se é certo
                }
            }
        }
        if (contextoEXP.equalsIgnoreCase("impressao")) {
            if (tipoExp == Tipo.BOOLEANO) {
                throw new SemanticError("Tipo invalido para impressão", token.getPosition());
            }
        }

    }

    private void acao140(Token token) throws SemanticError {
        Simbolo simb = tabSimbolos.get(posId);
        if (simb.getCategoria() != Categoria.PROCEDIMENTO) {
            throw new SemanticError("Id deveria ser um método", token.getPosition());
        } else {
            if (simb.getTipo() != Tipo.NULO) {
                throw new SemanticError("esperava-se um método sem tipo", token.getPosition());
            } else if (numParFormais != 0) {
                throw new SemanticError("(140)Erro na quantidade de parâmetros", token.getPosition());
            }

        }

    }

    private void acao139(Token token) throws SemanticError {
        if (npa != numParFormais) {
            throw new SemanticError("(139)Erro na quantidade de parâmetros", token.getPosition());
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
        } else if (!simb.getAtribs().get(0).equalsIgnoreCase("nulo")) {
            throw new SemanticError("esperava-se um método sem tipo", token.getPosition());
        }
    }

    private void acao136(Token token) throws SemanticError {
        if (tipoExp != Tipo.INTEIRO) {
            throw new SemanticError("Índice deveria ser inteiro", token.getPosition());
        } else {
            if (catVarIndexada == Link.CADEIA) {
                tipoLadEsq = Tipo.CARACTER;
            } else {
                tipoLadEsq = tipoVarIndexada;
            }

        }

    }

    private void acao135(Token token) throws SemanticError {
        Simbolo simb = tabSimbolos.get(posId);
        if (simb.getCategoria() != Categoria.VARIAVEL) {
            throw new SemanticError("Esperava-se uma variável", token.getPosition());
        } else if (simb.getLink() != Link.VETOR && simb.getLink() != Link.CADEIA) {
            throw new SemanticError("Apenas vetores e cadeias podem ser indexados.", token.getPosition());
        } else {
            catVarIndexada = simb.getLink();
            tipoVarIndexada = simb.getTipo();
        }
    }

    private void acao134(Token token) throws SemanticError {
        if (tipoLadEsq == Tipo.REAL && tipoExp == Tipo.INTEIRO) {
            return;
        }
        if (tipoLadEsq == Tipo.CADEIA & tipoExp == Tipo.CARACTER) {
            return;
        }
        if (tipoExp != (tipoLadEsq)) {
            throw new SemanticError("Tipos incompatíveis", token.getPosition());
        }
    }

    private void acao133(Token token) throws SemanticError {
        Simbolo simb = tabSimbolos.get(posId);
        if (simb.getCategoria() == Categoria.VARIAVEL || simb.getCategoria() == Categoria.PARAMETRO) {
            if (simb.getLink() == Link.VETOR) {
                throw new SemanticError("Id deveria ser indexado.", token.getPosition());
            } else {
                tipoLadEsq = simb.getTipo();
            }
        } else {
            throw new SemanticError("Id deveria ser uma variável ou parâmetro.", token.getPosition());
        }

    }


    private void acao132(Token token) throws SemanticError {
        if (tipoMetodo == Tipo.NULO) {
            throw new SemanticError("'Retorne' só pode ser utilizado em um método com tipo", token.getPosition());
        } else {
            if (tipoExp != tipoMetodo) {
                throw new SemanticError("Tipo de retorno inválido", token.getPosition());
            }

        }
    }

    private void acao131(Token token) {
        contextoEXP = "impressao";
    }

    private void acao130(Token token) {
        contextoLID = "leitura";
    }

    private void acao129(Token token) throws SemanticError {
        if (tipoExp != Tipo.BOOLEANO && tipoExp != Tipo.INTEIRO) {
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
        tipoMetodo = Tipo.NULO;
    }

    private void acao124(Token token) throws SemanticError {
        if (tipoAtual == Tipo.CADEIA) {
            throw new SemanticError("Métodos devem ser do tipo pré-definido", token.getPosition());
        } else {
            tipoMetodo = tipoAtual;
        }

    }

    private void acao123(Token token) throws SemanticError {
        if (tipoAtual == Tipo.CADEIA || tipoAtual == Tipo.VETOR) {
            throw new SemanticError("Parâmetro deve ser do tipo pré-definido", token.getPosition());
        } else {
            atualizaParametros(posPrimId, posUltLId, mpp);
            for (int i = posPrimId; i <= posUltLId; i++) {
                tabSimbolos.get(idUltMetodoDeclarado).getParams().add(i);
            }
        }

    }

    private void atualizaParametros(int posPrimId, int posUltLId, String mpp) {
        for (int i = posPrimId; i <= posUltLId; i++) {
            Simbolo parametro = tabSimbolos.get(i);
            parametro.setCategoria(Categoria.PARAMETRO);
            parametro.setTipo(tipoAtual);
            parametro.getAtribs().add("" + nivelAtual);
            parametro.getAtribs().add(mpp);
        }
    }

    private void acao122(Token token) {
        posUltLId = tabSimbolos.size() - 1;

    }

    private void acao121(Token token) {
        contextoLID = "par-formal";
        posPrimId = tabSimbolos.size();

    }

    private void acao120(Token token) {
        tabSimbolos = tabSimbolos.stream()
                .filter(simbolo -> ( //isso
                        !(simbolo.getCategoria() == Categoria.VARIAVEL && simbolo.getAtribs().get(0).equalsIgnoreCase("" + nivelAtual))
                )).collect(Collectors.toCollection(ArrayList::new));
        diminuiNivel();

    }

    private void acao119(Token token) {
        tabSimbolos.get(idUltMetodoDeclarado).setTipo(tipoMetodo);
    }

    private void acao118(Token token) {
        tabSimbolos.get(idUltMetodoDeclarado).getAtribs().add("" + numParFormais);
    }

    private void acao117(Token token) throws SemanticError {
        if (jaDeclaradoNoNA(token)) {
            throw new SemanticError("Id já declarado.", token.getPosition());
        } else {
            ArrayList<String> atributos = new ArrayList<String>();
            atributos.add("" + nivelAtual);
            addMetodo(new Simbolo(token.getLexeme(), Categoria.PROCEDIMENTO, atributos, null, null, new ArrayList<Integer>()));
            idUltMetodoDeclarado = tabSimbolos.size() - 1;
        }
    }

    private void acao116(Token token) {
        catAtual = Categoria.VARIAVEL;
    }

    private void acao115(Token token) throws SemanticError {
        if (tipoConst != (tipoAtual)) {
            throw new SemanticError("Tipo da constante incorreto.", token.getPosition());
        }
    }

    private void acao114(Token token) throws SemanticError {
        if (subCatAtual == Link.VETOR || subCatAtual == Link.CADEIA) {
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
                numParFormais++;
                addSimbolo(token);
            }
        }
        if (contextoLID.equalsIgnoreCase("leitura")) {
            if (!jaDeclaradoNoNA(token)) {
                throw new SemanticError("Id não declarado.", token.getPosition());
            } else {
                Simbolo atual = pegaSimboloDaTS(token);
                if (!(atual.getCategoria() == Categoria.VARIAVEL && (atual.getTipo() != Tipo.BOOLEANO && atual.getLink()!=Link.VETOR))) {
                    throw new SemanticError("Tipo inválido para leitura.", token.getPosition());
                }
            }
        }

    }


    private void acao112(Token token) {
        if (tipoAtual == Tipo.CADEIA) {
            subCatAtual = Link.CADEIA;
        } else {
            subCatAtual = Link.PRE_DEFINIDO;
        }
    }

    private void acao111(Token token) throws SemanticError {
        if (tipoConst != Tipo.INTEIRO) {
            throw new SemanticError("A dimensão deve ser uma constante inteira.", token.getPosition());
        } else {
            numElementos = Integer.parseInt(valorConst);
        }
    }

    private void acao110(Token token) throws SemanticError {
        if (tipoAtual == Tipo.CADEIA) {
            throw new SemanticError("Vetor do tipo cadeia não é permitido.", token.getPosition());
        } else {
            subCatAtual = Link.VETOR;
        }
    }

    private void acao109(Token token) throws SemanticError {
        if (tipoConst != Tipo.INTEIRO) {
            throw new SemanticError("Esperava-se uma constante inteira.", token.getPosition());
        } else if (Integer.parseInt(valorConst) > 256) {
            throw new SemanticError("Cadeia maior do que o máximo permitido (256).", token.getPosition());
        } else {
            tipoAtual = Tipo.CADEIA;
        }

    }

    private void acao108(Token token) {
        tipoAtual = Tipo.CARACTER;
    }

    private void acao107(Token token) {
        tipoAtual = Tipo.BOOLEANO;
    }

    private void acao106(Token token) {
        tipoAtual = Tipo.REAL;
    }

    private void acao105(Token token) {
        tipoAtual = Tipo.INTEIRO;
    }

    private void acao104(Token token) {
        for (int i = posPrimId; i < posUltLId; i++) {
            tabSimbolos.get(i).setCategoria(catAtual);
            tabSimbolos.get(i).setLink(subCatAtual);
            tabSimbolos.get(i).getAtribs().add("" + nivelAtual);
            if (catAtual == Categoria.VARIAVEL) {
                tabSimbolos.get(i).getAtribs().add("" + deslocamento.get(nivelAtual));
                if (subCatAtual == Link.VETOR) {
                    aumentaDeslocamento(numElementos);
                } else {
                    aumentaDeslocamento(1);
                }
            }
            if (catAtual == Categoria.CONSTANTE) {
                tabSimbolos.get(i).getAtribs().add(valorConst);
            }
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
        deslocamento = new ArrayList<>();
        deslocamento.add(0);
        tabSimbolos.add(new Simbolo(token.getLexeme(), Categoria.PROGRAMA, new ArrayList<String>(), null, null, null));
    }

    private boolean jaDeclaradoNoNA(Token token) {
        for (Simbolo s : tabSimbolos) {
            if (token.getLexeme().equalsIgnoreCase(s.getNome())) {
                if (s.getCategoria() != Categoria.PROGRAMA) {
                    if (Integer.parseInt(s.getAtribs().get(0)) == nivelAtual) {
                        return true;
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }


    private void addMetodo(Simbolo simbolo) {
        tabSimbolos.add(simbolo);
        numParFormais = 0;
        aumentaNivel();

    }


    private void addSimbolo(Token token) {
        ArrayList<String> atributos = new ArrayList<>();
        tabSimbolos.add(new Simbolo(token.getLexeme(), null, atributos, null, tipoAtual, null));
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
        return tabSimbolos.stream().filter(simbolo -> (token.getLexeme().equalsIgnoreCase(simbolo.getNome()) &&
                Integer.parseInt(simbolo.getAtribs().get(0)) <= nivelAtual))
                .findAny()
                .orElse(null);
    }

    private int aumentaNivel() {
        nivelAtual++;
        if (deslocamento.size() <= nivelAtual) {
            deslocamento.add(0);
        }
        return deslocamento.get(nivelAtual);
    }

    private int diminuiNivel() {
        nivelAtual--;
        return nivelAtual;
    }

    private int aumentaDeslocamento(int shift) {
        Integer des = deslocamento.get(nivelAtual);
        deslocamento.set(nivelAtual, des + shift);
        return des;
    }

    public void reset() {
        tabSimbolos = new ArrayList<>();
        nivelAtual = 0;
        deslocamento = null;
        contextoLID = "";
        posPrimId = 0;
        posUltLId = 0;
        numElementos = 0;
        numParFormais = 0;
        numParAtuais = 0;
        idUltMetodoDeclarado = 0;
        posId = 0;
        npa = 0;
        idMetodoExecutado = 0;
        catAtual = null;
        subCatAtual = null;
        tipoAtual = null;
        tipoMetodo = null;
        tipoConst = null;
        valorConst = null;
        tipoExp = null;
        tipoVar = null;
        mpp = "";
        tipoLadEsq = null;
        catVarIndexada = null;
        contextoEXP = "";
        tipoExpSimples = null;
        tipoTermo = null;
        tipoFator = null;
        opRelac = null;
        opAdd = null;
    }
}
