package task2;

import java.util.*;
//класс носителей информации
public class InformationCarrier {
    //название носителя информации
    private String name;
    //конструктор с параметром названия
    public InformationCarrier(String name){
        this.name = name;
    }
    //метод получения названия носителя информации
    public String getName(){
        return this.name;
    }
    /*метод, проверяющий, содержится ли данный тип носителя информации в списке других носителей информации (нужно, для проверки пересечения множества совместимых с тем или иным утсройством
    носителей информации и множества носителей информации, на которых записана проигрываемая композиция)*/
    public boolean containsIn(ArrayList<InformationCarrier> ic){
        boolean flag = false;
        for(int i=0;i<ic.size();i++){
            flag = flag||(this.name==ic.get(i).getName());
        }
        return flag;
    }
}