package com.loginradius.androidsdk.response.register;

/**
 * Created by loginradius on 7/30/2016.
 */


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.loginradius.androidsdk.response.login.LoginData;

public class RegisterResponse {

    @SerializedName("IsPosted")
    @Expose
    private Boolean isPosted;
    @SerializedName("Data")
    @Expose
    private LoginData data;


    /**
     *
     * @return
     * The isPosted
     */
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

    /**
     *
     * @return
     * The data
     */
    public LoginData getData() {
        return data;
    }

    /**
     *
     * @param data
     * The data
     */
    public void setData(LoginData data) {
        this.data = data;
    }
}

