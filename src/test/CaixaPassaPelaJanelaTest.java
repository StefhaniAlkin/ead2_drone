package test;

import main.CaixaPassaPelaJanela;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CaixaPassaPelaJanelaTest {
    @Test
    //Primeiro teste
    public void testCaixaPassaPelaJanela_CaixaPassa(){
        assertTrue(CaixaPassaPelaJanela.caixaPassaPelaJanela(30, 50, 80, 80, 60));
    }

    @Test
    //Segundo teste
    public void testCaixaPassaPelaJanela_CaixaNaoPassa(){
        assertFalse(CaixaPassaPelaJanela.caixaPassaPelaJanela(75,100,50,100,30));
    }

    @Test
    //Terceiro teste
    public void testCaixaPassaPelaJanela_CaixaComRotacao() {
        assertTrue(CaixaPassaPelaJanela.caixaPassaPelaJanela(30, 80, 50, 60, 80));
    }


}
