package org.services;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Telefone {

    private Scanner scanner = new Scanner(System.in);
    private Map<String, String> contatos = new HashMap<>();

    public void menuTelefone(){
        Menu menu = new Menu();
        contatos.put("(12)345-001","Pessoa1");
        contatos.put("(12)345-002","Pessoa2");
        contatos.put("(12)345-003","Pessoa3");
        contatos.put("(12)345-004","Pessoa4");

        boolean loop = true;

        while (loop) {
            System.out.println("Oque deseja?");
            System.out.println("(1) LIGAR");
            System.out.println("(2) ATENDER");
            System.out.println("(3) SAIR");
            byte comand = scanner.nextByte();

            if (comand == 1) ligar();
            else if (comand == 2) System.out.println("-Alô");
            else loop = false;
        }
        menu.menuInitial();
    }
    public void ligar(){
        String tel;
        System.out.print("Digite o numero de Telefone:");
        tel = scanner.next();

        String name = (contatos.get(tel));


        String display = (name != null && !name.isEmpty()) ? name : tel;

        System.out.println("________________________");
        System.out.println("| ____________________ |");
        System.out.println("| |   LIGANDO PARA   | |");
        System.out.println("| |   "+display);
        System.out.println("| |                  | |");
        System.out.println("| |                  | |");
        System.out.println("| |                  | |");
        System.out.println("| |                  | |");
        System.out.println("| |                  | |");
        System.out.println("| |                  | |");
        System.out.println("| |                  | |");
        System.out.println("| |                  | |");
        System.out.println("| |       (_)        | |");
        System.out.println("| |__________________| |");
        System.out.println("|                      |");
        System.out.println("|______________________|");
    }
}
