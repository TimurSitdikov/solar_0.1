package com.ts.aurora.services;


import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ts.aurora.DAO.AccountDAO;
import com.ts.aurora.model.UsertRole;
import com.ts.aurora.model.UserStatus;
import com.ts.aurora.model.User;

@Service("userDetailsService")
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private AccountDAO accountDAO;

	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = accountDAO.getByUserName(username);

		if (user != null) {
			String password = user.getPassword();
			boolean enabled = user.getAccountStatus().equals(UserStatus.ACTIVE);
			boolean accountNonExpired = user.getAccountStatus().equals(UserStatus.ACTIVE);
			boolean credentialsNonExpired = user.getAccountStatus().equals(UserStatus.ACTIVE);
			boolean accountNonLocked = user.getAccountStatus().equals(UserStatus.ACTIVE);

			Collection<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
			for (UsertRole accountRole : user.getAccountRoles()) {
				authorities.add(new SimpleGrantedAuthority(accountRole.getRoleName()));
			}

			org.springframework.security.core.userdetails.User securityUser = new org.springframework.security.core.userdetails.User(
					username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked,
					authorities);
			return securityUser;
		} else {
			throw new UsernameNotFoundException("User with such username hasn't been found.");
		}
	}

}
