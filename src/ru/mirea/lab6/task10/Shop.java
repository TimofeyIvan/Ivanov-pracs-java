package ru.mirea.lab6.task10;

public class Shop
{
    private Computer[] computersArray = null;
    private int maxComputersCount = 0;
    private int computersCount = 0;

    Shop(int computerCount)
    {
        maxComputersCount = computerCount;
        computersArray = new Computer[computerCount];
    }

    public void AddComputer(Computer computer)
    {
        computer.setId(computersCount);
        computersArray[computersCount] = computer;
        computersCount++;
    }

    public void DeleteComputer(String computerName)
    {
        Computer[] computers = new Computer[computersCount - 1];

        int counter = 0;

        for (Computer computer: computersArray)
        {
            if(computer.getName() == computerName)
            {
                computersCount--;
                continue;
            }

            computers[counter] = computer;
            counter++;
        }
    }

    public Boolean FindComputer(String computerName)
    {
        for (Computer computer: computersArray)
        {
            if(computer.getName().equals(computerName))
                return true;
        }
        return false;
    }

    public int GetCurrentComputersCount()
    {
        return computersCount;
    }

    public int GetMaxComputersCount()
    {
        return maxComputersCount;
    }

    public String ToString()
    {
        StringBuffer computers = new StringBuffer();
        for (Computer computer : computersArray)
        {
            computers.append(String.format("%s) Компьютер: %s Монитор: %s Процессор: %s Память: %s\n",
                    computer.getId(),
                    computer.getName(),
                    computer.getMonitor().getName(),
                    computer.getProcessor().getName(),
                    computer.getMemory().getName()));
        }

        return computers.toString();
    }
}
