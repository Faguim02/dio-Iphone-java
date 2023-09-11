package org.services;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PlayMusic {
    public void menuPlayMusic(){
        List<Music> musicas = Arrays.asList(
                new Music("Musica 1", "2:30", "pessoa1"),
                new Music("Musica 2", "1:30", "pessoa2"),
                new Music("Musica 3", "2:00", "pessoa3")
        );

        byte command, indexMusic = 0;

        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        String statusPlay = "| |";
        boolean loop = true;

        while (loop) {
            Music musicSelecioned = musicas.get(indexMusic);

            System.out.println("________________________");
            System.out.println("| ____________________ |");
            System.out.println("| | PLAYMUSIC:       | |");
            System.out.println("| |                  | |");
            System.out.println("| | * Musica1        | |");
            System.out.println("| | * Musica2        | |");
            System.out.println("| | * Musica3        | |");
            System.out.println("| |                  | |");
            System.out.println("| |                  | |");
            musicSelecioned.getMusic();
            System.out.println("| |   -------------  | |");
            System.out.println("| |   <<   "+statusPlay+"   >>  | |");
            System.out.println("| |__________________| |");
            System.out.println("|                      |");
            System.out.println("|______________________|");
            System.out.println(" ");
            System.out.println("(1) PAUSA");
            System.out.println("(2) PLAY");
            System.out.println("(3) PASSA MUSICA");
            System.out.println("(4) VOLTA MUSICA");
            System.out.println("(5) SAI DO APLICATIVO");

            command = scanner.nextByte();

            switch (command) {
                case 1 -> statusPlay = "|> ";
                case 2 -> statusPlay = "| |";
                case 3 -> indexMusic++;
                case 4 -> indexMusic--;
                case 5 -> loop = false;
            }
        }
        menu.menuInitial();
    }
}
