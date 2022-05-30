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

    }
}
