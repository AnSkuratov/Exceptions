import com.sun.xml.internal.ws.api.pipe.Fiber;

import javax.xml.bind.Unmarshaller;
import java.lang.reflect.Method;
import java.util.*;

public class CatchExceptions {

    // Calls ArithmeticException
    static void callArithmeticException()
            throws ArithmeticException {
        int i = 0 / 0;
    }

    // Calls IndexOutOfBoundsException
    static void callIndexOutOfBoundsException()
            throws IndexOutOfBoundsException {
        int[] arr = new int[3];
        arr[3] = 0;
    }

    // Calls ClassNotFoundException
    static void callClassNotFoundException()
            throws ClassNotFoundException {
        final String hello = "Hello";
        Class newClass = Class.forName(hello);
    }

    // Calls NoSuchMethodException
    static void callNoSuchMethodException()
            throws NoSuchMethodException {
        Class cl = String.class;
        Method m = cl.getMethod("Method");
    }

    // Calls ClassCastException
    static void callClassCastException()
            throws ClassCastException {
        Object i = 10;
        String str = (String) i;
    }

    // Calls NumberFormatException
    static void callNumberFormatException()
            throws NumberFormatException {
        int i = 0;
        i = Integer.parseInt("Hello");
    }

    // Calls IllegalArgumentException
    static void callIllegalArgumentException()
            throws IllegalArgumentException {
        Random rnd = new Random();
        rnd.nextInt(-13);
    }

    // Calls UnsupportedOperationException
    static void callUnsupportedOperationException()
            throws UnsupportedOperationException {
        Collection hash = new HashSet(5);
        Collection col = Collections.unmodifiableCollection(hash);
        Random rnd = new Random();
        col.add(rnd.nextInt());
    }

    // Calls ConcurrentModificationException
    static void callConcurrentModificationException()
            throws ConcurrentModificationException {
        List<String> list = new ArrayList<String>();
        list.add("Hello!");
        list.add("WAT?");

        Iterator<String> iter = list.iterator();

        list.remove(0);

        while (iter.hasNext()) {
            iter.next();
        }
    }

    // Calls EmptyStackException
    static void callEmptyStackException()
            throws EmptyStackException {
        Stack stack = new Stack();
        stack.pop();
    }

    // Call MissingResourceException
    static void callMissingResourceException()
        throws MissingResourceException {
        ResourceBundle resource = ResourceBundle.getBundle("WAT?");
    }

    // Call NoSuchElementException
    static void callNoSuchElementException()
        throws NoSuchElementException {
        Set set = new HashSet();
        set.iterator().next();
    }

    // To test methods
    public static void main(String[] args) {

        //region ArithmeticException IndexOutOfBoundsException ClassNotFoundException NoSuchMethodException ClassCastException

        /* ArithmeticException */
        try {
            callArithmeticException();
        } catch (ArithmeticException ex) {
            System.out.println(ex.toString());
        }

        // IndexOutOfBoundsException
        try {
            callIndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException ex) {
            System.out.println(ex.toString());
        }

        // ClassNotFoundException
        try {
            callClassNotFoundException();
        } catch (ClassNotFoundException ex) {
            System.out.println(ex.toString());
        }

        // NoSuchMethodException
        try {
            callNoSuchMethodException();
        } catch (NoSuchMethodException ex) {
            System.out.println(ex.toString());
        }

        // ClassCastException
        try {
            callClassCastException();
        } catch (ClassCastException ex) {
            System.out.println(ex.toString());
        }
        //endregion

        //region NumberFormatException IllegalArgumentException UnsupportedOperationException ConcurrentModificationException

        /* NumberFormatException */
        try {
            callNumberFormatException();
        } catch (NumberFormatException ex) {
            System.out.println(ex.toString());
        }

        // IllegalArgumentException
        try {
            callIllegalArgumentException();
        } catch (IllegalArgumentException ex) {
            System.out.println(ex.toString());
        }

        // UnsupportedOperationException
        try {
            callUnsupportedOperationException();
        } catch (UnsupportedOperationException ex) {
            System.out.println(ex.toString());
        }

        // ConcurrentModificationException
        try {
            callConcurrentModificationException();
        } catch (ConcurrentModificationException ex) {
            System.out.println(ex.toString());
        }

        //endregion

        // region EmptyStackException MissingResourceException NoSuchElementException

        /* EmptyStackException */
        try {
            callEmptyStackException();
        } catch (EmptyStackException ex) {
            System.out.println(ex.toString());
        }

        // MissingResourceException
        try {
            callMissingResourceException();
        }
        catch (MissingResourceException ex) {
            System.out.println(ex.toString());
        }

        // NoSuchElementException
        try {
            callNoSuchElementException();
        }
        catch (NoSuchElementException ex) {
            System.out.println(ex.toString());
        }

        // endregion
    }
}
