package ru.mirea.lab6.Task11;

public class converted implements Convetable {
    @Override
    public float convert(float farengeit) {
        float converted = (float) 5/9*(farengeit - 32);
        return converted;
    }
}
