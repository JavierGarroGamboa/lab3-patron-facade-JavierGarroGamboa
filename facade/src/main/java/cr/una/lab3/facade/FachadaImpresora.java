/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.una.lab3.facade;

/**
 * @author mguzmana
 */
public class FachadaImpresora {

    ImpresoraNormal impresoraNormal;
    ImpresoraAdicional impresoraAdicional;

    public FachadaImpresora() {
        impresoraNormal = new ImpresoraNormal("PDF", "A4", true, "texto1");
        impresoraAdicional = new ImpresoraAdicional("excel", "a3", false, "texto2");
    }

    public String imprimirNormal(String texto) {
        return impresoraNormal.imprimir(texto);
    }

    public String imprimirDiferente(String texto) {
        return impresoraAdicional.imprimir(texto);
    }
}
