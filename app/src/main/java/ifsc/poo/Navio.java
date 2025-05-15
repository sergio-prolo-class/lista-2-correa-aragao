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
    private int posicaoX;
    private int posicaoY;
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
        // argumento aqui.
        //
        for (int i = 0; i <= tamanhoNavio; i++) {
            draw.setPenColor(Color.RED);
            draw.line(60.0, posicaoNavio * i + 60.0, altura * tamanhoCelula + 60.0, tamanhoCelula * i + 60.0); // horizontal
        }
        for (int i = 0; i <= posicaoNavio; i++) {
            draw.setPenColor(Color.black);
            draw.line(tamanhoCelula * i + 60.0, 60.0, tamanhoCelula * i + 60.0, largura * tamanhoCelula + 60.0); // vertical
        }
    }
}
