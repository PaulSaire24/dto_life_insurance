package com.bbva.rbvd.dto.lifeinsrc.utils;

public enum RBVDProperties {

    SIMULATION_LIFE_URI("simulation.rimac.life.uri"),
    SIMULATION_LIFE_RIMAC("simulationlife.rimac"),
    
    SIMULATION_UPDATE_LIFE_URI("simulationlifeupdate.rimac.uri"),
    SIMULATION_UPDATE_LIFE_RIMAC("simulationlifeupdate.rimac"),
    

    QUOTATION_EASYES_RIMAC_URI("uri.easyes.quotation"),
    QUOTATION_EASYES_RIMAC("easyesquotation"),

    KEY_OF_INSRC_LIST_RESPONSES("dtoInsurance"),
    ID_API_CRYPTO("createCrypto"),
    ID_API_TIER("listCustomerClassifications"),
    ASO_MOCK_TIER_ENABLED("rbvd.aso.mock.tier.enabled"),
    ASO_GET_TIER_MOCK("rbvd.aso.get.tier.mock"),

    AUTHORIZATION_HEADER("Authorization"),
    XAMZDATE_HEADER("X-Amz-Date"),
    XAPIKEY_HEADER("x-api-key"),
    TRACEID_HEADER("traceId"),

    ID_MANDATORY_COVERAGE("MANDATORY"),
    NAME_MANDATORY_COVERAGE("OBLIGATORIA"),
    ID_INCLUDED_COVERAGE("INCLUDED"),
    NAME_INCLUDED_COVERAGE("INCLUIDA"),
    ID_OPTIONAL_COVERAGE("OPTIONAL"),
    NAME_OPTIONAL_COVERAGE("OPCIONAL"),
    
    DATO_PARTICULAR_EDAD_ASEGURADO("Edad"),
    DATO_PARTICULAR_SUMA_ASEGURADA_COBERTURA_FALLECIMIENTO("COVSumaAsegurada"),
    DATO_PARTICULAR_PERIODO_ANOS("PLAZO DEL SEGURO"),
    DATO_PARTICULAR_PORCENTAJE_DEVOLUCION("Porcent_Devolucion"),
    DATO_PARTICULAR_INDICADOR_ENDOSADO("Indicador_endosado"),

    QUERY_GET_PRODUCT_INFORMATION("PISD.GET_PRODUCT_INFORMATION_LIFE"),
    QUERY_GET_PRODUCT_MODALITIES_INFORMATION("PISD.GET_PRODUCT_MODALITIES_INFORMATION_LIFE"),
    QUERY_SELECT_INSURANCE_SIMULATION_ID("PISD.SELECT_INSURANCE_SIMULATION_ID_LIFE"),
    QUERY_INSERT_INSURANCE_SIMULATION("PISD.INSERT_INSURANCE_SIMULATION_LIFE"),
    QUERY_INSERT_INSRNC_SIMLT_PRD("PISD.INSERT_INSRNC_SIMLT_PRD_LIFE"),
    QUERY_GET_SIMULATION_INFORMATION_FOR_EASYES_QUOTATION("PISD.GET_SIMULATION_INFORMATION_FOR_EASYES_QUOTATION"),
    QUERY_GET_REQUIRED_INFORMATION_FOR_EASYES_QUOTATION("PISD.GET_REQUIRED_INFORMATION_FOR_EASYES_QUOTATION"),
    QUERY_GET_PAYMENT_FREQUENCY_NAME("PISD.GET_PAYMENT_FREQUENCY_NAME"),
    QUERY_INSERT_INSURANCE_QUOTATION("PISD.INSERT_INSURANCE_QUOTATION"),
    QUERY_INSERT_INSURANCE_QUOTATION_MOD("PISD.INSERT_INSURANCE_QUOTATION_MOD"),
    QUERY_GET_INSURANCE_AMOUNT("PISD.QUERY_GET_INSURANCE_AMOUNT"),
    QUERY_VALIDATE_IF_QUOTATION_EXISTS("PISD.VALIDATE_IF_QUOTATION_EXISTS"),
    QUERY_INSERT_PARTICIPANT_SIMULATION("PISD.INSERT_PARTICIPANT_SIMULATION"),


    FIELD_RESULT_NUMBER("RESULT_NUMBER"),
    QUERY_UPDATE_QUOTATION_MOD("PISD.UPDATE_QUOTATION_MOD"),

    FIELD_OR_FILTER_INSURANCE_PRODUCT_ID("INSURANCE_PRODUCT_ID"),
    FIELD_SALE_CHANNEL_ID("SALE_CHANNEL_ID"),
    FIELD_MAIN_CONSIDERATION_IND_TYPE("MAIN_CONSIDERATION_IND_TYPE"),
    FIELD_INSURANCE_MODALITY_NAME("INSURANCE_MODALITY_NAME"),
    FIELD_SUGGESTED_MODALITY_IND_TYPE("SUGGESTED_MODALITY_IND_TYPE"),
    FIELD_OR_FILTER_INSURANCE_MODALITY_TYPE("INSURANCE_MODALITY_TYPE"),
    FIELD_PUBLICATION_ORDER_NUMBER("PUBLICATION_ORDER_NUMBER"),
    FIELD_INSURANCE_PRODUCT_DESC("INSURANCE_PRODUCT_DESC"),
    FIELD_INSURANCE_BUSINESS_NAME("INSURANCE_BUSINESS_NAME"),
    FIELD_INSURANCE_COMPANY_MODALITY_ID("INSURANCE_COMPANY_MODALITY_ID"),

    FIELD_EXTERNAL_SIMULATION_ID("EXTERNAL_SIMULATION_ID"),
    FIELD_PRODUCT_ID("PRODUCT_ID"),
    FIELD_SELECTED_PLAN_ID("SELECTED_PLAN_ID"),
    FIELD_PAYMENT_FREQUENCY_ID("PAYMENT_FREQUENCY_ID"),
    FIELD_PAYMENT_FREQUENCY_NAME("PAYMENT_FREQUENCY_NAME"),

    FIELD_POLICY_QUOTA_INTERNAL_ID("POLICY_QUOTA_INTERNAL_ID"),
    FIELD_INSURANCE_COMPANY_QUOTA_ID("INSURANCE_COMPANY_QUOTA_ID"),
    FIELD_QUOTE_DATE("QUOTE_DATE"),
    FIELD_POLICY_QUOTA_END_VALIDITY_DATE("POLICY_QUOTA_END_VALIDITY_DATE"),
    FIELD_LAST_CHANGE_BRANCH_ID("LAST_CHANGE_BRANCH_ID"),
    FIELD_PAYMENT_TERM_NUMBER("PAYMENT_TERM_NUMBER"),
    FIELD_POLICY_PAYMENT_FREQUENCY_TYPE("POLICY_PAYMENT_FREQUENCY_TYPE"),
    FIELD_FINANCING_START_DATE("FINANCING_START_DATE"),
    FIELD_FINANCING_END_DATE("FINANCING_END_DATE"),
    FIELD_PREMIUM_AMOUNT("PREMIUM_AMOUNT"),
    FIELD_PREMIUM_CURRENCY_ID("PREMIUM_CURRENCY_ID"),
    FIELD_SAVED_QUOTATION_IND_TYPE("SAVED_QUOTATION_IND_TYPE"),
    FIELD_CONTACT_EMAIL_DESC("CONTACT_EMAIL_DESC"),
    FIELD_CUSTOMER_PHONE_DESC("CUSTOMER_PHONE_DESC"),
    FIELD_DATA_TREATMENT_IND_TYPE("DATA_TREATMENT_IND_TYPE"),
    FIELD_INSURANCE_SIMULATION_ID("INSURANCE_SIMULATION_ID"),
    FIELD_INSRNC_COMPANY_SIMULATION_ID("INSRNC_COMPANY_SIMULATION_ID"),
    FIELD_CUSTOMER_ID("CUSTOMER_ID"),
    FIELD_CUSTOMER_SIMULATION_DATE("CUSTOMER_SIMULATION_DATE"),
    FIELD_CUST_SIMULATION_EXPIRED_DATE("CUST_SIMULATION_EXPIRED_DATE"),
    FIELD_BANK_FACTOR_TYPE("BANK_FACTOR_TYPE"),
    FIELD_BANK_FACTOR_AMOUNT("BANK_FACTOR_AMOUNT"),
    FIELD_BANK_FACTOR_PER("BANK_FACTOR_PER"),
    FIELD_SOURCE_BRANCH_ID("SOURCE_BRANCH_ID"),
    FIELD_CREATION_USER_ID("CREATION_USER_ID"),
    FIELD_USER_AUDIT_ID("USER_AUDIT_ID"),
    FIELD_CREATION_DATE("CREATION_DATE"),
    FIELD_PERSONAL_DOC_TYPE("PERSONAL_DOC_TYPE"),
    FIELD_PARTICIPANT_PERSONAL_ID("PARTICIPANT_PERSONAL_ID"),
    FIELD_INSURED_CUSTOMER_NAME("INSURED_CUSTOMER_NAME"),
    FIELD_CLIENT_LAST_NAME("CLIENT_LAST_NAME"),
    FIELD_CUSTOMER_SEGMENT_NAME("CUSTOMER_SEGMENT_NAME"),
    FIELD_CAMPAIGN_FACTOR_TYPE("CAMPAIGN_FACTOR_TYPE"),
    FIELD_CAMPAIGN_OFFER_1_AMOUNT("CAMPAIGN_OFFER_1_AMOUNT"),
    FIELD_CAMPAIGN_FACTOR_PER("CAMPAIGN_FACTOR_PER"),
    FILTER_INSURANCE_PRODUCT_TYPE("INSURANCE_PRODUCT_TYPE"),
    FIELD_Q_PISD_SIMULATION_ID0_NEXTVAL("NEXTVAL"),
    FIELD_INSURED_AMOUNT("INSURED_AMOUNT"),
    FIELD_PERIOD_TYPE("PERIOD_TYPE"),
    FIELD_PERIOD_NUMBER("PERIOD_NUMBER"),
    FIELD_REFUND_PER("REFUND_PER"),
    FIELD_TOTAL_RETURN_AMOUNT("TOTAL_RETURN_AMOUNT"),
    FIELD_INSURED_ID("INSURED_ID"),
    FIELD_CUSTOMER_DOCUMENT_TYPE("CUSTOMER_DOCUMENT_TYPE"),
    FIELD_PERSONAL_ID("PERSONAL_ID"),
    FIELD_IS_BBVA_CUSTOMER_TYPE("IS_BBVA_CUSTOMER_TYPE"),
    FIELD_CUSTOMER_ENTRY_DATE("CUSTOMER_ENTRY_DATE"),
    FIELD_PARTICIPANT_ROLE_ID("PARTICIPANT_ROLE_ID"),
    FIELD_USER_EMAIL_PERSONAL_DESC("USER_EMAIL_PERSONAL_DESC"),
    FIELD_PHONE_ID("PHONE_ID"),
    FIELD_CUSTOMER_BIRTH_DATE("CUSTOMER_BIRTH_DATE"),
    FIELD_CURRENCY_ID("CURRENCY_ID");

    private final String value;

    private RBVDProperties(String value) {
        this.value = value;
    }

    public String getValue() {
        return this.value;
    }
    
}
