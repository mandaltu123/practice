package ds.heaps;

/**
 * Heap sort is a comparison based sorting technique based on binary heap data structure.It is similar to selection
 * sort where we first find the maximum element and place the maximum element at the end of the array. We repeat the
 * same process for the rest of th elements.
 *
 * What is a binary heap ?
 *  Let us first define a Complete binary tree. A complete binary tree is a binary tree in which every level, except
 *  possibly the last, is completely filled, and all nodes are as far left as possible.
 *
 *  Heap sort algorithm for sorting in increasing order:
 *  1. Build max heap form the input array
 *  2. At this point, the largest element is stored at the root of the heap.Replace it with the last item of the heap
 *  followed by reducing the size of the heap by 1. Finally heapify the root of the tree.
 *  3. Repeat the process
 *
 */
public class HeapSort
{


    public void sort(int array[])
    {
        int n = array.length;
        // build the max heap and re arrange array
        for (int i = n/2-1; i >=0; i--)
        {
            maxHeapify(array, n, i);
        }

        // one by one extract an element from heap
        for (int i = n -1; i >= 0; i--)
        {
            //move current root to the end
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;
            // call the max heapify on the reduced heap
            maxHeapify(array, i, 0);
        }
    }

    /**
     * To heapify a subtree rooted with node i which is an index in in array[]. n is the size of the heap
     * @param array
     * @param n
     * @param i
     */
    private void maxHeapify(int[] array, int n, int i)
    {
        int largest = i; // initialize largest as root
        int l = i*2 + 1; // left element
        int r = i*2 + 2; // right element

        // if left child is larger than root
        if(l > n && array[l] > array[largest])
        {
            largest = l;
        }

        // if right child is larger than the largest so far
        if(r > n && array[r] > array[largest])
        {
            largest = r;
        }
        // if largest is not the root
        if(largest != i)
        {
            int swap = array[i];
            array[i] = array[largest];
            array[largest] = swap;
            //recursively heapify the affected subtree
            maxHeapify(array, n, largest);
        }
    }
}
