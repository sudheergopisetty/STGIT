package com.music;

import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class Music {
    public static void createAudi() {
        //This gets the path to the project, but not into /src for eclipse
        String path = new File("").getAbsolutePath() + "\\userCreatedaudio.wav";
        //Make a File object with a path to the audio file.
        File sound = new File(path);
        try {
            AudioInputStream ais = AudioSystem.getAudioInputStream(sound);
            Clip c = AudioSystem.getClip();
            c.open(ais); //Clip opens AudioInputStream
            c.start(); //Start playing audio

            //sleep thread for length of the song
            Thread.sleep((int)(c.getMicrosecondLength() * 0.001));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    public static void passwordInvalid() {
        //This gets the path to the project, but not into /src for eclipse
        String path = new File("").getAbsolutePath() + "\\ValidPassword.wav";
        //Make a File object with a path to the audio file.
        File sound = new File(path);
        try {
            AudioInputStream ais = AudioSystem.getAudioInputStream(sound);
            Clip c = AudioSystem.getClip();
            c.open(ais); //Clip opens AudioInputStream
            c.start(); //Start playing audio

            //sleep thread for length of the song
            Thread.sleep((int)(c.getMicrosecondLength() * 0.001));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    public static void userUpdated() {
        //This gets the path to the project, but not into /src for eclipse
        String path = new File("").getAbsolutePath() + "\\UserUpdated.wav";
        //Make a File object with a path to the audio file.
        File sound = new File(path);
        try {
            AudioInputStream ais = AudioSystem.getAudioInputStream(sound);
            Clip c = AudioSystem.getClip();
            c.open(ais); //Clip opens AudioInputStream
            c.start(); //Start playing audio

            //sleep thread for length of the song
            Thread.sleep((int)(c.getMicrosecondLength() * 0.001));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    public static void deleteAudio() {
        //This gets the path to the project, but not into /src for eclipse
        String path = new File("").getAbsolutePath() + "\\DeletedUser.wav";
        //Make a File object with a path to the audio file.
        File sound = new File(path);
        try {
            AudioInputStream ais = AudioSystem.getAudioInputStream(sound);
            Clip c = AudioSystem.getClip();
            c.open(ais); //Clip opens AudioInputStream
            c.start(); //Start playing audio

            //sleep thread for length of the song
            Thread.sleep((int)(c.getMicrosecondLength() * 0.001));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
}
