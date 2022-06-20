package Memento;

import java.util.ArrayList;

// The guardian must know when to take a picture of the creator and when
// it needs to be restored. The guardian can keep the history
// past states of the creator in the form of a stack of images. When needed
// will undo the last operation, it will take the "top" image from the
// stack and pass it to the creator for recovery.

public class Helper {
    private static ArrayList<Memento.MementoPhoto> mementos = new ArrayList<>();
    private Helper(){}

    public static boolean add(Memento.MementoPhoto memento){
        return mementos.add(memento);
    }

    public static boolean delete(int index){
        try{
            mementos.remove(index);
            return true;
        } catch (IndexOutOfBoundsException e){
            return false;
        }
    }

    public static Memento.MementoPhoto get(int index){
        try{
            return mementos.get(index);
        } catch (IndexOutOfBoundsException e){
            return null;
        }
    }

    public static void list(){
        if (mementos.size()>0){
            for (Memento.MementoPhoto mementoPhoto : mementos){
                System.out.println(mementoPhoto);
            }
        } else {
            System.out.println("No mementos in list :(");
        }
    }
}
