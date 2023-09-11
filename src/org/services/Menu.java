package org.services;

import java.util.Scanner;

public class Menu {
    public void menuInitial(){
        PlayMusic playMusic = new PlayMusic();
        Telefone telefone = new Telefone();
        Navegador navegador = new Navegador();

        Scanner scanner = new Scanner(System.in);
        byte selectAplication;

        System.out.println("________________________");
        System.out.println("| ____________________ |");
        System.out.println("| | APLICATIVOS:     | |");
        System.out.println("| |                  | |");
        System.out.println("| | * PLAYMUSIC (1)  | |");
        System.out.println("| | * TELEFONE (2)   | |");
        System.out.println("| | * INTERNET (3)   | |");
        System.out.println("| | * DESLIGAR (4)   | |");
        System.out.println("| |                  | |");
        System.out.println("| |                  | |");
        System.out.println("| |                  | |");
        System.out.println("| |                  | |");
        System.out.println("| |                  | |");
        System.out.println("| |__________________| |");
        System.out.println("|                      |");
        System.out.println("|______________________|");

        System.out.print("Qual aplicativo deseja entrar (Digite o numero)? ");
        selectAplication = scanner.nextByte();

        switch (selectAplication) {
            case 1 -> playMusic.menuPlayMusic();
            case 2 -> telefone.menuTelefone();
            case 3 -> navegador.menuNavegator();
            case 4 -> System.out.println("Desligado");
            default -> System.out.println("teste");
        }
    }
}
