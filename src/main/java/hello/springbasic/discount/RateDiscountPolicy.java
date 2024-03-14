package hello.springbasic.discount;

import hello.springbasic.member.Grade;
import hello.springbasic.member.Member;

public class RateDiscountPolicy implements DiscountPolicy {

    private int discountRate = 10;

    //VIP고객에게는 10% 할인 제공
    @Override
    public int discount(Member member, int money) {

        if (member.getGrade() == Grade.VIP) {
            return money * discountRate / 100;
        } else {
            return 0;
        }
    }
}
