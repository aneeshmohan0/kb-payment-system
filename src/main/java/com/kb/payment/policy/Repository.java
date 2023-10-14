package com.kb.payment.policy;

import com.kb.payment.dto.SubmitRequestDto;

public interface Repository {

    void save(SubmitRequestDto submitRequestDto);

    SubmitRequestDto retrieveById(String id);
}
