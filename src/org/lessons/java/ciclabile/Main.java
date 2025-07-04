package org.lessons.java.ciclabile;

public class Main {
    public static void main(String[] args) {
        Ciclabile ciclabile = new Ciclabile(new int[] { 3, 2, 5, 21, 344 });
        ciclabile.addElemento(2222);
        System.out.println(ciclabile.getElementoSuccessivo());
        System.out.println(ciclabile.hasAncoraElementi());
        System.out.println(ciclabile.getElementoSuccessivo());
        System.out.println(ciclabile.hasAncoraElementi());
        System.out.println(ciclabile.getElementoSuccessivo());
        System.out.println(ciclabile.hasAncoraElementi());
        System.out.println(ciclabile.hasAncoraElementi());
        System.out.println(ciclabile.getElementoSuccessivo());
        System.out.println(ciclabile.hasAncoraElementi());
        System.out.println(ciclabile.getElementoSuccessivo());
        System.out.println(ciclabile.hasAncoraElementi());
        System.out.println(ciclabile.getElementoSuccessivo());
        System.out.println(ciclabile.hasAncoraElementi());

        Ciclabile ciclabileBonus = new Ciclabile();
        ciclabileBonus.addElemento(333);
        System.out.println(ciclabileBonus.getElementoSuccessivo());

    }

}
