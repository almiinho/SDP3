class MediaPlayer {
    public void playAudioOnDevice(AudioDevice audioDevice, String audio) {
        System.out.println("Media player is using the selected audio device...");
        audioDevice.playAudio(audio);
    }
}