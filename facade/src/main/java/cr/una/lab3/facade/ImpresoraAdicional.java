/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cr.una.lab3.facade;

/**
 *
 * @author mguzmana
 */
public class ImpresoraAdicional extends Impresora {

    /**
     *
     * @param tipoDocumento
     * @param hoja
     * @param color
     * @param texto
     */
    public ImpresoraAdicional(String tipoDocumento, String hoja, boolean color, String texto) {
        super(tipoDocumento, hoja, color, texto);
    }

    public String imprimir (String texto){
        return super.toString();
    }
}
