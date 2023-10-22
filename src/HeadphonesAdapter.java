class HeadphonesAdapter implements AudioDevice {
    private Headphones headphones;

    public HeadphonesAdapter(Headphones headphones) {
        this.headphones = headphones;
    }

    @Override
    public void playAudio(String audio) {
        System.out.println("Adapter is converting audio for headphones...");
        headphones.playSoundInHeadphones(audio);
    }
}