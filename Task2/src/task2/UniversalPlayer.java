package task2;

import java.util.*;
//класс универсальных проигрывателей
public class UniversalPlayer extends MusicPlayer{
    //конструктор, вызывающий родительский конструктор, передающий имя "универсальный проигрыватель" и в качестве совместимых носителей информации все нужыные носители информации
    public UniversalPlayer(){
        super("Universal", new InformationCarrier[]{new InformationCarrier("Vinyl"), new InformationCarrier("CD"), new InformationCarrier("Flash-drive")});
    }
    //метод проигрывания музыки
    @Override
    public void playMusic(Music music){
        //создаются копии массивов носителей, на которых записано данное произведение и совместимых с данным проигрывателем носителей соответственно, чтобы не передавать ссылки на массивы
        ArrayList<InformationCarrier> tmp1 = new ArrayList<>();
        ArrayList<InformationCarrier> tmp2 = new ArrayList<>();
        tmp1.addAll(music.getIc());
        tmp2.addAll(super.getIc());
        //переменная, которая определяет, существует ли пересечение вышеописанных массивов
        boolean flag = true;
        if(tmp1.size()>tmp2.size()){
            for(int i=0;i<tmp2.size();i++){
                flag = flag&&tmp2.get(i).containsIn(tmp1);
            }
        } else {
            for(int i=0;i<tmp1.size();i++){
                flag = flag&&tmp1.get(i).containsIn(tmp2);
            }
        }
        //проверка на совместимость
        if(flag){
            System.out.println("Playing " + music.getSongName() + " by " + music.getAuthorName() + " on universal player");
        } else {
            System.out.println("This player does not support this IC");
        }
    }
}
