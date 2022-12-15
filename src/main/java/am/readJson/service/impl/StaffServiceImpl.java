package am.readJson.service.impl;

import am.readJson.model.Staff;
import am.readJson.model.User;
import am.readJson.service.StaffService;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.LinkedList;
import java.util.List;

public class StaffServiceImpl implements StaffService {
    @Override
    public Staff getStaff(){
        JSONParser parser = new JSONParser();

        List<User> listUser = new LinkedList<>();

        try(FileReader reader = new FileReader("Staff.Json")){
            JSONObject jsonObject = (JSONObject) parser.parse(reader);

            String fileName = (String) jsonObject.get("fileName");
            JSONArray userList = (JSONArray) jsonObject.get("users");

            for (Object user : userList) {
                JSONObject jsonUser = (JSONObject) user;

                String name = (String) jsonUser.get("name");
               long age = (long) jsonUser.get("age");
                boolean isActive = (boolean) jsonUser.get("isActive");

                listUser.add(new User(name, (int) age,isActive));
            }

            return new Staff(fileName,listUser);



        }catch (Exception exception) {
            System.err.println("EXCEPTION: " + exception.toString());
        }
        return null;
    }
}
