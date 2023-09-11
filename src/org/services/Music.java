package org.services;

public class Music {
    private String nameMusic;
    private String minutes;
    private String auhtor;

    public Music(String nameMusic, String minutes, String auhtor) {
        this.nameMusic = nameMusic;
        this.minutes = minutes;
        this.auhtor = auhtor;
    }

    public void getMusic(){
        System.out.println("| |"+nameMusic+"     "+minutes);
        System.out.println("| |"+auhtor);
    }
}
