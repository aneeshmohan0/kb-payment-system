package com.kb.payment.policy;

import com.kb.payment.dto.SubmitRequestDto;

public interface EmailService {
    void sendEmail(SubmitRequestDto submitRequestDto);
}
