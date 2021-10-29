package task2;
public class VinylPlayer extends MusicPlayer {
    //конструктор, вызывающий родительский конструктор, передающий имя "Виниловый проигрыватель" и в качестве совместимых носителей информации "Виниловые пластинки"
    public VinylPlayer(){
        super("Vinyl", new InformationCarrier[]{new Vinyl()});
    }
    //метод проигрывания музыки
    @Override
    public void playMusic(Music music){
        //создаются копии массивов носителей, на которых записано данное произведение и совместимых с данным проигрывателем носителей соответственно, чтобы не передавать ссылки на массивы
        for(int i=0; i<music.getIc().size(); i++){
            if(music.getIc().get(i) instanceof Vinyl){
                super.playMusic(music);
                return;
            } else {
                System.out.println("This player does not support this IC");
            }
        }
    }

}
