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
        // desenhando todas as linhas e depois todas as colunas
        // adicionar os rotulos (criando outro metodo
        for (int i = 0; i <= largura; i++) {
            draw.setPenColor(Color.black);
            draw.line(60.0, tamanhoCelula * i + 60.0, altura * tamanhoCelula + 60.0, tamanhoCelula * i + 60.0); // horizontal
        }
        for (int i = 0; i <= altura; i++) {
            draw.setPenColor(Color.black);
            draw.line(tamanhoCelula * i + 60.0, 60.0, tamanhoCelula * i + 60.0, largura * tamanhoCelula + 60.0); // vertical
        }
    }

    public void desenharRotulos(Draw draw) {
        draw.setPenColor(Color.BLACK);
        draw.setFont(new Font("Arial", Font.PLAIN, 12));
        for (int i = 0; i < rotulosX.size(); i++) {
            draw.text(60 + tamanhoCelula / 2 + i * tamanhoCelula, 50, rotulosX.get(i));
        }
        for (int i = 0; i < rotulosY.size(); i++) {
            draw.text(50, 60 + tamanhoCelula / 2 + i * tamanhoCelula, rotulosY.get(i));
        }
    }


}
