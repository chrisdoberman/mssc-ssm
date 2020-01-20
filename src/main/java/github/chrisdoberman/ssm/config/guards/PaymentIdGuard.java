package github.chrisdoberman.ssm.config.guards;

import github.chrisdoberman.ssm.domain.PaymentEvent;
import github.chrisdoberman.ssm.domain.PaymentState;
import github.chrisdoberman.ssm.services.PaymentServiceImpl;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.guard.Guard;
import org.springframework.stereotype.Component;

@Component
public class PaymentIdGuard implements Guard<PaymentState, PaymentEvent> {

    @Override
    public boolean evaluate(StateContext<PaymentState, PaymentEvent> context) {
        return context.getMessageHeader(PaymentServiceImpl.PAYMENT_ID_HEADER) != null;
    }
}
