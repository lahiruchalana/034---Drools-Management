package com.lc.chanakye.myprojectsdroolsbusinessrulesmanagementsystem.business.impl;

import com.lc.chanakye.myprojectsdroolsbusinessrulesmanagementsystem.business.PaymentTypeOfferService;
import com.lc.chanakye.myprojectsdroolsbusinessrulesmanagementsystem.entity.PaymentTypeOffer;
import lombok.RequiredArgsConstructor;
import org.kie.api.runtime.KieSession;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PaymentTypeOfferServiceImpl implements PaymentTypeOfferService {
    private final KieSession session;

    @Override
    public PaymentTypeOffer getOfferOfPaymentType(PaymentTypeOffer paymentTypeOffer) {
        session.insert(paymentTypeOffer);
        session.fireAllRules();
        return paymentTypeOffer;
    }
}
