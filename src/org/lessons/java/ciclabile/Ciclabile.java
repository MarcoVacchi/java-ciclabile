package org.lessons.java.ciclabile;

public class Ciclabile {

    private int[] arrayInt = {};
    private int currentIndex = 0;

    public Ciclabile(int[] arrayInt) {
        this.arrayInt = arrayInt;

    }

    public Ciclabile() {
        this.arrayInt = new int[0];
    };

    public int getElementoSuccessivo() {

        for (int i = 0; i < arrayInt.length; i++) {
            if (currentIndex < arrayInt.length) {
                currentIndex++;
                return arrayInt[currentIndex - 1];
            }
        }
        return -1;
    }

    public boolean hasAncoraElementi() {
        if (currentIndex >= arrayInt.length) {
            return false;
        }
        return true;
    }

    public void addElemento(int addNumber) {
        int[] newArrayInt = new int[this.arrayInt.length + 1];
        for (int i = 0; i < this.arrayInt.length; i++) {
            newArrayInt[i] = arrayInt[i];
        }
        newArrayInt[newArrayInt.length - 1] = addNumber;
        arrayInt = newArrayInt;
    }
}

// Bonus :
// prevedere anche un costruttore che non prenda parametri e un metodo
// addElemento che permetta di aggiungere un nuovo intero all’elenco da ciclare.

// Nota bene:
// Vanno utilizzati solo gli array nativi e quindi non è possibile usare
// iterator vari.