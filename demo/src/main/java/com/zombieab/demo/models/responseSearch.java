package com.zombieab.demo.models;


import lombok.Data;

@Data
public class responseSearch {
    private String responseCode;
    private String responseMessage;
    private String referenceNo;
    private String partnerReferenceNo;
    private String sessionId;
    private String customerNumber;

}
