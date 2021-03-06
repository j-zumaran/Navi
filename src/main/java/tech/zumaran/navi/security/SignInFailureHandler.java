package tech.zumaran.navi.security;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class SignInFailureHandler implements AuthenticationFailureHandler {

	@Override
	public void onAuthenticationFailure(HttpServletRequest request, 
			HttpServletResponse response, AuthenticationException exception) throws IOException {
		
		log.warn(exception.getMessage());
		response.sendError(HttpServletResponse.SC_UNAUTHORIZED);
	}

}
