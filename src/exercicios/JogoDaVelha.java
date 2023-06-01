package exercicios;

import java.util.Scanner;

public class JogoDaVelha {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        char[][] tabuleiro = new char[3][3];
        
        System.out.println("Digite o tabuleiro de jogo da velha (X, O ou espaço em branco):");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                tabuleiro[i][j] = teclado.next().charAt(0);
            }
        }
        
        char proximaJogada = calcularProximaJogada(tabuleiro);
        
        if (proximaJogada == ' ') {
            System.out.println("Não há uma jogada vencedora ou defensiva possível.");
        } else {
            System.out.println("A próxima jogada vencedora ou defensiva é colocar um '" + proximaJogada + "'.");
        }
        
        teclado.close();
    }
    
    public static char calcularProximaJogada(char[][] tabuleiro) {
        // Verificar jogadas vencedoras nas linhas
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == tabuleiro[i][1] && tabuleiro[i][0] != ' ') {
                if (tabuleiro[i][2] == ' ') {
                    return tabuleiro[i][0];
                }
            } else if (tabuleiro[i][0] == tabuleiro[i][2] && tabuleiro[i][0] != ' ') {
                if (tabuleiro[i][1] == ' ') {
                    return tabuleiro[i][0];
                }
            } else if (tabuleiro[i][1] == tabuleiro[i][2] && tabuleiro[i][1] != ' ') {
                if (tabuleiro[i][0] == ' ') {
                    return tabuleiro[i][1];
                }
            }
        }
        
        // Verificar jogadas vencedoras nas colunas
        for (int j = 0; j < 3; j++) {
            if (tabuleiro[0][j] == tabuleiro[1][j] && tabuleiro[0][j] != ' ') {
                if (tabuleiro[2][j] == ' ') {
                    return tabuleiro[0][j];
                }
            } else if (tabuleiro[0][j] == tabuleiro[2][j] && tabuleiro[0][j] != ' ') {
                if (tabuleiro[1][j] == ' ') {
                    return tabuleiro[0][j];
                }
            } else if (tabuleiro[1][j] == tabuleiro[2][j] && tabuleiro[1][j] != ' ') {
                if (tabuleiro[0][j] == ' ') {
                    return tabuleiro[1][j];
                }
            }
        }
        
        // Verificar jogadas vencedoras nas diagonais
        if (tabuleiro[0][0] == tabuleiro[1][1] && tabuleiro[0][0] != ' ') {
            if (tabuleiro[2][2] == ' ') {
                return tabuleiro[0][0];
            }
        } else if (tabuleiro[0][0] == tabuleiro[2][2] && tabuleiro[0][0] != ' ') {
            if (tabuleiro[1][1] == ' ') {
                return tabuleiro[0][0];
            }
        } else if (tabuleiro[1][1] == tabuleiro[2][2] && tabuleiro[1][1] != ' ') {
            if (tabuleiro[0][0] == ' ') {
                return tabuleiro[1][1];
            }
        }
        
        if (tabuleiro[0][2] == tabuleiro[1][1] && tabuleiro[0][2] != ' ') {
            if (tabuleiro[2][0] == ' ') {
                return tabuleiro[0][2];
            }
        } else if (tabuleiro[0][2] == tabuleiro[2][0] && tabuleiro[0][2] != ' ') {
            if (tabuleiro[1][1] == ' ') {
                return tabuleiro[0][2];
            }
        } else if (tabuleiro[1][1] == tabuleiro[2][0] && tabuleiro[1][1] != ' ') {
            if (tabuleiro[0][2] == ' ') {
                return tabuleiro[1][1];
            }
        }
        
        return ' ';
    }
}
