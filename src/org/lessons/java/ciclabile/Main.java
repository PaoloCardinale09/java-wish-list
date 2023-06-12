package org.lessons.java.ciclabile;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        Ciclatore elenco = new Ciclatore(array);

        int element1 = elenco.getElementoSuccessivo();
        System.out.println(element1);
        int element2 = elenco.getElementoSuccessivo();
        System.out.println(element2);
        int element3 = elenco.getElementoSuccessivo();
        System.out.println(element3);
        int element4 = elenco.getElementoSuccessivo();
        System.out.println(element4);
        int element5 = elenco.getElementoSuccessivo();
        System.out.println(element5);
        System.out.println(elenco.hasAncoraElementi());

        int element6 = elenco.getElementoSuccessivo();
        System.out.println(element6);
        int element7 = elenco.getElementoSuccessivo();
        System.out.println(element7);

       /* while (elenco.hasAncoraElementi()) {
            int elemento = elenco.getElementoSuccessivo();
            System.out.println("Elemento successivo: " + elemento);
        }*/
    }
}
