package task12_adapter_audio;

public class VlcEngine {
    public void startPlayback(String filepath, int volume) {
        System.out.println("VLC playing " + filepath + " at volume " + volume);
    }
}