package Memento;

import java.time.LocalDateTime;

// It is a behavioral design pattern that gives
// you can save and restore the status of objects, no
// disclosing details of their implementation.
//
// All java.io.Serializable implementations can be used as a snapshot analog.
//
// The snapshot instructs the object itself to make a copy of the
// state of the object. Instead of taking a picture "from the outside",
// our editor will make a copy of his own
// fields, because he has access to all fields, even private.
// Pattern suggests keeping a copy of the status in a special
// snapshot object with a limited interface that allows
// for example, find out the date of manufacture or the name of the picture.
// However, the image must be open to its creator and
// allow to read and restore its internal state.
//
// Advantages :
//      + Does not violate the encapsulation of the source object.
//      + Simplifies the structure of the source object. He does not
//          need to keep a history of versions of his condition.
//
// Disadvantages :
//      - May produce additional memory costs if objects
//          that preserve history, do not free up resources occupied by
//          real photos.

public class Memento {

    private Memento memento;

    String name;
    Integer age;

    public Memento(String name, Integer age){
        this.name = name;
        this.age = age;
        createMemento();
        save();
    }

    private Memento(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        createMemento();
        save();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
        createMemento();
        save();
    }

    private void createMemento(){
        memento = new Memento();
        memento.name = this.name;
        memento.age = this.age;
    }

    public MementoPhoto save(){
        MementoPhoto temp = new MementoPhoto(memento);
        Helper.add(temp);
        return temp;
    }

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }

    public void restore(MementoPhoto memento){
        this.memento = new Memento(memento.getMemento().getName(),memento.getMemento().getAge());
    }

    @Override
    public String toString() {
        return "Memento{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    class MementoPhoto {
        private Memento memento;
        private LocalDateTime localDateTime;
        MementoPhoto(Memento memento){
            this.memento = memento;
            localDateTime = LocalDateTime.now();
        }

        public Memento getMemento() {
            return memento;
        }

        @Override
        public String toString() {
            return "MementoPhoto{" +
                    "memento=" + memento +
                    ", time=" + localDateTime.getHour() + ":" + localDateTime.getMinute() +
                    ":" + localDateTime.getSecond() + " " + localDateTime.getDayOfMonth() +
                    "/" + localDateTime.getMonthValue() + "/" + localDateTime.getYear() +
                    '}';
        }
    }
}
