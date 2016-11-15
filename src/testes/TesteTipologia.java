package testes;

import java.util.List;
import st.tipologia.Ambiente;
import st.tipologia.Componente;
import st.tipologia.Tipologia;

/**
 * Classe de teste de Tipologia
 * @author SCS214
 */
public class TesteTipologia {
    public static void main(String[] args) {
        List<Tipologia> listaTip = Tipologia.listarTipologias();
        for(Tipologia t : listaTip) {
            System.out.println("----TIPOLOGIA----");
            System.out.println("Altura: " + t.getAltura());
            System.out.println("Largura: " + t.getLargura());
            System.out.println("Preço: " + t.getPreco());
            Ambiente a = t.getAmbiente();
            System.out.println("Fogo/Som/Umi/Meca: " + a.getFatorFogo() + "/" + 
                a.getFatorSom() + "/" + a.getFatorUmidade() + "/" + a.getFatorMecanico());
            for(Componente c: t.getListaComponentes()) {
                System.out.println("----" + c.getNome() + "----");
                System.out.println("Altura: " + c.getAltura());
                System.out.println("Largura: " + c.getLargura());
                System.out.println("Massa: " + c.getMassa());
                System.out.println("Preço: " + c.getPreco());
                System.out.println("Tipo: " + c.getTipo());
                a = c.getAmbiente();
                System.out.println("Fogo/Som/Umi/Meca: " + a.getFatorFogo() + "/" + 
                    a.getFatorSom() + "/" + a.getFatorUmidade() + "/" + a.getFatorMecanico());
            }
        }
    }
}