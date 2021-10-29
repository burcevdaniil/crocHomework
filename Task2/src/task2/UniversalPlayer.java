package task2;
public class UniversalPlayer extends MusicPlayer{
    //конструктор, вызывающий родительский конструктор, передающий имя "универсальный проигрыватель" и в качестве совместимых носителей информации все нужыные носители информации
    public UniversalPlayer(){
        super("Universal", new InformationCarrier[]{new Vinyl(), new CDDisk(), new FlashDrive()});
    }
    //метод проигрывания музыки
    @Override
    public void playMusic(Music music){
        //создаются копии массивов носителей, на которых записано данное произведение и совместимых с данным проигрывателем носителей соответственно, чтобы не передавать ссылки на массивы
        for(int i=0; i<music.getIc().size(); i++){
            if(music.getIc().get(i) instanceof CDDisk || music.getIc().get(i) instanceof Vinyl || music.getIc().get(i) instanceof FlashDrive){
                super.playMusic(music);
                return;
            } else {
                System.out.println("This player does not support this IC");
            }
        }
    }
}
