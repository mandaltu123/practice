package collectiontest.lists;


public class CustomArraylist {

    private static int initialCapacity = 10;
    private static int currentSize;
    private static Object[] myObject, tmp;
    private static int currentIndex = 0;


    /**
     * Creates a default sized array of Objects
     */
    public CustomArraylist() {
        myObject = new Object[initialCapacity];
        //every time I cross the default size, I create a new array with double size
    }

    /**
     * Creates an array with passed size, if size is less than 0 throws UnsupportedOperationException
     * @param size
     */
    public CustomArraylist(int size) {
        if(size >0) {
            myObject = new Object[size];
        } else {
            throw new UnsupportedOperationException("Not a valid size");
        }
    }


    /**
     * Now we will be doing some operations on Array List
     */

    // add method

    public void add(Object string) {
        if(currentIndex == currentSize) {
            createDoubleSizedObjectArray(currentSize);
        }
        myObject[currentIndex] = string;
        currentSize = myObject.length;
    }

    public void delete(Object string) {
        //already empty
        if(currentIndex == 0) {
            System.out.println("Already empty");
        }
        // for simplicity we will delete only one occurrence of the given element

        /**
         * For implementation, please refer
         * /Users/tuhinmandal/programming/scala-learning/actor-learnings/java-practice-again/src/ds.arrays/RemoveElementFromAnArray.java
         */

    }

    private void createDoubleSizedObjectArray(int currentSize) {
        tmp = myObject.clone();
        myObject = new Object[2 * currentSize];
        System.arraycopy(tmp, 0, myObject, 0, currentSize);
    }

}
