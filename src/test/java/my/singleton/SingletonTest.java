package my.singleton;

import org.junit.Test;

import static org.junit.Assert.*;

public class SingletonTest {
    @Test
    public void checkCurrentPresidentOfUkraine() {
        final Singleton event = Singleton.getSingleton();

        assertEquals("Зеленський Володимир Олександрович", event.getCurrentPresidentOfUkraine());
    }

    @Test
    public void checkIsSingleReference(){
        final Singleton event1 = Singleton.getSingleton();
        final Singleton event2 = Singleton.getSingleton();

        assertSame(event1, event2);
    }
}
