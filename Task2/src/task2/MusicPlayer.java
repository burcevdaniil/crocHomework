package task2;

import java.util.*;
//абстрактный класс, от которого наследуются все музыкальные проигрыватели
abstract public class MusicPlayer {
    //название данного проигрывателя
    private String name;
    //массив совместимых с данным устройством носителей информации
    private ArrayList<InformationCarrier> compatibleWith = new ArrayList<>();
    //конструктор, параметрами которого являются название проигрывателя и какие носители информации с ним совместимы
    public MusicPlayer(String name, InformationCarrier[] compatibleWith){
        this.name = name;
        this.compatibleWith.addAll(Arrays.asList(compatibleWith));
    }
    //метод для получения списка совместимых носителей
    public ArrayList<InformationCarrier> getIc(){
        return this.compatibleWith;
    }
    //метод для получения названия проигрывателя
    public String getName(){
        return this.name;
    }
    //метод для проигрывания музыки
    abstract public void playMusic(Music music);
    
}