package com.thcs.entity;

/**
 *
 * @author Admin
 */
public class NguoiDung {
    private boolean ChucVu;
    private String Username;
    private String Password;
   

    public NguoiDung() {
    }

    public NguoiDung(boolean ChucVu, String Username, String Password) {
        this.ChucVu = ChucVu;
        this.Username = Username;
        this.Password = Password;
    }

    public boolean getChucVu() {
        return ChucVu;
    }

    public void setChucVu(boolean ChucVu) {
        this.ChucVu = ChucVu;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    
    
    
}
