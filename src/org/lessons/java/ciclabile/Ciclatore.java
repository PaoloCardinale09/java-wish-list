package org.lessons.java.ciclabile;

public class Ciclatore {
    // int getElementoSuccessivo() (che restituisce il prossimo elemento rispetto all’ultima
    // volta che è stato invocato.
    //Cioè la prima volta restituisce il primo elemento, la seconda volta il secondo, …)

    private final int[] numeri;
    private int currentIndex;

    public Ciclatore(int[] numeri) {
        this.numeri = numeri;
        currentIndex = 0;
    }

    public int getElementoSuccessivo() {
        if (hasAncoraElementi()) {
            int elementoCorrente = numeri[currentIndex];
            currentIndex++;
            return elementoCorrente;
        } else {
            currentIndex = 0;
            return numeri[0];
        }
    }

    public boolean hasAncoraElementi() {
        return currentIndex < numeri.length;
    }


    // (che deve restituire true se ci sono ancora elementi da restituire)


}
