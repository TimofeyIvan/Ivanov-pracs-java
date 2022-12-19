package ru.mirea.lab4.tries;
import java.util.*;
//public class test1 {
    // базовый класс велосипед
    class Bicycle {
        public int gear; // поле
        public int speed; // поле

        // конструктор класса
        public Bicycle(int gear, int speed) {
            this.gear = gear;
            this.speed = speed;
        }

        //метод класса
        public void applyBrake(int decrement) {
            speed -= decrement;
        }

        //метод класса
        public void speedUp(int increment) {
            speed += increment;
        }

        // метод toString()чтобы печатать объекты Bicycle
        public String toString() {
            return ("No of gears are " + gear + "\n"
                    + "speed of bicycle is " + speed);
        }
    } // end of class

    // производный класс горный велосипед
    class MountainBike extends Bicycle {
        public int seatHeight; //новое поле произв. класса

        //конструктор производного класса
        public MountainBike(int gear, int speed,
                            int startHeight) {
// здесь вызов конструктора класса родителя
            super(gear, speed);
            seatHeight = startHeight;
        }

        // новый метод производного класса
        public void setHeight(int newValue) {
            seatHeight = newValue;
        }

        // переопределенный метод toString()класса Bicycle
        @Override
        public String toString() {
            return (super.toString() + "\nseat height is "
                    + seatHeight);
        }
    }

    // класс тестер Main
    public class test1 {
        public static void main(String[] args) {
// создаем объект родительского класса

            Bicycle bl = new Bicycle(5, 200);
            System.out.println(bl.toString());
// создаем объект дочернего класса
            MountainBike mb = new MountainBike(3, 100, 25);
            System.out.println(mb.toString());
        }
    }
//}
