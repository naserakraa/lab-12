
package heap;


public class Minheap {
    int[] Heap;
    int index;
    int size;

   public Minheap(int size) {
        this.size = size;
        this.index = 0;
        Heap = new int[size];
   }

   private int parent(int i) {
           return (i - 1) / 2;
   }

   private int leftChild(int i) {
           return (i * 2) + 1;
   }

   private int rightChild(int i) {
           return (i * 2) + 2;
   }

   private boolean isLeaf(int i) {
           if (rightChild(i) >= Heap.length || leftChild(i) >= Heap.length) {
                   return true;
           }
           return false;
   }
   
   public void insert(int element) {
           if (index >= size) {
                   return;
           }
           Heap[index] = element;
           int current = index;

           while (Heap[current] < Heap[parent(current)]) {
                   swap(current, parent(current));
                   current = parent(current);
           }
           index++;
   }
   
    private void minHeapify(int i) {
   
           if (!isLeaf(i)) {
                   if (Heap[i] > Heap[leftChild(i)] ||
             Heap[i] > Heap[rightChild(i)]) {
                           if (Heap[leftChild(i)] < Heap[rightChild(i)]) {
                                   swap(i, leftChild(i));
                                   minHeapify(leftChild(i));
                           } else {
                                   swap(i, rightChild(i));
                                   minHeapify(rightChild(i));
                           }
                   }
           }
   }

   
   public void minHeap() {
           for (int i = (index - 1 / 2); i >= 1; i--) {
                   minHeapify(i);
           }
   }
   
   void swap(int x, int y) {
           int tmp;
           tmp = Heap[x];
           Heap[x] = Heap[y];
           Heap[y] = tmp;
   }
}
