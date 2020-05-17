package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class StudentManager_gui extends JFrame {
    private JTextField nameField;
    private JTextField genderField;
    private JTextField ageField;
    private JTextField idField;
    private JTable table;
    private DefaultTableModel model;
    private String[] columns = { "姓名", "性别", "年龄", "学号"};
    private List data;
    private Student_gui tmp;
    // 姓名，性别，年龄，学号，班级，系别
    public StudentManager_gui() {
        data= new ArrayList();
        getContentPane().setLayout(null);
        JLabel lblName = new JLabel("姓名");
        lblName.setBounds(12, 10, 50, 13);
        getContentPane().add(lblName);
        nameField = new JTextField();
        nameField.setBounds(74, 7, 96, 19);
        getContentPane().add(nameField);
        nameField.setColumns(10);
        JLabel lblSex = new JLabel("性别");
        lblSex.setBounds(182, 10, 50, 13);
        getContentPane().add(lblSex);
        genderField = new JTextField();
        genderField.setBounds(244, 7, 96, 19);
        getContentPane().add(genderField);
        genderField.setColumns(10);
        JLabel lblAge = new JLabel("出生日期");
        lblAge.setBounds(352, 10, 70, 13);
        getContentPane().add(lblAge);
        ageField = new JTextField();
        ageField.setBounds(424, 7, 96, 19);
        getContentPane().add(ageField);
        ageField.setColumns(10);
        JLabel lblStuno = new JLabel("学号");
        lblStuno.setBounds(12, 36, 50, 13);
        getContentPane().add(lblStuno);
        idField = new JTextField();
        idField.setColumns(10);
        idField.setBounds(74, 33, 96, 19);
        getContentPane().add(idField);

        JButton btnAdd = new JButton("插入");
        btnAdd.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                add();
            }
        });
        btnAdd.setBounds(10, 59, 70, 21);
        getContentPane().add(btnAdd);
        JButton btnDel = new JButton("删除");
        btnDel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                del();
            }
        });
        btnDel.setBounds(100, 59, 70, 21);
        getContentPane().add(btnDel);
        JButton btnUpdate = new JButton("修改");
        btnUpdate.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                update();
            }
        });
        btnUpdate.setBounds(190, 59, 70, 21);
        getContentPane().add(btnUpdate);
        JButton btnFind = new JButton("查找");
        btnFind.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                find();
            }
        });
        btnFind.setBounds(280, 59, 70, 21);
        getContentPane().add(btnFind);
        JButton btnExit = new JButton("退出");
        btnExit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
        btnExit.setBounds(370, 59, 70, 21);
        getContentPane().add(btnExit);
        model = new DefaultTableModel(columns, 0);
        table = new JTable(model);
        table.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                int row = table.getSelectedRow();
<<<<<<< HEAD
                nameField.setText((String) table.getValueAt(row, 0));
                genderField.setText((String) table.getValueAt(row, 1));
                ageField.setText((String) table.getValueAt(row, 2));
                idField.setText((String) table.getValueAt(row, 3));

=======
//                6.3是否对有异常抛出的方法都执行了try...catch保护？
//                nameField.setText((String) table.getValueAt(row, 0));
//                genderField.setText((String) table.getValueAt(row, 1));
//                ageField.setText((String) table.getValueAt(row, 2));
//                idField.setText((String) table.getValueAt(row, 3));
                try {
                    nameField.setText((String) table.getValueAt(row, 0));
                    genderField.setText((String) table.getValueAt(row, 1));
                    ageField.setText((String) table.getValueAt(row, 2));
                    idField.setText((String) table.getValueAt(row, 3));
                }catch (Exception e1){
                    System.out.println("出现异常了...");
                    e1.printStackTrace();
                }
>>>>>>> first correct
                tmp = getInput();
            }
        });
        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(12, 90, 571, 248);
        getContentPane().add(scrollPane);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setSize(601, 380);
        setResizable(false);
        setVisible(true);
    }
    private Student_gui getInput() {
        Student_gui stu = new Student_gui();
        stu.name = nameField.getText();
        stu.gender = Boolean.parseBoolean(genderField.getText());
        stu.age = ageField.getText();
<<<<<<< HEAD
        stu.ID = Integer.parseInt(idField.getText());
=======
//        6.3是否对有异常抛出的方法都执行了try...catch保护？
//        stu.ID = Integer.parseInt(idField.getText());
        try{
            stu.ID = Integer.parseInt(idField.getText());
        }catch(Exception e2){
            System.out.println("出现异常了...");
            e2.printStackTrace();
        }
>>>>>>> first correct
//        stu.setName(nameField.getText());
//        stu.setID(Integer.parseInt(idField.getText()));
//        stu.setBirDate(ageField.getText());
//        stu.setGender(Boolean.valueOf(genderField.getText()));
        return stu;
    }
    private void add() {
        data.add(getInput());
        showTable();
    }
    private void del() {
        for (int i = 0; i < data.size(); i++) {
            if (tmp.equals(data.get(i))) {
                data.remove(i);
                break;
            }
        }
        showTable();
    }
    private void update() {
        Student_gui stu = getInput();
        for (int i = 0; i < data.size(); i++) {
            if (tmp.equals(data.get(i))) {
                data.remove(i);
                data.add(i, stu);
                break;
            }
        }
        showTable();
    }
    private void find() {
        removeRows();
        Student_gui stu = getInput();
        for (int i = 0; i < data.size(); i++) {
            Student_gui tmp = (Student_gui) data.get(i);
            if (tmp.equals(stu)) {
                model.addRow(tmp.toArray());
                break;
            }
        }
    }
    private void showTable() {
        removeRows();
        for (int i = 0; i < data.size(); i++) {
            Student_gui stu = (Student_gui) data.get(i);
            model.addRow(stu.toArray());
        }
    }
    private void removeRows() {
        while (model.getRowCount() > 0) {
            model.removeRow(0);
        }
    }
    public static void main(String[] args) {
        new StudentManager_gui();
    }
}
