package csc207.todo_list;
//This class handle events logic of add/del tasks, mark as done,
// save and load possibly more method, don't forget add instance needed.

import java.awt.event.KeyEvent;

public class TodoListController{
    public void keyPressed(KeyEvent evt) {
        if (evt.getKeyCode() == KeyEvent.VK_DELETE || evt.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
            deleteItem(textList);
        } else if (evt.getKeyCode() == KeyEvent.VK_SPACE) {
            toggleDone(textList);
        }
    }

}
