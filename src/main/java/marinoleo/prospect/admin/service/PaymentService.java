package marinoleo.prospect.admin.service;

import marinoleo.prospect.admin.entities.payment.PaymentEntity;
import marinoleo.prospect.admin.model.Payment;
import marinoleo.prospect.admin.repository.PaymentRepository;
import marinoleo.prospect.admin.utils.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class PaymentService {
    @Autowired
    private PaymentRepository paymentRepository;
    @Autowired
    private ProspectorService prospectorService;

    public Payment pay(Long id) {
        Payment payment = new Payment();
        payment.setProspectorId(id);
        payment.setDate(LocalDateTime.now());
        payment.setAmount(prospectorService.calculateBalance(id).getBalance());
        return Mapper.paymentEntityToPayment(paymentRepository.save(Mapper.paymentToPaymentEntity(payment)));
    }

    public List<Payment> getPayments() {
        List<PaymentEntity> paymentEntityList = paymentRepository.findAll();
        List<Payment> paymentList = new ArrayList<>();
        for(PaymentEntity payment:paymentEntityList){
            paymentList.add(Mapper.paymentEntityToPayment(payment));
        }
        return paymentList;
    }
}
