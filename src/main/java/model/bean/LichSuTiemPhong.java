package model.bean;

import java.sql.Date;

public class LichSuTiemPhong {
    private String MaKH;
    private String MaVacxin;
    private Integer STTMui;
    private Date NgayTiemPhong;
    private Date NgayHenTiepTheo;

    public String getMaKH() {
        return MaKH;
    }

    public void setMaKH(String maKH) {
        MaKH = maKH;
    }

    public String getMaVacxin() {
        return MaVacxin;
    }

    public void setMaVacxin(String maVacxin) {
        MaVacxin = maVacxin;
    }

    public Integer getSTTMui() {
        return STTMui;
    }

    public void setSTTMui(Integer STTMui) {
        this.STTMui = STTMui;
    }

    public Date getNgayTiemPhong() {
        return NgayTiemPhong;
    }

    public void setNgayTiemPhong(Date ngayTiemPhong) {
        NgayTiemPhong = ngayTiemPhong;
    }

    public Date getNgayHenTiepTheo() {
        return NgayHenTiepTheo;
    }

    public void setNgayHenTiepTheo(Date ngayHenTiepTheo) {
        NgayHenTiepTheo = ngayHenTiepTheo;
    }
}
