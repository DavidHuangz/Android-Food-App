package com.example.project2_finalapp;

public class Food {
    private String name;
    private int image;
    private int image_1;
    private int image_2;
    private int image_3;
    private double price;
    private String description;
    protected String foodType;
    public int count;

    public Food(String n, int i, int i_1, int i_2, int i_3, double p, String d) {
        name = n;
        image = i;
        image_1 = i_1;
        image_2 = i_2;
        image_3 = i_3;
        price = p;
        description = d;
        count = 0;
    }

    public String getName() {
        return name;
    }

    public int getImage() {
        return image;
    }

    public int[] getSliderImages() {
        return new int[]{image_1, image_2, image_3};
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public void increaseCount() {
        count++;
    }

    public String getFoodType() {
        return foodType;
    }

    public static class Sweets extends Food {
        public Sweets(String n, int i, int i_1, int i_2, int i_3, double p, String d) {
            super(n, i, i_1, i_2, i_3, p, d);
            foodType = "Sweets";
        }
    }

    public static class Savoury extends Food {
        public Savoury(String n, int i, int i_1, int i_2, int i_3, double p, String d) {
            super(n, i, i_1, i_2, i_3, p, d);
            foodType = "Savoury";
        }
    }

    public static class Drinks extends Food {
        public Drinks(String n, int i, int i_1, int i_2, int i_3, double p, String d) {
            super(n, i, i_1, i_2, i_3, p, d);
            foodType = "Drinks";
        }
    }
}
