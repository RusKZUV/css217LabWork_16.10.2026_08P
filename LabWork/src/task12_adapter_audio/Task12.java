package task12_adapter_audio;

public class Task12 {
    public static void main(String[] args) {
        MediaPlayer p = new VlcAdapter(new VlcEngine());
        p.playAudio("song.mp3");

        // in this task i found audio playback through a VLC engine adapter
    }
}