package co.jp.TestSpringBoot.security;

import co.jp.TestSpringBoot.mapper.UsersMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CusutomUserDetailService implements UserDetailsService {

    private final UsersMapper userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByUsername(username)
                .map(user -> new CusutomUserDetail(
                        user.getUsername(),
                        user.getPassword(),
                        Collections.emptyList()
                ))
                .orElseThrow(() -> new UsernameNotFoundException(
                        "Given username is not found. (username = '" + username + "')"
                ));
    }

//
//    private List<GrantedAuthority> toGrantedAuthorityList(User.Authority authority) {
//        return Collections.singletonList(new SimpleGrantedAuthority(authority.name()));
//    }


}
