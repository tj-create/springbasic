package hello.springbasic.scan;

import hello.springbasic.AutoAppConfig;
import hello.springbasic.member.Grade;
import hello.springbasic.member.Member;
import hello.springbasic.member.MemberService;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AutoConfigTest {

    @Test
    void basicScan() {
        ApplicationContext ac = new AnnotationConfigApplicationContext(AutoAppConfig.class);
        MemberService memberService = ac.getBean(MemberService.class);

        Assertions.assertThat(memberService).isInstanceOf(MemberService.class);
    }
}
