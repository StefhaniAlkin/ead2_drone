package main;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita as dimensões da caixa
        System.out.println("Digite as dimensões da caixa (A, B, C em centímetros):");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // Solicita as dimensões da janela
        System.out.println("Digite as dimensões da janela (H, L em centímetros):");
        int h = scanner.nextInt();
        int l = scanner.nextInt();

        // Chama a função para verificar se a caixa passa pela janela
        boolean caixaPassa = CaixaPassaPelaJanela.caixaPassaPelaJanela(a, b, c, h, l);

        // Exibe o resultado
        if (caixaPassa) {
            System.out.println("A caixa passa pela janela (S)");
        } else {
            System.out.println("A caixa não passa pela janela (N)");
        }

        scanner.close();
    }
}