package com.bbva.rbvd.dto.lifeinsrc.aso;

import com.bbva.rbvd.dto.lifeinsrc.bo.ContactDetailsBO;

import java.util.List;

public class GetContactDetailsASO {

    private List<ContactDetailsBO> data;

    public List<ContactDetailsBO> getData() {return data;}
    public void setData(List<ContactDetailsBO> data) {this.data = data;}

}
