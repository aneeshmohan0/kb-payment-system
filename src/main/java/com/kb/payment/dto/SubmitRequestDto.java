package com.kb.payment.dto;

public record SubmitRequestDto(String name,
                               String emailId,
                               int noOfAdults,
                               int noOfChildren,
                               int noOfKids,
                               boolean isStudent,
                               int noOfVeg,
                               int noOfNonVeg) {
}
