//package co.jp.TestSpringBoot.config;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//
//@Configuration
//public class userconfig {
//
//    @Bean
//    public UserDetailsService userDetailsService(PasswordEncoder passwordEncoder) {
//        UserDetails user = User.builder()
//                .username("user") // ユーザ名
//                .password(passwordEncoder.encode("password")) // パスワード
//                .roles("USER") // ロール
//                .build();
//
//        return new InMemoryUserDetailsManager(user);
//    }
//}