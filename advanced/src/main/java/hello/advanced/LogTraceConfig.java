package hello.advanced;

import hello.advanced.trace.logtrace.LogTrace;
import hello.advanced.trace.logtrace.ThreadLocalLogTrace;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LogTraceConfig {

    @Bean
    //빈 스코프를 request로, LogTrace가 필요한 곳에 프록시 객체를 두도록 설정해도 동시성 문제 해결 가능
//    @Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public LogTrace logTrace() {
        return new ThreadLocalLogTrace();
    }
}
