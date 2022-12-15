package am.readJson;

import am.readJson.model.Staff;
import am.readJson.model.User;
import am.readJson.service.impl.StaffServiceImpl;

public class Main {
    public static void main(String[] args) {
        Staff staff = new StaffServiceImpl().getStaff();
        System.out.println("File name: " + staff.getFileName());
        for (User user : staff.getMember()) {
            System.out.println(user);
        }
    }

}
