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

    // construtor
    public Grade(Draw desenho) {
        this.desenho = desenho;
        this.altura = 10;
        this.largura = 10;
        this.rotulosY = new ArrayList<>(Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J")); //asList ->
        this.rotulosX = new ArrayList<>(Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9"));
        this.tamanhoCelula = 40;
    }

    public void desenharGrade() {
        Color roxo = new Color(109, 50, 160);
        Color branco = new Color(255, 255, 255);
        this.desenho.setPenColor(branco);
        this.desenho.setCanvasSize(1000, 600);
        this.desenho.setScale(0, 10);
        //this.desenho.setXscale(0, 1000);
        //this.desenho.setYscale(0, 600);
        this.desenho.filledSquare(0, 0, 20);
        this.desenho.setPenColor(roxo);
        this.desenho.square(0, 0, 2);

    }


}
