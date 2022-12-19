package ru.mirea.lab6.task10;

import java.util.Scanner;

public class ComputerBuilder implements UserInput {

    private enum electronicsNames
    {
        Computer,
        Memory,
        Processor,
        Monitor
    }

    @Override
    public String GetComputerName() {
        return GetElectronic(electronicsNames.Computer);
    }

    @Override
    public String GetComputerProcessor() {
        return GetElectronic(electronicsNames.Processor);
    }

    @Override
    public String GetComputerMemory() {
        return GetElectronic(electronicsNames.Memory);
    }

    @Override
    public String GetComputerMonitor() {
        return GetElectronic(electronicsNames.Monitor);
    }

    private String GetElectronic(electronicsNames name)
    {
        System.out.print("Введите  название"+ name.toString() +": ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("");
        return scanner.nextLine();
    }
}
