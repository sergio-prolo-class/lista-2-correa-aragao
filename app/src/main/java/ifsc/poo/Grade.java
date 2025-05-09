package ifsc.poo;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import edu.princeton.cs.algs4.Draw;

public class Grade {

    private Draw desenho;
    private int altura;
    private int largura;
    private ArrayList<String> rotulosY; // colocar letras (A, J)
    private ArrayList<String> rotulosX; // colocar numeros (0, 9)
    private double tamanhoCelula; // 40 px
    private int posicao;

    // construtor
    public Grade(Draw desenho) {
        this.desenho = desenho;
        this.altura = 10;
        this.largura = 10;
        this.rotulosY = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J")); //asList ->
        this.rotulosX = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
        this.tamanhoCelula = 40;
        this.posicao = posicao;
    }

    public void desenharGrade(Draw draw){
        draw.setPenColor(Color.RED); // dimensoes do tabuleiro
        for (int i = 0; i <= posicao; i++) {
            for (int j = 0; j <= posicao; j++) {
                if ((i + j) % 2 == 0) {
                    draw.setPenColor(new Color(255, 255, 255));
                } else {
                    draw.setPenColor(new Color(138, 43, 226));
                }
                draw.filledSquare(i + 0.5, j + 0.5, 0.5);
            }
        }
    }

}
