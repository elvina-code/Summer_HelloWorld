package oop.Inheritance;


import oop.Car1;

public class DealerDemo {

        public static void main(String[] args) {
            Car1 bmw = new Car1("Black", "BMW", 2010, 20000);
            System.out.println(bmw.getMileage());

            bmw.setMileage(20010);
            System.out.println(bmw.getMileage());

            bmw.drive(15);
            System.out.println(bmw.getMileage());


            bmw.paint("White");
                System.out.println(bmw.getColor());

        }

        }



