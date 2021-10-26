package task2;
public class Main {
    public static void main(String[] args) {
        VinylPlayer vp = new VinylPlayer();
        CDPlayer cdp = new CDPlayer();
        UniversalPlayer up = new UniversalPlayer();
        InformationCarrier vinyl = new InformationCarrier("Vinyl");
        InformationCarrier cd = new InformationCarrier("CD");
        InformationCarrier flashDrive = new InformationCarrier("Flash-drive");
        Music music1 = new Music("Welcome to the jungle", "Guns'n'Roses", new InformationCarrier[] {vinyl, cd, flashDrive});
        Music music2 = new Music("Seasons", "Vivaldi", new InformationCarrier[] {vinyl});
        Music music3 = new Music("Feel Good Inc.", "Gorillaz", new InformationCarrier[] {cd});
        vp.playMusic(music1);
        vp.playMusic(music2);
        vp.playMusic(music3);
        cdp.playMusic(music1);
        cdp.playMusic(music2);
        cdp.playMusic(music3);
        up.playMusic(music1);
        up.playMusic(music2);
        up.playMusic(music3);
    }
}
