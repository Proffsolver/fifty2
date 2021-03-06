package com.solga.fifty2.data.managers;

import android.content.SharedPreferences;

import com.solga.fifty2.utils.ConstantManager;
import com.solga.fifty2.utils.Fifty2App;

public class PreferenceManager {

    private SharedPreferences mSharedPreferences;

    public PreferenceManager() {
        this.mSharedPreferences = Fifty2App.getSharedPreferences();
    }

    public void saveUserProfileData() {
        SharedPreferences.Editor editor = mSharedPreferences.edit();

        //Данные для сохранения
        editor.apply();
    }

/*    public void loadUserProfileData() {
        //      Загрузка данных
        //    mSharedPreferences.getString(TAG_PREFIX);
    }

    public void saveAuthToken(String authToken) {
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(ConstantManager.AUTH_TOKEN_KEY, authToken);
        editor.apply();
    }

    public String getAuthToken() {
        return mSharedPreferences.getString(ConstantManager.AUTH_TOKEN_KEY, "null");
    }


    public void saveUserId(String userId) {
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(ConstantManager.USER_ID_KEY, userId);
        editor.apply();
    }

    public String getUserId() {
        return mSharedPreferences.getString(ConstantManager.USER_ID_KEY, "null");
    }


    public void saveUserEmail(String userId) {
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(ConstantManager.USER_ID_EMAIL, userId);
        editor.apply();
    }

    public String getUserEmail() {
        return mSharedPreferences.getString(ConstantManager.USER_ID_EMAIL, "null");
    }

    public void saveUserMobile(String userId) {
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(ConstantManager.USER_ID_PHONE, userId);
        editor.apply();
    }

    public String getUserMobile() {
        return mSharedPreferences.getString(ConstantManager.USER_ID_PHONE, "null");
    }

    public void saveCurrentDeviceIdType(String deviceIdType) {
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(ConstantManager.DEVICE_CURRENT_ID_TYPE, deviceIdType);
        editor.apply();
    }

    public String getCurrentDeviceIdType() {
        return mSharedPreferences.getString(ConstantManager.DEVICE_CURRENT_ID_TYPE, "null");
    }

    public void saveCurrentDeviceId(String deviceId) {
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(ConstantManager.DEVICE_CURRENT_ID, deviceId);
        editor.apply();
    }

    public String getCurrentDeviceId() {
        return mSharedPreferences.getString(ConstantManager.DEVICE_CURRENT_ID, "null");
    }

    public void saveUserCurrentActionWAccount(String action) {
        SharedPreferences.Editor editor = mSharedPreferences.edit();
        editor.putString(ConstantManager.USER_CURRENT_ACTION_W_ACCOUNT, action);
        editor.apply();
    }

    public String getUserCurrentActionWAccount() {
        return mSharedPreferences.getString(ConstantManager.USER_CURRENT_ACTION_W_ACCOUNT, "null");
    }*/
}
