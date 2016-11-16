//TODO: Escolher tipologias 
//TODO: Calcular e criar tipologias
//TODO: Testar
package st.tipologia;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe de GeradorTipologia, que representa a geração de tipologias
 * sob determinada configuração de dimensões e ambiente
 * @author SCS214
 */
public class GeradorTipologia {
    /**
     * Altura demandada da tipologia
     */
    private float altura;
    /**
     * Largura demandada da tipologia
     */
    private float largura;
    /**
     * Ambiente demandado da tipologia
     */
    private Ambiente ambiente;
    /**
     * Lista de tipologias escolhidas
     */
    private final List<Tipologia> tipologiasEscolhidas = new ArrayList<>();
    
    /**
     * Procura por tipologias adequadas às configurações de ambiente e dimensão
     * @param altura Altura demandada da tipologia
     * @param largura Largura demandada da tipologia
     * @param a Ambiente demandado da tipologia
     * @return Lista de tipologias escolhidas
     */
    public List<Tipologia> procurarTipologias(float altura, float largura, Ambiente a) {
        //Designação dos valores
        this.altura = altura;
        this.largura = largura;
        this.ambiente = a;
        //Busca das tipologias existentes
        List<Tipologia> tipologiasBuscadas = Tipologia.listarTipologias();
        //Seleção das tipologias buscadas
        /**
         * IMPLEMENTE AQUI
         * tipologiasEscolhidas.add(t);
         */
        //Cálculo de tipologias com componentes existentes
        this.calcularTipologia();
        return tipologiasEscolhidas;
    }
    /**
     * Realiza o cálculo para criação de tipologias, com base nos componentes,
     * e as armazena na base de dados
     */
    private void calcularTipologia() {
        List<Componente> componentesEscolhidos;
        Tipologia t;
        //Busca dos componentes existes
        List<Componente> componentesBuscados = Componente.listarComponentes();
        //Cálculos de combinação de componentes buscados
        /**
         * IMPLEMENTE AQUI
         * t.setListaComponentes(componentesEscolhidos);
         * tipologiasEscolhidas.add(t);
         */
        //Salva no banco de dados tipologias criadas
        /**
         * MantedorItem mi = new MantedorItem();
         * m.inserirComponente(t);
         */
    }
}