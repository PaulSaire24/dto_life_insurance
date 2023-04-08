
package com.bbva.rbvd.dto.lifeinsrc.utils;

public enum RBVDErrors {

    ERROR_FROM_RIMAC("RBVD00000119", false, "Error desde Rimac con la cotizacion enviada"),
    SERVER_ERROR("RBVD00000158", false, "Ocurrio un problema en el servidor");

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