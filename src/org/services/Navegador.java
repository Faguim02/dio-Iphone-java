package org.services;

import java.util.Scanner;

public class Navegador {

    Scanner scanner = new Scanner(System.in);
    Menu menu = new Menu();
    public void menuNavegator(){
        byte comand;
        boolean loop = true;

        while (loop) {

            System.out.println("(1) abrir navegador");
            System.out.println("(2) nova aba");
            System.out.println("(3) atualizar");
            System.out.println("(4) sair");

            comand = scanner.nextByte();

            switch (comand) {
                case 1 -> openNavegator();
                case 2 -> openNewAba();
                case 3 -> update();
                case 4 -> loop = false;
            }
        }
        menu.menuInitial();

    }
    public void openNavegator(){
        System.out.println("Navegador aberto");
    }
    public void openNewAba(){
        System.out.println("Nova Aba Aberta");
    }
    public void update(){
        System.out.println("Atualizado");
    }
}
