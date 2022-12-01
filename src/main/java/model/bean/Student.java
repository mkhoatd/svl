package model.bean;


public class Student {
    private Integer id;
    private String name;
    private Boolean gender;
    private String khoaName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getGender() {
        return gender;
    }
    public String getGenderString() {
        return gender ? "Nam" : "Nữ";
    }
    public void setGenderString(String genderString) {
        this.gender = genderString.equals("Nam");
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public String getKhoaName() {
        return khoaName;
    }

    public void setKhoaName(String khoaName) {
        this.khoaName = khoaName;
    }
}

