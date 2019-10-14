package eyJhbGciOiJIUzUxMiJ9.eyJzdWIiOiJ1c2VyNCIsImV4cCI6MTU3MTA4Mjg0MSwiaWF0IjoxNTcxMDY0ODQxfQ;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.globomatics.model.DAOUser;

public class SecuredUser extends DAOUser implements UserDetails {

	public SecuredUser(DAOUser user){

		this.setUsername(user.getUsername());
		this.setPassword(user.getPassword());
		this.setRole(user.getRole());
		}
	
	
	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		
		Collection<GrantedAuthority> authorities = new ArrayList<>();
		
		String userRole = super.getRole();
		if(userRole != null)
		{
		SimpleGrantedAuthority authority = new SimpleGrantedAuthority(userRole);
		authorities.add(authority);
		}
		return authorities;
	
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return true;
	}

	
}
