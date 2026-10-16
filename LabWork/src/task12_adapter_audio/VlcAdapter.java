package task12_adapter_audio;

public class VlcAdapter implements MediaPlayer {
    private final VlcEngine vlc;

    public VlcAdapter(VlcEngine vlc) {
        this.vlc = vlc;
    }


    public void playAudio(String filename) {
        vlc.startPlayback(filename, 80);
    }
}