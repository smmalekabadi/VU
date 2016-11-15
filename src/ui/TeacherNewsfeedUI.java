/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;


import course.Course;
import course.Newsfeed;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JOptionPane;

/**
 *
 * @author morteza
 */
public class TeacherNewsfeedUI extends CourseObjUI {

    private myTextField name;
    private myTextField description;
    private myTextField date;
    private myButton save;
    private Newsfeed newsfeed;

    public TeacherNewsfeedUI(String name,Newsfeed newsfeed) {
        super(name,newsfeed);
        this.newsfeed=newsfeed;
        setElement();
    }

    public void setElement() {
        name = new myTextField();
        description = new myTextField();
      
        save = new myButton();

        name.setText(newsfeed.getName());
        name.setSize(350, 35);
        name.setLocation((int) (width / 2.5) - 15, (int) height / 5);

        description.setText(newsfeed.getDescription());
        description.setLocation((int) (width / 2.5) - 15, (int) (height / 3.5));
        description.setSize(350, 105);

      
        save.setText("Save");
        save.setSize(350, 35);
        save.setLocation((int) (width / 2.5) - 15, (int) (height / 1.8));
        save.setName("save");
        save.addMouseListener(new Controller());
        add(name);
        add(description);
        add(save);
    }
    private class Controller implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            if (e.getComponent().getName().equals("save")) {
                newsfeed.setName(name.getText());
                newsfeed.setDescription(description.getText());
                getCourseObj().getCourse().setOneCourseNewsfeed(newsfeed);
                JOptionPane.showMessageDialog(null,"newsfeed saved");
            }

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

    }
}
