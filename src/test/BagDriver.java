package test;

import structures.Bag;

/**
 *
 * @author Eugene
 * @version 1.0
 */
public class BagDriver {

    /**
     * @param args S
     */
    public static void main(String[] args) {
        Bag bagOfColors = new Bag(10);


        bagOfColors.add("Blue");
        bagOfColors.add("Green");
        bagOfColors.add("Purple");
        bagOfColors.add("Red");
        bagOfColors.add("White");
        bagOfColors.add("Orange");
        bagOfColors.add("Black");
        bagOfColors.add("Grey");
        bagOfColors.add("Pink");
        bagOfColors.add("Gold");

        System.out.println(bagOfColors);

        System.out.println("contains(Blue): " + bagOfColors);
        System.out.println("contains(Grey): " + bagOfColors);

        System.out.println(bagOfColors.remove("Red"));
        System.out.println(bagOfColors);
    }

}