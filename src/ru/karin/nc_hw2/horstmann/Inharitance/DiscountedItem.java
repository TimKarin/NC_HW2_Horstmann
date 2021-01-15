package ru.karin.nc_hw2.horstmann.Inharitance;

import java.util.Objects;

public class DiscountedItem extends Item {
    protected double discount;

    public DiscountedItem(String description, double price, double discount) {
        super(description, price);
        this.discount = discount;
    }

    public boolean equals(Object otherObject) {
        if (this == otherObject) {
            return true;
        }
        if (otherObject == null) {
            return false;
        }
        if (!super.equals(otherObject)) {
            return false;
        }
        if (otherObject instanceof DiscountedItem) {
            DiscountedItem other = (DiscountedItem) otherObject;
            return discount == other.discount;
        }
        return true;
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), discount);
    }

    public static void main(String[] args) {
        DiscountedItem x = new DiscountedItem("Product", 1000.0, 10);
        DiscountedItem z = new DiscountedItem("Product", 1000.0, 5);
        Item y = new Item("Product", 1000.0);
        System.out.println(x.equals(y)); // true
        System.out.println(y.equals(z)); // true
        System.out.println(x.equals(z)); // false
    }
}
