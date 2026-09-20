package main.java;

import java.util.Scanner;

import java.io.IOException;
import java.nio.file.Path;
import java.io.File;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws IOException{
        try {
            Path myPath = Path.of(System.getProperty("user.dir"), "src", "main", "java", "history.txt");
            File filehistory = myPath.toFile();
            
            Scanner filereader = new Scanner(filehistory);
            StringBuilder historiacompleta = new StringBuilder();

            JOptionPane.showMessageDialog(null, "Olá, você esta prestes a ser enviado para uma \n aventura sem prescendentes, antes precisamos de algumas informações");

            String nomeComandante = JOptionPane.showInputDialog("Nome do comandante");
            String nomePlaneta = JOptionPane.showInputDialog("Nome do planeta");
            int idadeTripulante = Integer.parseInt(JOptionPane.showInputDialog("Idade do tripulante"));
            Double velocidadeNave = Double.parseDouble(JOptionPane.showInputDialog("Velocida da nave"));
            String corCristal = JOptionPane.showInputDialog("Cor do cristal");
            int quantidadeCristais = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de cristais"));
            Double pesoRocha = Double.parseDouble(JOptionPane.showInputDialog("Peso da rocha"));
            String nomeAlien = JOptionPane.showInputDialog("Nome do alien");
            int duracaoMissao = Integer.parseInt(JOptionPane.showInputDialog("duracao da missao"));
            String gritoGuerra = JOptionPane.showInputDialog("Grito de guerra");

            JOptionPane.showMessageDialog(null, "Isso é tudo, nos vemos em breve soldado!...");
            JOptionPane.showMessageDialog(null, "...");
            JOptionPane.showMessageDialog(null, "ACORDA, que foi? não se lembra de nada? você deve ter batido a cabeça, vou lembrar você do que aconteceu...");

            while (filereader.hasNextLine()){
                historiacompleta.append(filereader.nextLine()).append("\n");
            }

            String historia = historiacompleta.toString();

            historia = historia.replace("[nomeComandante]", nomeComandante);
            historia = historia.replace("[nomePlaneta]", nomePlaneta);
            historia = historia.replace("[idadeTripulante]", String.valueOf(idadeTripulante));
            historia = historia.replace("[velocidadeNave]", String.valueOf(velocidadeNave));
            historia = historia.replace("[calculoInt]", String.valueOf(idadeTripulante*1.2));
            historia = historia.replace("[corCristal]", corCristal);
            historia = historia.replace("[quantidadeCristais]", String.valueOf(quantidadeCristais));
            historia = historia.replace("[pesoRocha]", String.valueOf(pesoRocha));
            historia = historia.replace("[calculoDouble]", String.valueOf(pesoRocha*1.5));
            historia = historia.replace("[nomeAlien]", nomeAlien);
            historia = historia.replace("[duracaoMissao]", String.valueOf(duracaoMissao));
            historia = historia.replace("[gritoGuerra]", gritoGuerra);

            filereader.close();

            for (String linha : historia.split("\n")) {
                JOptionPane.showMessageDialog(null, linha);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
