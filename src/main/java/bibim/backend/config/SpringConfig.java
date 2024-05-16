package bibim.backend.config;

import bibim.backend.repository.MemberRepository;
import bibim.backend.repository.MemoryMemberRepository;
import bibim.backend.repository.PostRepository;
import bibim.backend.repository.MemoryPostRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {
    @Bean
    public MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    @Bean
    public PostRepository postRepository() {
        return new MemoryPostRepository();
    }
}

