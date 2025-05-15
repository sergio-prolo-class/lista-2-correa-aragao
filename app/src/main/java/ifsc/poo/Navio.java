package ifsc.poo;

// A classe Navio deve ter um método público chamado desenhar que recebe um objeto Draw como
//argumento.
// O método desenhar deve usar o objeto Draw para desenhar um navio na tela.

import edu.princeton.cs.algs4.Draw;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Navio {
    // lógica
    // entrar com arumentos, ex: tamanho 5, posição (3, 2) e orientação vertical
    // desenhado com quadrados coloridos
    // tamanho de 40 x 40

    private Draw desenho;
    private int tamanhoNavio;
    private int posicaoX; // horizontal
    private int posicaoY; // vertical
    private String orientacaoNavio;

    // construtor
    public Navio(Draw desenho, int tamanhoNavio, int posicaoX, int posicaoY, String orientacaoNavio) {
        this.desenho = desenho;
        this.tamanhoNavio = tamanhoNavio;
        this.posicaoX = posicaoX;
        this.posicaoY = posicaoY;
        this.orientacaoNavio = orientacaoNavio; // {'Horizontal', 'vertical'};
    }

    public void desenharNavio(Draw draw){
        // argumento aqui para passar aqui.
//        for (int i = 0; i <= tamanhoNavio; i++) {
//            draw.setPenColor(Color.RED);
//            if (orientacaoNavio == posicaoX ) {
//                posicaoX + 1;
//            }
//        }
//        // Vertical
//        for (int i = 0; i <= tamanhoNavio; i++) {
//            draw.setPenColor(Color.black);
//            if (orientacaoNavio == posicaoY) {
//                posicaoY + 1;
//            }
//        }
    }
}
