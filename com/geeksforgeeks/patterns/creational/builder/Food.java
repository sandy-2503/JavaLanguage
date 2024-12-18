package com.geeksforgeeks.patterns.creational.builder;

public class Food {
    //required parameters
    private String name;
    //optional parameters
    private String spicy;
    private String souce;
    private int calories;
    private int weight;

    private Food(Builder builder){
        this.name = builder.name;
        this.spicy = builder.spicy;
        this.souce = builder.souce;
        this.calories = builder.calories;
        this.weight = builder.weight;
    }
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", spicy='" + spicy + '\'' +
                ", souce='" + souce + '\'' +
                ", calories=" + calories +
                ", weight=" + weight +
                '}';
    }

    public static  class Builder{
        private String name;
        private String spicy;
        private String souce;
        private int calories;
        private int weight;
        public Builder(String name){
            this.name=name;
        }
        public Builder setSpicy(String spicy) {
            this.spicy = spicy;
            return this;
        }

        public Builder setSouce(String souce) {
            this.souce = souce;
            return this;
        }

        public Builder setCalories(int calories) {
            this.calories = calories;
            return this;
        }

        public Builder setWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public Food build(){
            return new Food(this);
        }
    }
}
