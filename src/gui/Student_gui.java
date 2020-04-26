package gui;

import java.io.Serializable;

class Student_gui implements Serializable {
    public String name;
    public boolean gender;
    public String age;
    public int ID;

    public boolean equals(Object obj) {
        return equals((Student_gui) obj);
    }
    public boolean equals(Student_gui obj) {
        boolean isName = true;
        if (obj.name != null && !"".equals(obj.name)) {
            isName = name.equals(obj.name);
        }
        boolean isSex = true;

        boolean isAge = true;
        if (obj.age != null && !"".equals(obj.age)) {
            isAge = age.equals(obj.age);
        }
        boolean isStuno = true;
        if (obj.ID != 0 && !"".equals(obj.ID)) {
            isStuno = ID==obj.ID;
        }

        return isName && isSex && isAge && isStuno ;
    }
    public String[] toArray() {
        return new String[] { name, String.valueOf(gender), age, String.valueOf(ID)};
    }
}