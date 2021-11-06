package lab8;

import java.util.Arrays;

public class SortedIntList extends IntList{

    public SortedIntList(int size) {
        super(size);
    }

    @Override
    public void add(int value) {
        super.add(value);
        Arrays.sort(super.list, 0, super.numElements);
    }

}
