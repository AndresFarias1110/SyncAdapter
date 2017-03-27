package com.herprogramacion.crunch_expenses.utils;

/**
 * Constantes
 */
public class Constantes {

    /**
     * Puerto que utilizas para la conexión.
     * Dejalo en blanco si no has configurado esta característica.
     */
    private static final String PUERTO_HOST = ":3040";

    /**
     * Dirección IP de genymotion o AVD
     */
    private static final String IP = "http://192.169.244.120";

    /**http://192.169.244.120/servicioweb/web/obtener_gastos.php
     * URLs del Web Service
     */
    public static final String GET_URL = IP + PUERTO_HOST + "/getDataStudens";
    public static final String INSERT_URL = IP + PUERTO_HOST + "/postDataStudens";

    /**
     * Campos de las respuestas Json
     */
    public static final String ID_GASTO = "idGasto";
    public static final String ESTADO = "estado";
    public static final String GASTOS = "gastos";
    public static final String MENSAJE = "mensaje";

    /**
     * Códigos del campo {@link ESTADO}
     */
    public static final String SUCCESS = "1";
    public static final String FAILED = "2";

    /**
     * Tipo de cuenta para la sincronización
     */
    public static final String ACCOUNT_TYPE = "com.herprogramacion.crunch_expenses.account";


}
