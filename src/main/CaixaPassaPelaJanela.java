package main;

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

        //Posição original (AxB) - passa pela janela
//        if ((a <= h && b <= 1) || (a <= 1 && b <= h)){
//            return true;
//        }
//
//        //Posição original (BxC) - passa pela janela
//        if ((b <= h && c <= l) || (b <= l && c <= h)) {
//            return true;
//        }
//
//        //Posição original (AxC) - passa pela janela
//        if ((a <= h && c <= l) || (a <= l && c <= h)) {
//            return true;
//        }
//
//        //Rotação em 90° (BxA) - passa pela janela
//        if ((b <= h && a <= l) || (b <= l && a <= h)) {
//            return true;
//        }
//
//        //Rotação 90° (CxB) - passa pela janela
//        if ((c <= h && b <= l) || (c <= l && b <= h)) {
//            return true;
//        }
//
//        //Rotação 90° (CxA) - passa pela janela
//        if ((c <= h && a <= l) || (c <= l && a <= h)) {
//            return true;
//        }
//
//        //Rotação 180° (AxB) - passa pela janela
//        if ((a <= h && b <= l) || (a <= l && b <= h)) {
//            return true;
//        }
//
//        //Rotação 180° (BxC) - passa pela janela
//        if ((b <= h && c <= l) || (b <= l && c <= h)) {
//            return true;
//        }
//
//        //Rotação 180° (AxC) - passa pela janela
//        if ((a <= h && c <= l) || (a <= l && c <= h)) {
//            return true;
//        }
//
//        //Se não passar de jeito nenhum
//        return false;

    }
}
