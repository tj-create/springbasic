package hello.springbasic.discount;

import hello.springbasic.member.Member;

public interface DiscountPolicy {

    int discount(Member member, int money);
}
