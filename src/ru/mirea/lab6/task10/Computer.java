package ru.mirea.lab6.task10;

public class Computer
{
    private int Id = 0;
    private String Name = "No pc name";

    private ComputerBrand computerBrand = ComputerBrand.MSI;

    private Processor processor = new Processor();
    private Monitor  monitor = new Monitor();
    private Memory memory = new Memory();

    Computer(String name)
    {
        Name = name;
    }

    public String getName()
    {
        return Name;
    }

    public int getId()
    {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Memory getMemory() {
        return memory;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public Processor getProcessor() {
        return processor;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public void setProcessor(Processor processor) {
        this.processor = processor;
    }

    public void setComputerBrand(ComputerBrand computerBrand) {
        this.computerBrand = computerBrand;
    }

    public ComputerBrand getComputerBrand() {
        return computerBrand;
    }
}
