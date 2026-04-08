package org.example.Strategy;

import java.util.List;

public class Sorter {
    private SortStrategy strategy;

    public Sorter(SortStrategy strategy){
        this.strategy =strategy;
    }

    public List<Integer> sort(List<Integer> nums){
        return this.strategy.sort(nums);
    }

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }
}
