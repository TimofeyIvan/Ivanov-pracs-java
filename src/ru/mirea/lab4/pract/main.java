package ru.mirea.lab4.pract;

public class main {
    public static void main(String[] args)
    {
        for (Season season:Season.values())
        {
            System.out.println(season.ToString());
            season.getDescription();

            switch(season){
                case SUMMER:
                    System.out.println("I love summer"+"\n");
                    continue;

                case AUTUMN:
                    System.out.println("I love autumn"+"\n");
                    continue;

                case WINTER:
                    System.out.println("I love winter"+"\n");
                    continue;

                case SPRING:
                    System.out.println("I love spring"+"\n");
                    continue;
            }
        }
    }
}
