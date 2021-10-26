package task2;

import java.util.*;
//класс музыки
public class Music {
    //название произведения
    private String songName;
    //имя автора (группы)
    private String authorName;
    //массив носителей информации, на которых записано данное произведение
    private ArrayList<InformationCarrier> informationCarriers = new ArrayList<>();
    //конструктор, имеющий параметры название песни, имя автора и список носителей инофрмации, на которых записано данное произведение
    public Music(String songName, String authorName, InformationCarrier[] informationCarriers){
        this.songName = songName;
        this.authorName = authorName;
        this.informationCarriers.addAll(Arrays.asList(informationCarriers));
    }
    //метод получения названия песни
    public String getSongName(){
        return this.songName;
    }
    //метод получения имени автора (группы)
    public String getAuthorName(){
        return this.authorName;
    }
    //метод получения носителей информации, на которых записано данное произведение
    public ArrayList<InformationCarrier> getIc(){
        return this.informationCarriers;
    }
}
