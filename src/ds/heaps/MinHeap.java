package ds.heaps;


import java.util.Arrays;
import java.util.NoSuchElementException;

/**
 * Class that creates a binary heap (min heap)
 */
public class MinHeap
{

    // the number of children has
    private static final int d = 2;
    private int heapSize;
    private static int[] heap;

    // constructor
    public MinHeap(int capacity)
    {
        heapSize = 0;
        heap = new int[capacity + 1];
        Arrays.fill(heap, -1);
    }

    /**
     * Function to check whether the heap is empty or not
     * @return true if heap is empty
     */
    public boolean isEmpty()
    {
        return heapSize == 0;
    }

    /**
     * Checks whether the heap is full or not
     * @return true if the heap is full
     */
    public boolean isFull()
    {
        return heapSize == heap.length;
    }

    /**
     * Clear heap
     */
    public void makeaEmpty()
    {
        heapSize = 0;
    }


    /**
     * returns the parent of a given node
     * @param d
     * @return index of parent of the given node
     */
    private int parent(int d)
    {
        return (d-1)/2;
    }

    /**
     * function to find index of kth child of i
     * @param i
     * @param k
     * @return
     */
    public int kthChild(int i, int k)
    {
        return (d * i + k);
    }

    public void insert(int x)
    {
        if(isFull())
        {
            throw new NoSuchElementException("Overflow exception");
        }
        // percolate up here
        heap[heapSize++] = x;
        heapifyUp(heapSize -1);
    }

    /**
     * Helper method to
     * @param childIndex
     */
    private void heapifyUp(int childIndex)
    {
        int tmp = heap[childIndex];
        while (childIndex > 0 && tmp < heap[parent(childIndex)])
        {
            heap[childIndex] = heap[parent(childIndex)];
            childIndex = parent(childIndex);
        }
        heap[childIndex] = tmp;
    }


    /**
     * Finds min element from the heap
     * @return
     */
    public int findMin()
    {
        if (isEmpty())
        {
            throw new NoSuchElementException("Overflow exception");
        }
        return heap[0];//since min heap, the very first element in the heap is the min element
    }

    public int deleteMin()
    {
        int keyItem = heap[0]; // item that we are gonna delete
        delete(0);
        return keyItem;
    }

    /**
     * In order to delete one item, we need to heapify down
     * @param deleteIndex
     * @return
     */
    private int delete(int deleteIndex) {
        // check whether the heap is empty or not, if empty then nothing to delete
        if(isEmpty())
        {
            throw new NoSuchElementException("Overflow exception");
        }
        int keyItem = heap[deleteIndex];
        heap[deleteIndex] = heap[heapSize - 1];
        heapSize--;
        heapifyDown(deleteIndex);
        return keyItem;

    }

    private void heapifyDown(int deleteIndex) {
        int child;
        int tmp = heap[deleteIndex];
        while (kthChild(deleteIndex, 1) < heapSize)
        {
            child = minChild(deleteIndex);
            if(heap[child] < tmp)
            {
                heap[deleteIndex] = heap[child];
            }
            else
            {
             break;
            }
            deleteIndex = child;
            heap[deleteIndex] = tmp;
        }
    }

    /** Function to get smallest child **/
    private int minChild(int ind)
    {
        int bestChild = kthChild(ind, 1);
        int k = 2;
        int pos = kthChild(ind, k);
        while ((k <= d) && (pos < heapSize))
        {
            if (heap[pos] < heap[bestChild])
                bestChild = pos;
            pos = kthChild(ind, k++);
        }
        return bestChild;
    }

    public static void main(String[] args) {
        MinHeap h = new MinHeap(10);
        System.out.println(Arrays.toString(heap));
        System.out.println(h.isEmpty());
    }
}
