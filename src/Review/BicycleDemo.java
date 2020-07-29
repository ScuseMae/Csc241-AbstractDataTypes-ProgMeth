/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package src.Review;

public class BicycleDemo {

    //Interface
    interface Bicycle {

        void ride();
        void honk();
    }

    //Class - MountainBike
    private class MountainBike implements Bicycle {

        String name;

        public MountainBike(String name) {
            this.name = name;
        }

        @Override
        public void ride() {
            System.out.println("ribing a " + name + " mountain bike.");
        }

        @Override
        public void honk() {
            throw new UnsupportedOperationException("Not supported yet.");
        }
    }

    //Class - StreetBike
    class StreetBike implements Bicycle {

        String name;

        public StreetBike(String name) {
            this.name = name;
        }

        @Override
        public void ride() {
            System.out.println("riding a " + name + " street bike.");
        }

        @Override
        public void honk() {
            throw new UnsupportedOperationException("Not coded yet....");
        }
    }
    
    public static void main(String[] args) {
        
    }

}
