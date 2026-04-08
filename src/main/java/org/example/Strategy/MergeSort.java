package org.example.Strategy;

import java.util.ArrayList;
import java.util.List;

public class MergeSort implements SortStrategy{
    @Override
    public List<Integer> sort(List<Integer> elements) {
        if (elements.size() < 2) return elements;

        int mid = elements.size() / 2;
        // Create sublists (left inclusive, right exclusive)
        List<Integer> left = new ArrayList<>(elements.subList(0, mid));
        List<Integer> right = new ArrayList<>(elements.subList(mid, elements.size()));

        // Recursive calls
        sort(left);
        sort(right);

        // Merge sorted halves back into the original list
        merge(elements, left, right);

        return elements;
    }
    private static void merge(List<Integer> elements, List<Integer> left, List<Integer> right) {
        int i = 0, j = 0, k = 0;

        while (i < left.size() && j < right.size()) {
            if (left.get(i) <= right.get(j)) {
                elements.set(k++, left.get(i++));
            } else {
                elements.set(k++, right.get(j++));
            }
        }

        // Copy remaining elements if any
        while (i < left.size()) elements.set(k++, left.get(i++));
        while (j < right.size()) elements.set(k++, right.get(j++));
    }
}
