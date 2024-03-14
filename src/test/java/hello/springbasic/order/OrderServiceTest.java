package hello.springbasic.order;

import hello.springbasic.member.*;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OrderServiceTest {

    OrderService orderService = new OrderServiceImpl();
    MemberService memberService = new MemberServiceImpl();

    @Test
    void createOrder() {
        long memberId = 1L;
        Member userA = new Member(memberId, "userA", Grade.VIP);
        memberService.join(userA);

        Order itemA = orderService.createOrder(memberId, "itemA", 10000);
        Assertions.assertThat(itemA.calculatePrice()).isEqualTo(9000);
    }


}