package org.jenkinsci.plugins;

import java.util.concurrent.TimeUnit;
import org.keycloak.representations.AccessTokenResponse;

public class SystemTokenInfo {
	private AccessTokenResponse accessToken;
	private long tokenExpirationTime = 0;
	private long refreshTokenExpirationTime = 0;

	public SystemTokenInfo(AccessTokenResponse accessToken) {
		setAccessToken( accessToken );
	}

	public AccessTokenResponse getAccessToken() {
		return accessToken;
	}

	public void setAccessToken( AccessTokenResponse accessToken ) {
		this.accessToken = accessToken;
		//include 500ms buffer
		this.tokenExpirationTime =
			System.currentTimeMillis() + TimeUnit.SECONDS.toMillis( accessToken.getExpiresIn() ) - 500;
		this.refreshTokenExpirationTime = System.currentTimeMillis() + TimeUnit.SECONDS.toMillis( accessToken.getRefreshExpiresIn() ) - 500;
	}

	public long getTokenExpirationTime() {
		return tokenExpirationTime;
	}

	public long getRefreshTokenExpirationTime() {
		return refreshTokenExpirationTime;
	}
}
