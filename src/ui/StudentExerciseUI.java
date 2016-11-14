/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import course.Exercise;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.Socket;
import javax.swing.JFileChooser;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author morteza
 */
public class StudentExerciseUI extends CourseObjUI implements ActionListener {

    private JFileChooser fc;
    private myLabel name;
    private myLabel description;
    private myLabel date;
    private myTextField path;
    private myButton browse;
    private myButton send;
    private Exercise exercise;
    private FileInputStream in;
    private Socket s;
    private DataOutputStream dout;
    private DataInputStream din;
    private int i;

    public StudentExerciseUI(String name, Exercise exercise) {
        super(name);
        this.exercise = exercise;
        try {
            s = new Socket("localhost", 10);
            dout = new DataOutputStream(s.getOutputStream());
            din = new DataInputStream(s.getInputStream());
            send();
        } catch (Exception e) {
        }
    }

    public void copy() throws IOException {
        File f1 = fc.getSelectedFile();
        path.setText(f1.getAbsolutePath());
        in = new FileInputStream(f1.getAbsolutePath());
        while ((i = in.read()) != -1) {
            System.out.print(i);
        }
    }

    public void send() throws IOException {
        dout.write(i);
        dout.flush();

    }

    public void setElement() {
        name = new myLabel();
        description = new myLabel();
        date = new myLabel();
        path = new myTextField();
        browse = new myButton();
        send = new myButton();

        name.setText(exercise.getName());
        name.setSize(350, 35);
        name.setLocation((int) (width / 2.5) - 15, (int) height / 5);
        name.setBorder(new LineBorder(Color.gray));

        description.setText(exercise.getDescription());
        description.setLocation((int) (width / 2.5) - 15, (int) (height / 3.5));
        description.setSize(350, 105);
        description.setBorder(new LineBorder(Color.gray));

        date.setText(exercise.getDate().toString());
        date.setLocation((int) (width / 2.5) - 15, (int) (height / 2.2));
        date.setSize(350, 35);
        date.setBorder(new LineBorder(Color.gray));

        path.setSize(350, 35);
        path.setLocation((int) (width / 2.5) - 15, (int) (height / 1.9));

        browse.setText("browse");
        browse.setLocation((int) (width / 2.5) - 15, (int) (height / 1.7));
        browse.setSize(350, 35);
        browse.addActionListener(this);

        send.setText("send");
        send.setLocation((int) (width / 2.5) - 15, (int) (height / 1.6));
        send.setSize(350, 35);
        send.addActionListener(this);
        add(name);
        add(description);
        add(date);
        add(path);
        add(browse);
        add(send);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            if (e.getSource() == browse) {
                int x = fc.showOpenDialog(null);
                if (x == JFileChooser.APPROVE_OPTION) {
                    copy();
                }
            }
            if (e.getSource() == send) {
                send();
            }
        } catch (Exception ex) {
        }
    }
}
