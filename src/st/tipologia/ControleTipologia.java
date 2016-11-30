package st.tipologia;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe de controle de tipologia, que utiliza da geração de tipologias
 * e da busca das mesmas
 * @author SCS214
 */
public class ControleTipologia {
    private List<Tipologia> listaTipologia = new ArrayList<>();
    
    /**
     * Procura por tipologias que esteja de acordo com as dimensões 
     * e as condições de ambiente pré-estabelecidas
     * @param altura Altura da tipologia
     * @param largura Largura da tipologia
     * @param a Condições ambientais da tipologia
     * @return Matriz com as relações de tipologias que atendem os requisitos
     */
    public Object[][] procurarTipologias(float altura, float largura, Ambiente a) {
        //Obtém as tipologias
        GeradorTipologia gerador = new GeradorTipologia();
        listaTipologia = gerador.procurarTipologias(altura, largura, a);
        
        //Gera uma matriz com os valores
        int numLinhas = listaTipologia.size();
        int numColunas = 7; //Número de atributos
        Object resultado[][] = new Object[numLinhas][numColunas];
        for(int i=0; i<numLinhas; i++) {
            resultado[i][0] = listaTipologia.get(i).getAltura();
            resultado[i][1] = listaTipologia.get(i).getLargura();
            resultado[i][2] = listaTipologia.get(i).getPreco();
            resultado[i][3] = listaTipologia.get(i).getAmbiente().getFatorFogo();
            resultado[i][4] = listaTipologia.get(i).getAmbiente().getFatorSom();
            resultado[i][5] = listaTipologia.get(i).getAmbiente().getFatorUmidade();
            resultado[i][6] = listaTipologia.get(i).getAmbiente().getFatorMecanico();
        }
        return resultado;
    }
    /**
     * Mostra as tipologias existentes
     * @return Matriz com a relação das tipologias existentes e seus valores
     */
    public Object[][] verTipologias() {
        //Obtém as tipologias
        listaTipologia = Tipologia.listarTipologias();
        
        //Gera uma matriz com os valores
        int numLinhas = listaTipologia.size();
        int numColunas = 7; //Número de atributos
        Object resultado[][] = new Object[numLinhas][numColunas];
        for(int i=0; i<numLinhas; i++) {
            resultado[i][0] = listaTipologia.get(i).getAltura();
            resultado[i][1] = listaTipologia.get(i).getLargura();
            resultado[i][2] = listaTipologia.get(i).getPreco();
            resultado[i][3] = listaTipologia.get(i).getAmbiente().getFatorFogo();
            resultado[i][4] = listaTipologia.get(i).getAmbiente().getFatorSom();
            resultado[i][5] = listaTipologia.get(i).getAmbiente().getFatorUmidade();
            resultado[i][6] = listaTipologia.get(i).getAmbiente().getFatorMecanico();
        }
        return resultado;
    }
    /**
     * Mostra os detalhes de uma tipologia indicada
     * @param pos Posição da tipologia a ser buscada (à partir de zero)
     * @return Matriz com a relação dos componentes da tipologia e seus valores
     */
    public Object[][] verDetalhes(int pos) {
        if(pos < 0)
            return null;
        
        //Obtém os componentes
        List<Componente> listaComponente = listaTipologia.get(pos).getListaComponentes();
        //Gera uma matriz com os valores
        int numLinhas = listaComponente.size();
        int numColunas = 10; //Número de atributos
        Object resultado[][] = new Object[numLinhas][numColunas];
        for(int i=0; i<numLinhas; i++) {
            resultado[i][0] = listaComponente.get(i).getNome();
            resultado[i][1] = listaComponente.get(i).getAltura();
            resultado[i][2] = listaComponente.get(i).getLargura();
            resultado[i][3] = listaComponente.get(i).getMassa();
            resultado[i][4] = listaComponente.get(i).getPreco();
            resultado[i][5] = listaComponente.get(i).getTipo().toString();
            resultado[i][6] = listaComponente.get(i).getAmbiente().getFatorFogo();
            resultado[i][7] = listaComponente.get(i).getAmbiente().getFatorSom();
            resultado[i][8] = listaComponente.get(i).getAmbiente().getFatorUmidade();
            resultado[i][9] = listaComponente.get(i).getAmbiente().getFatorMecanico();
        }
        return resultado;
    }
}
