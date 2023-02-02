package com.lc.chanakye.myprojectsdroolsbusinessrulesmanagementsystem.controller;

import com.lc.chanakye.myprojectsdroolsbusinessrulesmanagementsystem.business.PaymentTypeOfferService;
import com.lc.chanakye.myprojectsdroolsbusinessrulesmanagementsystem.controller.controllerconfig.ResponseHandler;
import com.lc.chanakye.myprojectsdroolsbusinessrulesmanagementsystem.entity.PaymentTypeOffer;
import jdk.jfr.Description;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class PaymentTypeOfferController {

    private final PaymentTypeOfferService paymentTypeOfferService;

    @GetMapping(value = "${server.servlet.orderGetOffer}")
    @Description("Get the offer value for relevant data of payment type...")
    public ResponseEntity<Object> getOfferValue(
            @RequestBody PaymentTypeOffer paymentTypeOffer
            ) {
      log.info("LOG:: Inside the OfferController getOfferValue()");
      PaymentTypeOffer paymentTypeOfferReceived = paymentTypeOfferService.getOfferOfPaymentType(paymentTypeOffer);
      return ResponseHandler.responseBuilder ("Success", "2000", HttpStatus.OK, paymentTypeOfferReceived);
    }
}
