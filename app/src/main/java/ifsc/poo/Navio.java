package ifsc.poo;

// A classe Navio deve ter um método público chamado desenhar que recebe um objeto Draw como
//argumento.
// O método desenhar deve usar o objeto Draw para desenhar um navio na tela.

import edu.princeton.cs.algs4.Draw;

import java.awt.*;

public class Navio {
    // lógica
    // entrar com arumentos, ex: tamanho 5, posição (3, 2) e orientação vertical
    // desenhado com quadrados coloridos
    // tamanho de 40 x 40

    private Draw desenho;
    private int tamanhoNavio;
    private int posicaoX; // horizontal
    private int posicaoY; // vertical
    private boolean orientacaoHorizontal; // false: vertical, true: horizontal

    // construtor
    public Navio(Draw desenho, int tamanhoNavio) {
        this.desenho = desenho;
        this.tamanhoNavio = tamanhoNavio;
    }

    // metodo onde vou desenhar o navio na tela
    public void desenharNavio(int posicaoX, int posicaoY, boolean orientacaoHorizontal){
        // argumento aqui para passar aqui.
        // tamanho de 40 x 40
        int x0 = 60;
        int y0 = 60; // é a posição relativa sobre a grade

        int x1 = x0 + (posicaoX * 40);
        int y1 = y0 + (posicaoY * 40); //

        for (int i = 0; i < tamanhoNavio; i++) {
            this.desenho.setPenColor(Color.RED);
            if (orientacaoHorizontal) {
                this.desenho.filledSquare(x1 + (i * 40), y1, 20.0);
            } else {
                this.desenho.filledSquare(x1, y1 + (i * 40), 20.0);
            }
        }
    }
}
