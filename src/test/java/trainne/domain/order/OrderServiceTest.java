package trainne.domain.order;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import trainne.domain.payment.PaymentService;
import trainne.domain.user.UserService;
import trainne.domain.util.enums;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
@AutoConfigureMockMvc
class OrderServiceTest {

    @MockBean
    private UserService userService;
    @MockBean
    private PaymentService paymentService;

    @Autowired
    OrderService orderService;

    @Test
    void deveLancarExcecaoQuandoOUsuarioForMenorDeIdade() {

//        PaymentService paymentService = new PaymentService();
//        UserService userService = new UserService();
//        OrderService orderService = new OrderService(userService,paymentService);

        Order order = Mockito.mock(Order.class);
        Mockito.when(order).thenReturn(order);

        IllegalStateException excep = assertThrows(IllegalStateException.class, () -> orderService.create(order));

        assertEquals(String.valueOf(enums.USUARIORECUSADO),excep.getMessage());

       // Mockito.verify(paymentService.pay());

    }

}