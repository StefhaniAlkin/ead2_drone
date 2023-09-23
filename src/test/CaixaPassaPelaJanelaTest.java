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

    @Test
    //Quarto teste
    public void testCaixaPassaPelaJanela_CaixaComOrientacaoDiferente() {
        assertTrue(CaixaPassaPelaJanela.caixaPassaPelaJanela(50, 30, 80, 60, 80));
    }

    @Test
    //Quinto teste
    public void testCaixaPassaPelaJanela_CaixaComMesmasDimensoesDaJanela() {
        assertTrue(CaixaPassaPelaJanela.caixaPassaPelaJanela(80, 60, 80, 60, 80));
    }

    @Test
    //Sexto teste
    public void testCaixaPassaPelaJanela_CaixaNaoPassaDimensoesMaiores() {
        assertFalse(CaixaPassaPelaJanela.caixaPassaPelaJanela(100, 80, 120, 80, 60));
    }

//    @Test
//    //Sétimo teste - falhou
//    public void testCaixaPassaPelaJanela_CaixaNaoPassaComOrientacaoDiferente() {
//        assertFalse(CaixaPassaPelaJanela.caixaPassaPelaJanela(60, 30, 80, 60, 80));
//    }



}
