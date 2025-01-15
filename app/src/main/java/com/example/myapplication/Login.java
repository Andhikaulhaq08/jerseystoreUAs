package com.example.myapplication;
import com.google.gson.annotations.SerializedName;


public class Login {
    @SerializedName("success")
    private boolean success;

    @SerializedName("message")
    private String message;

    public boolean isSuccess() {
        return success;
    }

    public String getMessage() {
        return message;
    }
}
