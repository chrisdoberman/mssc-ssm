package github.chrisdoberman.ssm.repository;

import github.chrisdoberman.ssm.domain.Payment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
