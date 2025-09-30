package csc207.todo_list;

import org.json.JSONArray;
import org.json.JSONObject;

import javax.swing.*;
import java.io.FileWriter;
import java.io.IOException;

public class TodoList {
    List<todoItem> todoList;
    private void save() {
        JSONArray jsonArray = new JSONArray();

        for (int i = 0; i < textModel.size(); i++) {
            JSONObject jsonObject = new JSONObject();
            String item = textModel.getElementAt(i);
            jsonObject.put("task", item.replace(DONE, "").trim());
            jsonObject.put("completed", item.endsWith(DONE));
            jsonArray.put(jsonObject);
        }

        try {
            FileWriter fileWriter = new FileWriter(SAVEFILE_TODO_LIST_JSON);
            String json = jsonArray.toString();
            fileWriter.write(json);
            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void removeItem( todoItem s) {
        int selectedIndex = textList.getSelectedIndex();
        if (selectedIndex != -1) {
            textModel.remove(selectedIndex);
        }
    }

    public void addItem(todoItem s){};

    public void editItem(todoItem s){};

    public void categorize(){};

    public void filter(){};

    public void view(){};

    public void setReminder(int dates){};

    public sort(){};


}
