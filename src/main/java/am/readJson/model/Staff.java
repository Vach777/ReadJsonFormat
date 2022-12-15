package am.readJson.model;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

public class Staff {
    private String fileName;

    private List<User> member;

    public Staff(String fileName, List<User> member) {
        this.fileName = fileName;
        this.member = member;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public List<User> getMember() {
        return member;
    }

    public void setMember(List<User> member) {
        this.member = member;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return Objects.equals(fileName, staff.fileName) && Objects.equals(member, staff.member);
    }

    @Override
    public int hashCode() {
        return Objects.hash(fileName, member);
    }

    @Override
    public String toString() {
        return "Staff{" +
                "fileName='" + fileName + '\'' +
                ", member=" + member +
                '}';
    }
}
