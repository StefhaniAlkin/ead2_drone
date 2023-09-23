package test;

import main.CaixaPassaPelaJanela;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class CaixaPassaPelaJanelaTest {
    @Test
    //Primeiro teste
    public void testCaixaPassaPelaJanela_CaixaPassa(){
        assertTrue(CaixaPassaPelaJanela.caixaPassaPelaJanela(30, 50, 80, 80, 60));
    }
}
