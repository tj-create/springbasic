package hello.springbasic.order;

import hello.springbasic.AppConfig;
import hello.springbasic.member.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

class OrderServiceTest {

    MemberService memberService;
    OrderService orderService;

    @BeforeEach
    void before() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        memberService = applicationContext.getBean("memberService", MemberService.class);
        orderService = applicationContext.getBean("orderService", OrderService.class);
    }


    @Test
    void createOrder() {
        long memberId = 1L;
        Member userA = new Member(memberId, "userA", Grade.VIP);
        memberService.join(userA);

        Order itemA = orderService.createOrder(memberId, "itemA", 20000);
        Assertions.assertThat(itemA.calculatePrice()).isEqualTo(19000);
    }


}