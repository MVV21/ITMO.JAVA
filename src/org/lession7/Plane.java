package org.lession7;

public class Plane {
    private int weight;
    private int type;
    private int seatPlaces;

    static class Wing{
        public int wingWeight;

        void getWingWeight() {
            System.out.println(wingWeight);
        }

        public void setWingWeight(int wingWeight) {
            this.wingWeight = wingWeight;
        }

        public static void main(String[] args) {
            Plane.Wing object1 = new Plane.Wing();
            object1.setWingWeight(500);
            object1.getWingWeight();

            Plane.Wing object2 = new Plane.Wing();
            object2.setWingWeight(800);
            object2.getWingWeight();
        }

    }
}
