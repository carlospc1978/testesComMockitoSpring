package trainne.domain.order;

import trainne.domain.payment.PaymentService;
import trainne.domain.user.UserService;
import trainne.domain.util.enums;

public class OrderService {

    private UserService userService;
    private PaymentService paymentService;

    public OrderService(UserService userService, PaymentService paymentService) {
        this.userService = userService;
        this.paymentService = paymentService;
    }

    public void create(Order order){
        boolean isUserMinor = userService.isUserMinor(order.getUserid());
        if(isUserMinor){
            throw new IllegalStateException(String.valueOf(enums.USUARIORECUSADO));
        }

        paymentService.pay();

    }

}
