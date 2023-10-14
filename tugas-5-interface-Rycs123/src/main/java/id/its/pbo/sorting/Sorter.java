package id.its.pbo.sorting;

import java.util.Arrays;

public class Sorter {
    public static Sortable[] sortItems(Sortable[] sortables) {
        Arrays.sort(sortables, (item1, item2) -> item1.compare(item2));
        return sortables;
    }
}
