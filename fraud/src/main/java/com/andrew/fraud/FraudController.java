package com.andrew.fraud;

import com.andrew.clients.fraud.FraudCheckResponse;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/fraud-check")
@AllArgsConstructor
@Slf4j
public class FraudController {
    private final FraudCheckService fraudCheckService;

    @GetMapping(path = "{customerId}")
    public FraudCheckResponse isFraudster(
            @PathVariable ("customerId") Integer customerId) {
        boolean isFraudulentCustomer = fraudCheckService.
                isFraudulentCustomer(customerId);
        log.info("fraud check request {}" , customerId);
        return new FraudCheckResponse(isFraudulentCustomer);
    }
}
