package ifsc.poo;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;

import edu.princeton.cs.algs4.Draw;

public class Grade {

//    private Draw desenho;
    private int altura;
    private int largura;
    private int x0;
    private int y0;
    private ArrayList<String> rotulosY; // colocar letras (A, J)
    private ArrayList<String> rotulosX; // colocar numeros (0, 9)
    private double tamanhoCelula; // 40 px

    // construtor
    public Grade(int x0, int y0) {
        this.altura = 10;
        this.largura = 10;
        this.x0 = x0;
        this.y0 = y0;
        this.rotulosY = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J")); //asList ->
        this.rotulosX = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
        this.tamanhoCelula = 40;
    }

    public void desenharGrade(Draw draw){
        // desenhando todas as linhas e depois todas as colunas
        // adicionar os rotulos (criando outro metodo

        for (int i = 0; i <= largura; i++) {
            draw.setPenColor(Color.black);
            draw.line(x0, tamanhoCelula * i + y0, altura * tamanhoCelula + x0, tamanhoCelula * i + y0); // horizontal
        }
        for (int i = 0; i <= altura; i++) {
            draw.setPenColor(Color.black);
            draw.line(tamanhoCelula * i + x0, y0, tamanhoCelula * i + x0, largura * tamanhoCelula + y0); // vertical
        }
        desenharRotulos(draw);
    }

    public void desenharRotulos(Draw draw) {
        draw.setPenColor(Color.BLACK);
        draw.setFont(new Font("Arial", Font.PLAIN, 12));
        for (int i = 0; i < rotulosX.size(); i++) {
            draw.text(x0 + tamanhoCelula / 2 + i * tamanhoCelula, y0-10, rotulosX.get(i)); // ingridy comentar o código.
        }
        for (int i = 0; i < rotulosY.size(); i++) {
            draw.text(x0-10, y0 + tamanhoCelula / 2 + i * tamanhoCelula, rotulosY.get(i));
        }
    }



}
