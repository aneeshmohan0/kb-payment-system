package com.kb.payment.persistance;

import com.kb.payment.dto.SubmitRequestDto;

public interface Repository {

    void save(SubmitRequestDto submitRequestDto);

    SubmitRequestDto retrieveById(String id);
}
