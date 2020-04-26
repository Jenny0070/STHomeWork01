//ID（int）、name(string)、birDate(string或者Java日期)、gender(bool)，分别表示学号、姓名、出生日期和性别
public class Student {
    private int ID;
    private String name;
    private String birDate;
    private Boolean gender;//1男0女

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirDate() {
        return birDate;
    }

    public void setBirDate(String birDate) {
        this.birDate = birDate;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student [" +
                "学  号=" + ID + ", " +
                "姓  名=" + name+", " +
                "出生日期=" + birDate + "," +
                "性别=" + gender + "]";
    }


    public String[] toArray() {
        return new String[] { name, String.valueOf(gender), birDate, String.valueOf(ID)};
    }
}
