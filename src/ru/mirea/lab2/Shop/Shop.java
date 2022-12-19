package ru.mirea.lab2.Shop;
import java.util.ArrayList;
public class Shop {
    private ArrayList<String> computerArray = new ArrayList<>();
    private int maxComputersCount = 0;
    private int computersCount = 0;

    public void AddComputer(String computerName)
    {
        computerArray.add(computerName);
    }

    public void DeleteComputer(String computerName)
    {
        computerArray.remove(computerName);
    }

    public void FindComputer(String computerName)
    {
        boolean isFound = false;
        for (int i = 0; i < computerArray.size(); i++)
        {
            if (computerArray.get(i).equals(computerName))
            {
                System.out.println("Computer is found: " + computerName);
                isFound = true;
            }
        }
        if (!isFound)
        {
            System.out.println("Computer isn't found");
        }
    }

    public int GetCurrentComputersCount()
    {
        return computersCount;
    }

    public int GetMaxComputersCount()
    {
        return maxComputersCount;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "computerArray=" + computerArray +
                ", maxComputersCount=" + maxComputersCount +
                ", computersCount=" + computersCount +
                '}';
    }
}
