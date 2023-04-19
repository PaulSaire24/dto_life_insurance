
package com.bbva.rbvd.dto.lifeinsrc.utils;

public enum RBVDErrors {

    ERROR_FROM_RIMAC("RBVD00000119", false, "Error desde Rimac con la cotizacion enviada"),
    WRONG_PRODUCT_CODE("RBVD01020022", false, "El codigo de producto enviado es incorrecto"),
    WRONG_PLAN_CODES("RBVD01020023", false, "Los codigos de los planes son incorrectos"),
    INSERTION_ERROR_IN_SIMULATION_TABLE("RBVD01020024", false, "Parametros requeridos incompletos para el registro de simulacion");
    
    private final String adviceCode;
    private final boolean rollback;
    private final String message;

    public String getAdviceCode() { return adviceCode; }
    public boolean isRollback() { return rollback; }
    public String getMessage() { return message; }

    RBVDErrors(String adviceCode, boolean rollback, String message) {
        this.adviceCode = adviceCode;
        this.rollback = rollback;
        this.message = message;
    }

}