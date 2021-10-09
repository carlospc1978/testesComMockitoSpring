package trainne.domain.order;

import org.junit.jupiter.api.Test;
import trainne.domain.payment.PaymentService;
import trainne.domain.user.UserService;
import trainne.domain.util.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class OrderServiceTest {

    @Test
    void deveLancarExcecaoQuandoOUsuarioForMenorDeIdade() {

        PaymentService paymentService = new PaymentService();
        UserService userService = new UserService();
        OrderService orderService = new OrderService(userService,paymentService);

        Order order = new Order();

        IllegalStateException excep = assertThrows(IllegalStateException.class, () -> orderService.create(order));

        assertEquals(String.valueOf(enums.USUARIORECUSADO),excep.getMessage());

       // Mockito.verify(paymentService.pay());

    }

}