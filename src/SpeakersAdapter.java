class SpeakersAdapter implements AudioDevice {
    private Speakers speakers;

    public SpeakersAdapter(Speakers speakers) {
        this.speakers = speakers;
    }

    @Override
    public void playAudio(String audio) {
        System.out.println("Adapter is converting audio for speakers...");
        speakers.playSoundInSpeakers(audio);
    }
}