package com.loginradius.androidsdk.response.login;

/**
 * Created by loginradius on 7/30/2016.
 */
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class LoginData{

    @SerializedName("Profile")
    @Expose
    private Profile profile;
    @SerializedName("access_token")
    @Expose
    private String accessToken;
    @SerializedName("refresh_token")
    @Expose
    private String refreshToken;
    @SerializedName("expires_in")
    @Expose
    private String expiresIn;

    @SerializedName("IsPosted")
    @Expose
    private Boolean isPosted;

    @SerializedName("session_token")
    @Expose
    private String sessionToken;

    @SerializedName("session_expires_in")
    @Expose
    private String sessionExpiresIn;

    /**
     *
     * @return
     * The profile
     */
    public Profile getProfile() {
        return profile;
    }

    /**
     *
     * @param profile
     * The Profile
     */
    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    /**
     *
     * @return
     * The accessToken
     */
    public String getAccessToken() {
        return accessToken;
    }

    /**
     *
     * @param accessToken
     * The access_token
     */
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    /**
     *
     * @return
     * The refreshToken
     */
    public String getRefreshToken(){return refreshToken; }
    /**
     *
     *
     */
    public void setRefreshToken(String refreshToken){this.refreshToken=refreshToken;}

    /**
     *
     * @return
     * The expiresIn
     */
    public String getExpiresIn() {
        return expiresIn;
    }

    /**
     *
     * @param expiresIn
     * The expires_in
     */
    public void setExpiresIn(String expiresIn) {
        this.expiresIn = expiresIn;
    }



    public Boolean getIsPosted() {
        return isPosted;
    }

    /**
     *
     * @param isPosted
     * The isPosted
     */
    public void setIsPosted(Boolean isPosted) {
        this.isPosted = isPosted;
    }


    public String getSessionToken() {
        return sessionToken;
    }

    public void setSessionToken(String session_token) {
        this.sessionToken = sessionToken;
    }

    public String getSessionExpiresIn() {
        return sessionExpiresIn;
    }

    public void setSessionExpiresIn(String sessionExpiresIn) {
        this.sessionExpiresIn = sessionExpiresIn;
    }

}