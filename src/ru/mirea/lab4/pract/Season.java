package ru.mirea.lab4.pract;

public enum Season {

    SUMMER(30)
    {
        public void getDescription()
        {
            System.out.println("Теплое время года");
        }

    },

    AUTUMN(10){
        public void getDescription()
        {
            System.out.println("Дождливое время года");
        }

    },

    WINTER(-10),

    SPRING(15){
        public void getDescription()
        {
            System.out.println("Красивое время года");
        }

    };

    private int temp;

    Season(int temp)
    {
        this.temp=temp;
    }

    public void getDescription()
    {
        System.out.println("Холодное время года");
    }

    public String ToString()
    {
        return name()  + " averageTemperature = " + temp + "\u00B0C";
    }
}
