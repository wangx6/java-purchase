package io.vhi.mspurchase.controller;

import io.vhi.mspurchase.model.PaymentModel;
import io.vhi.mspurchase.model.PaymentSaveResponseModel;
import io.vhi.mspurchase.model.PurchaseItem;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import java.util.*;


@RestController
@RequestMapping("/purchase")
public class PurchaseController {

    @GetMapping("/{purchaseId}")
    public List<PurchaseItem> getPurchaseItem(@PathVariable("purchaseId") String purchaseId) {
        System.out.print(purchaseId);
        //String id, String name, Double price, String currency
        List<PurchaseItem> pis = Arrays.asList(
                new PurchaseItem(purchaseId, "plan-1", 2.0, "euro"),
                new PurchaseItem(purchaseId, "plan-2", 2.0, "euro"),
                new PurchaseItem(purchaseId, "plan-3", 2.0, "euro"),
                new PurchaseItem(purchaseId, "plan-4", 2.0, "euro")
        );

        return pis;
    }

    @PostMapping("save")
    public String save(@RequestBody String purchaseData) {
        System.out.print("\n\n" + purchaseData);

        // create payment and make sure it is successful
        RestTemplate restTemplate = new RestTemplate();
        PaymentSaveResponseModel paymentResponse = restTemplate.postForObject(
                "http://localhost:8020/payment/save",
                new PaymentModel("112232", 4300.0,"purchase-"+ UUID.randomUUID()),
                PaymentSaveResponseModel.class
        );
        System.out.print(paymentResponse);

        // then save the purchase
        System.out.print("\nsave the purchase now...");
        try{
            Thread.sleep(1000);
            System.out.print("\npurchase saved...");
        } catch(InterruptedException ie) {
            Thread.currentThread().interrupt();
        }


        return "all good";
    }

}

