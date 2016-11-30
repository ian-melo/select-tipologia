package testes;

import st.tipologia.ControleTipologia;

/**
 * Classe de teste de ControleTipologia
 * @author SCS214
 */
public class TesteControleTipologia {
    public static void main(String[] args) {
        ControleTipologia ct = new ControleTipologia();
        Object[][] resultados = ct.verTipologias();
        
        for(Object item[] : resultados) {
            System.out.println("---TIPOLOGIA---");
            for(Object valor : item) {
                System.out.println(valor);
            }
        }
        
        resultados = ct.verDetalhes(0);
        for(int i = 0;i < resultados.length; i++) {
            System.out.println("---COMPONENTE" + (i+1) + "---");
            for(Object valor : resultados[i]) {
                System.out.println(valor);
            }
        }
    }
}
