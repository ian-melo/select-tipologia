package testes;

import java.util.ArrayList;
import java.util.List;
import st.tipologia.Ambiente;
import st.tipologia.Componente;
import st.tipologia.MantedorItem;
import st.tipologia.Tipologia;

/**
 * Classe de teste de MantedorItem
 * @author SCS214
 */
public class TesteMantedor {
    public static void main(String[] args) {
        MantedorItem mantedor = new MantedorItem();
        Ambiente a = new Ambiente();
        Componente c = new Componente();
        Tipologia t = new Tipologia();
        
        /*//BUSCA COMPONENTE
        a.setFatorFogo(100);
        a.setFatorMecanico(100);
        a.setFatorSom(0);
        a.setFatorUmidade(0);
        c.setAmbiente(a);
        c.setAltura(130);
        c.setLargura(120);
        c.setMassa(4000);
        c.setNome("CHAPA DE AÇO QF-RF");
        c.setPreco(1400.00f);
        c.setTipo(Componente.Tipo.CHAPA);
        //System.out.println(mantedor.buscarItem(c,false));
        
        //BUSCA TIPOLOGIA
        a.setFatorFogo(60);
        a.setFatorMecanico(80);
        a.setFatorSom(70);
        a.setFatorUmidade(90);
        t.setAmbiente(a);
        t.setAltura(500.6f);
        t.setLargura(500.3f);
        t.setPreco(853.47f);
        //System.out.println(mantedor.buscarItem(t,true));*/
        
        List<Componente> comps = new ArrayList<>();
        //INSERE COMPONENTE
        a.setFatorFogo(100);
        a.setFatorMecanico(100);
        a.setFatorSom(0);
        a.setFatorUmidade(0);
        c.setAmbiente(a);
        c.setAltura(130);
        c.setLargura(120);
        c.setMassa(4000);
        c.setNome("CHAPA DE AÇO QF-RF");
        c.setPreco(1400.00f);
        c.setTipo(Componente.Tipo.CHAPA);
        //System.out.println(mantedor.inserirComponente(c));
        
        comps.add(c);
        //INSERE COMPONENTE 2
        a = new Ambiente();
        a.setFatorFogo(80);
        a.setFatorMecanico(50);
        a.setFatorSom(90);
        a.setFatorUmidade(80);
        c = new Componente();
        c.setAmbiente(a);
        c.setAltura(130);
        c.setLargura(120);
        c.setMassa(380);
        c.setNome("FORRO TIPO B");
        c.setPreco(600.00f);
        c.setTipo(Componente.Tipo.FORRO);
        //System.out.println(mantedor.inserirComponente(c));
        
        comps.add(c);
        //INSERE TIPOLOGIA
        a.setFatorFogo(100);
        a.setFatorMecanico(100);
        a.setFatorSom(100);
        a.setFatorUmidade(100);
        t.setAmbiente(a);
        t.setAltura(140.7f);
        t.setLargura(180.6f);
        t.setPreco(853.37f);
        t.setListaComponentes(comps);
        //System.out.println(mantedor.inserirTipologia(t));
        
        //EXCLUI TIPOLOGIA
        System.out.println(mantedor.excluirTipologia(t));
    }   
}