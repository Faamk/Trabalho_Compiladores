import javax.swing.*;

public class InterfaceGrafica {
    JFrame frame = new JFrame();
    JLabel digite = new JLabel("Digite o código aqui:");
    JLabel tipoAnali = new JLabel("Escolha o tipo da análise:");
    JLabel resultadoLabel = new JLabel("Mensagem do Compilador:");
    JTextArea codigo = new JTextArea();
    JTextArea resultado = new JTextArea();
    JScrollPane scrollCod = new JScrollPane(codigo);
    JScrollPane scrollRes = new JScrollPane(resultado);
    JButton botaoLex = new JButton("Léxica");
    JButton botaoSintat = new JButton("Sintática/Semântica");
    Lexico lexico = new Lexico();
    Semantico semantico = new Semantico();
    Sintatico sintatico = new Sintatico();


    public InterfaceGrafica() {


        resultado.setEditable(false);


        resultadoLabel.setBounds(50,680,300,40);
        scrollRes.setBounds(50,720,700,150);
        tipoAnali.setBounds(230,580,300,40);
        digite.setBounds(50,20,200,20);
        scrollCod.setBounds(50,50,700,500);
        botaoLex.setBounds(430,580,100,40);
        botaoSintat.setBounds(560,580,200,40);

        frame.getContentPane().add(botaoLex);
        frame.getContentPane().add(botaoSintat);
        frame.getContentPane().add(scrollCod);
        frame.getContentPane().add(digite);
        frame.getContentPane().add(tipoAnali);
        frame.getContentPane().add(resultadoLabel);
        frame.getContentPane().add(scrollRes);


        botaoLex.addActionListener(e -> analLexica());
        botaoSintat.addActionListener(e -> analSintat());





        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,1000);
        frame.setLayout(null);
        frame.setVisible(true);

    }

    private void analSintat() {
        semantico.reset();
        String codigoFonte = codigo.getText();
        lexico.setInput(codigoFonte);
        try
        {
            sintatico.parse(lexico,semantico);
        }
        catch ( LexicalError e )
        {
            resultado.setText("Erro léxico - "+e.getMessage() + " em " + e.getPosition());
            codigo.setCaretPosition(e.getPosition());
            codigo.requestFocus();
            return;
        }
        catch ( SyntaticError e )
        {
            resultado.setText("Erro Sintático - "+e.getMessage() + " em " + e.getPosition());
            codigo.setCaretPosition(e.getPosition());
            codigo.requestFocus();
            return;
        }
        catch ( SemanticError e )
        {
            resultado.setText("Erro Semântico - "+e.getMessage() + " em " + e.getPosition());
            codigo.setCaretPosition(e.getPosition());
            codigo.requestFocus();
            return;
        }
        resultado.setText("Análise sintática/Semântica realizada com Sucesso!");
    }


    private void analLexica(){

        lexico.setInput(codigo.getText());

        try
        {
            Token t = null;
            while ( (t = lexico.nextToken()) != null );
        }
        catch ( LexicalError e )
        {
            resultado.setText("Erro léxico - "+e.getMessage() + " em " + e.getPosition());
            codigo.setCaretPosition(e.getPosition());
            codigo.requestFocus();
            return;

        }
        resultado.setText("Análise léxica realizada com Sucesso!");

    }


}
