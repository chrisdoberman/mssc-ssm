package github.chrisdoberman.ssm.config.actions;

import github.chrisdoberman.ssm.domain.PaymentEvent;
import github.chrisdoberman.ssm.domain.PaymentState;
import org.springframework.statemachine.StateContext;
import org.springframework.statemachine.action.Action;
import org.springframework.stereotype.Component;

@Component
public class AuthApprovedAction implements Action<PaymentState, PaymentEvent> {
    @Override
    public void execute(StateContext<PaymentState, PaymentEvent> context) {
        System.out.println("Sending Notification of Auth APPROVED");
    }
}
