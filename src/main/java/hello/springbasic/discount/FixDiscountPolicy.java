package hello.springbasic.discount;

import hello.springbasic.SpringbasicApplication;
import hello.springbasic.member.Grade;
import hello.springbasic.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000;

    @Override
    public int discount(Member member, int money) {
        //VIP일때만 1000원 할인
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;
        }

        else {
            return 0;
        }
    }
}
