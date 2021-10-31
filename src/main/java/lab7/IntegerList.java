package lab7;// ****************************************************************
// IntegerList.java
//
// Define an IntegerList class with methods to create & fill
// a list of integers.
//
// ****************************************************************

import java.util.Arrays;
import java.util.Iterator;

public class IntegerList
{
    int[] list; //values in the list
    int capacity;
    int size;

    //-------------------------------------------------------
    //create a list of the given size
    //-------------------------------------------------------
    public IntegerList(int size)
    {
        list = new int[size];
        this.capacity = size;
        this.size = 0;
    }


    //-------------------------------------------------------
    //fill array with integers between 1 and 100, inclusive
    //-------------------------------------------------------
    public void randomize()
    {
        for (int i=0; i<list.length; i++) {
            list[i] = (int)(Math.random() * 100) + 1;
            this.size++;
        }
    }

    //-------------------------------------------------------
    //print array elements with indices
    //-------------------------------------------------------
    public void print()
    {
        for (int i=0; i< this.size; i++)
            System.out.println(i + ":\t" + list[i]);
    }

    public void increaseSize() {
        this.list = Arrays.copyOf(this.list, this.capacity * 2);
    }

    public boolean isFull() {
        return this.size == this.capacity;
    }

    public void addElement(int newVal) {
        if (isFull()) increaseSize();
        this.list[size++] = newVal;
    }

    public void removeFirst(int value) {
        for (int i = 0; i < size; i++) {
           if (value != list[i]) continue;
           if (this.size - (i + 1) >= 0) System.arraycopy(list, i + 1, list, i + 1 - 1, this.size - (i + 1));
           break;
        }
    }

    public void removeAll(int value) {
        int amount = 0;
        for (int i = 0; i < this.size; i++)  {
            // let i points to where list[i] == value
            if (this.list[i] != value)  {
                continue;
            }

            // let j points first where list[j] != value
            amount++;
            boolean covered = false;
            for (int j = i + 1; j < this.size; j++) {
                if (this.list[j] == value)  {
                    amount++;
                    continue;
                }

                // delete by value cover
                this.list[i] = this.list[j];
                i = j;
                covered = true;
                break;
            }

            if (!covered) break;
        }

        this.size -= amount;
    }
}
