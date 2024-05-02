package paymentservice.mockpaymentservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/endpoint")
public class MockEndpointController {

    @GetMapping("/check")
    public String check() {
        return "user";
    }
}
