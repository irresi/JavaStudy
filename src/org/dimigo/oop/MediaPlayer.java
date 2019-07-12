package org.dimigo.oop;

import javax.print.attribute.standard.Media;

public class MediaPlayer {
    private int Volume;
    private static MediaPlayer instance = new MediaPlayer();

    private MediaPlayer(){


    }
    public static MediaPlayer getInstance(){
        return instance;
    }

    public int getVolume() {
        return Volume;
    }

    public void setVolume(int volume) {
        Volume += volume;
    }

    public static void setInstance(MediaPlayer instance) {
        MediaPlayer.instance = instance;
    }
}
