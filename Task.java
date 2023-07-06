// Разработать программу, имитирующую поведение коллекции HashSet. 
// В программе содать метод add добавляющий элемент, метод toString возвращающий строку 
//  с элементами множества и метод позволяющий читать элементы по индексу.
//  * Реализовать все методы из семинара.
//  * Формат данных Integer.
 

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class Task {

    public static void main(String[] args) {

        newSet list = new newSet();

        System.out.println(list.isEmpty());
        list.add(12);
        list.add(16);
        list.add(-1);
        list.add(3321);
        list.printSet();
        System.out.println(list.isEmpty());
        list.delete(16);
        list.printSet();
        list.getElement(4);
    }
}

class newSet {
    
    HashMap<Integer, Object> ownSet= new HashMap<>();
    private static final Object OBJECT = new Object();
    
    
    public void add(int element) {
        ownSet.put(element, OBJECT);
    }
    
    
    public void printSet(){
        for (int element : ownSet.keySet()) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }
    
    public void delete(int element) {
        ownSet.remove(element);
    }

    
    public boolean isEmpty() {
        return ownSet.isEmpty();
    }

    public void getElement(int index)
    {
        ArrayList<Integer> set = new ArrayList<>();
        int i = 0;
        for (int element : ownSet.keySet()) {
            set.add(i, element);
            i++;
        }
        if(index < set.size() && index > -1) System.out.println(set.get(index));
        else {
            System.out.print("Индекс за пределами размеров коллекции");
            // getElement(index);
        }
    }
}