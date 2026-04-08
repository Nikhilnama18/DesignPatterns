package org.example.Strategy;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class BubbleSort implements SortStrategy{
    @Override
    public List<Integer> sort(List<Integer> elements) {
        int n = elements.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent elements
                if (elements.get(j) > elements.get(j + 1)) {
                    // Swap them if they are in the wrong order
                    Collections.swap(elements, j, j + 1);
                }
            }
        }
        return elements;
    }
}
