package org.lessons.java.ciclabile;

public class Ciclabile {

    public int[] arrayInt = {};
    public int currentIndex = 0;

    public Ciclabile(int[] arrayInt) {
        this.arrayInt = arrayInt;

    }

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

}

// - boolean hasAncoraElementi() (che deve restituire true se ci sono ancora
// elementi da restituire)

// Vogliamo realizzare una classe che contenga un elenco di interi e che ci
// permetta di ciclarli (dal primo all’ultimo).

// Dovrà offrire due metodi :
// - int getElementoSuccessivo() (che restituisce il prossimo elemento rispetto
// all’ultima volta che è stato invocato. Cioè la prima volta restituisce il
// primo elemento, la seconda volta il secondo, …)

// La classe deve avere un costruttore che prende come parametro un array di
// interi (che sarà l’elenco che viene gestito internamente)

// Internamente alla classe vogliamo mantenere l’elenco di interi come array, no
// ArrayList o simili.

// Bonus :
// prevedere anche un costruttore che non prenda parametri e un metodo
// addElemento che permetta di aggiungere un nuovo intero all’elenco da ciclare.

// Nota bene:
// Vanno utilizzati solo gli array nativi e quindi non è possibile usare
// iterator vari.