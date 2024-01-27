//package de.telran.firstprojectspring2;
//
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.http.HttpMethod;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.security.provisioning.InMemoryUserDetailsManager;
//import org.springframework.security.web.SecurityFilterChain;
//
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfiguration {
//
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//
//        http
//                .csrf(csrf -> csrf.disable())
//                .cors(cors -> cors.disable())
//                .authorizeHttpRequests((request) -> {
//                    request.requestMatchers(HttpMethod.GET, "show").hasRole("ADMIN");
//                    request.anyRequest().permitAll();
//        })
//                .formLogin(formLogin ->formLogin.disable())
//                .httpBasic(httpBasic -> httpBasic.init(http));
//
//        return http.build();
//    }
//
//    @Bean
//    public UserDetailsService userDetailsService() {SecurityAccountRepository securityAccountRepository){
//    UserDetailsService userDetailsService = (username -> {
//        securityAccountRepository.findByLogin(username);
//        if (securityAccount != null) {
//            return securityAccount;
//            }
//        else {
//            throw new UsernameNotFoundException("EROR");
//        }
//    };
//    return 0;
//    })
//    }
//
////    @Bean
////    public UserDetailsService userDetailsService() {
////        //         UserDetails userDetails =
//////                 User.builder()
//////                         .username("Hanna")
//////                         .password("Hanna")
//////                         .roles("ADMIN")
//////                         .build();
////
////        return new InMemoryUserDetailsManager(userDetails);
////    }
//
//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return NoOpPasswordEncoder.getInstance();
//    }
//
//}
