package marinoleo.prospect.admin.controller;

import marinoleo.prospect.admin.model.Payment;
import marinoleo.prospect.admin.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping("/payment/create/{id}")
    public ResponseEntity<Payment> newPayment(@PathVariable Long id) {
        if (id == null) {
            return ResponseEntity.badRequest().build();
        } else {
            return ResponseEntity.ok(paymentService.pay(id));
        }
    }

    @GetMapping("/payment/getall")
    public ResponseEntity<List<Payment>> getPayments(){
        return ResponseEntity.ok(paymentService.getPayments());
    }
}
