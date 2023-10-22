public class AudioDeviceAdapter {
    public static void main(String[] args) {
        Headphones headphones = new Headphones();
        Speakers speakers = new Speakers();

        AudioDevice headphonesAdapter = new HeadphonesAdapter(headphones);
        AudioDevice speakersAdapter = new SpeakersAdapter(speakers);

        MediaPlayer mediaPlayer = new MediaPlayer();

        String audio = "Awesome music!";
        System.out.println("\nPlaying audio on headphones:");
        mediaPlayer.playAudioOnDevice(headphonesAdapter, audio);

        System.out.println("\nPlaying audio on speakers:");
        mediaPlayer.playAudioOnDevice(speakersAdapter, audio);
    }
}