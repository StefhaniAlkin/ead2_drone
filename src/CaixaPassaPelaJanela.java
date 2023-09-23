public class CaixaPassaPelaJanela {
    public static boolean caixaPassaPelaJanela(int a, int b, int c, int h, int l) {
        // Verificar a lógica pra ver se a caixa passa pela janela
        // Retorna true se a caixa passar, false se não passar
        // Considerar orientação e rotação da caixa?
        // Comparar as dimensões

        // Verificação de todas as orientações da caixa (implementação inicial)
        if ((a <= h && (b <= l || c <= l)) ||
                (b <= h && (a <= l || c <= l)) ||
                (c <= h && (a <= l || b <= l))) return true;
        return false;
    }
}
