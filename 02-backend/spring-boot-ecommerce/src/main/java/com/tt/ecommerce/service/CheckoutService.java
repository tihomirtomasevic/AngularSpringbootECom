package com.tt.ecommerce.service;

import com.tt.ecommerce.dto.PaymentInfo;
import com.tt.ecommerce.dto.Purchase;
import com.tt.ecommerce.dto.PurchaseResponse;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

public interface CheckoutService {

    PurchaseResponse placeOrder(Purchase purchase);

    PaymentIntent createPaymentIntent(PaymentInfo paymentInfo) throws StripeException;

}
