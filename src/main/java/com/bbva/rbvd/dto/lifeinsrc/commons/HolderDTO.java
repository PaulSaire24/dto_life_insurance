package com.bbva.rbvd.dto.lifeinsrc.commons;


public class HolderDTO extends CommonFieldsDTO {

    private String firstName;
    private String lastName;
    private String fullName;
    private IdentityDocumentDTO identityDocument;


    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFullName() { return fullName; }
    public void setFullName(String fullName) { this.fullName = fullName; }

    public IdentityDocumentDTO getIdentityDocument() { return identityDocument; }
    public void setIdentityDocument(IdentityDocumentDTO identityDocument) { this.identityDocument = identityDocument; }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("HolderDTO{");
        sb.append("id='").append(this.getId()).append('\'');
        sb.append(", fullName='").append(fullName).append('\'');
        sb.append(", firstName=").append(firstName).append('\'');
        sb.append(", lastName=").append(lastName).append('\'');
        sb.append(", identityDocument=").append(identityDocument);
        sb.append('}');
        return sb.toString();
    }

}
