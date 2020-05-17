import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

//退出功能：退出整个程序。
//菜单选项：程序不断显示如下“菜单”选项，等待用户输入选项（1~5），之后执行相应功能；
//该类还要有一个App方法，负责程序的整个控制流程（首先输出选择菜单，等待用户输入选项；然后根据选项执行相应操作）
public class StudentManager {
    static int index = 0;//用来排序，修饰词需要为static，否则出错
    static Student[] studentArr=new Student[21];

    public static void app() {
<<<<<<< HEAD
=======
        //3.4代码段落是否被合适地以空行分隔？此处应该有空行
>>>>>>> first correct
        System.out.println("请选择操作：");
        System.out.println("***********************************");
        System.out.println("*                           1  插入                                  *");
        System.out.println("*                           2  查找                                  *");
        System.out.println("*                           3  删除                                  *");
        System.out.println("*                           4  修改                                  *");
        System.out.println("*                           5  输出                                  *");
        System.out.println("*                           6  退出                                  *");
<<<<<<< HEAD
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();

=======
        //3.4代码段落是否被合适地以空行分隔？此处应该有空行
        Scanner scanner = new Scanner(System.in);
        int option = scanner.nextInt();
>>>>>>> first correct
        Comparator<Student> comp = new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                if (s1.getID() > s2.getID()) {
                    return 1;
                } else if (s1.getID() < s2.getID()) {
                    return -1;
                }
<<<<<<< HEAD
                return 0;
=======
                //5.13是否每个if-else if-else语句都有最后一个else以确保处理了全集？
                //return 0;
                else {
                    return 0;
                }
>>>>>>> first correct
            }
        };
        switch (option) {
            case 1: {//添加
                if (index > studentArr.length - 1) {
                    System.out.println("人员已满");
                    break;

                }
                Student student = new Student();
                System.out.println("请输入学号,点击Enter键");
                int id = Integer.parseInt(scanner.next());
                student.setID(id);
                System.out.println("请输入名字,点击Enter键");
                String name = scanner.next();
                student.setName(name);
                System.out.println("请以YYYY-MM-DD格式输入出生日期,点击Enter键");
                String birDate = scanner.next();
                student.setBirDate(birDate);
                System.out.println("请输入性别,点击Enter键");
<<<<<<< HEAD
                boolean gender = Boolean.parseBoolean(scanner.next());
                student.setGender(gender);

                if (index != 0) {
                    for (int i=0;i<index;i++) {
                        if (id == studentArr[i].getID()) {
                            System.out.println("学号重复,请检查所输入学号是否有错误");
=======
//                6.3是否对有异常抛出的方法都执行了try...catch保护？
//                boolean gender = Boolean.parseBoolean(scanner.next());
//                student.setGender(gender);
                try{
                    boolean gender = Boolean.parseBoolean(scanner.next());
                    student.setGender(gender);
                }catch (Exception e){
                    System.out.println("出现异常了...");
                    e.printStackTrace();
                }

                if (index != 0) {
//                    3.5是否合理地使用了空格使程序更清晰？
//                    for (int i=0;i<index;i++) {
                    for (int i = 0;i < index ; i++) {
                        if (id == studentArr[i].getID()) {
                            System.out.println("学号重复,请检查所输入学号是否有错误");
//                            7.3是否每个return前都要有日志记录?
//                            添加的学号重复报错，直接返回程序
>>>>>>> first correct
                            return;
                        }

                    }
                }
                studentArr[index] = student;
                index = index + 1;
<<<<<<< HEAD
                if (studentArr.length>0) Arrays.sort(studentArr,0,index);
=======
                //3.5是否合理地使用了空格使程序更清晰？
                //4.2是否给单个的循环、条件语句也加了{}？
//                if (studentArr.length>0) Arrays.sort(studentArr,0,index);
                if (studentArr.length > 0) {
                    Arrays.sort(studentArr,0,index);
                }
>>>>>>> first correct
                System.out.println("添加成功");
            }
            break;
            case 2:{//查找
                boolean flag=false;
                System.out.println("请输入姓名,点击Enter键");
                String name = scanner.next();
                for(Student student : studentArr) {
                    if(student==null) {
                        System.out.println("查询完毕");
                        break;
                    }
                    else if(student.getName().equals(name)) {
                        System.out.println("学号"+"|"+student.getID());
                        System.out.println("姓名"+"|"+student.getName());
                        System.out.println("出生日期"+"|"+student.getBirDate());
<<<<<<< HEAD
                        if(student.getGender()) System.out.println("性别"+"|"+"男");
                        else System.out.println("性别"+"|"+"女");
                        flag=true;
                        break;
                    }
                }
                if(!flag) {
                    System.out.println("未该学生信息");
=======
//                        4.2是否给单个的循环、条件语句也加了{}？
//                        if(student.getGender()) System.out.println("性别"+"|"+"男");
//                        else System.out.println("性别"+"|"+"女");
//                        2.2复杂的分支流程是否已经被注释？输入性别>0，为男
                        if(student.getGender()) {
                            System.out.println("性别"+"|"+"男");
                        }
                        //否则，为女
                        else {
                            System.out.println("性别"+"|"+"女");
                        }
                        flag=true;
                        break;
                    }
//                    5.13是否每个if-else if-else语句都有最后一个else以确保处理了全集？
                    else {
                        //学生名字不符合查询规范直接返回
                        return;
                    }
                }
                if(!flag) {
                    System.out.println("无该学生信息");
//                    7.3是否每个return前都要有日志记录?
>>>>>>> first correct
                    return;
                }
            }
            break;
            case 3: {//删除
                System.out.println("请输入姓名,，点击Enter键");
                String name = scanner.next();
                boolean flag = false;
                int i = 0;
                for (i = 0; i < studentArr.length; i++) {
<<<<<<< HEAD
                    if (studentArr[i] == null) {
                        break;
                    }
                    if (name.equals(studentArr[i].getName())) {
                        flag = true;
                        break;
                    }
=======
//                    5.13是否每个if-else if-else语句都有最后一个else以确保处理了全集？
                    if (studentArr[i] == null) {
                        break;
                    }
//                    if (name.equals(studentArr[i].getName())) {
//                        flag = true;
//                        break;
//                    }
                   else if (name.equals(studentArr[i].getName())) {
                        flag = true;
                        break;
                    }
                   else {
                       return;
                    }
>>>>>>> first correct
                }
                if (!flag) {
                    System.out.println("没有找到姓名为" + name + "的学生");
                    return;
                }

//                删除
                for (int j = i; j < studentArr.length; j++) {
                    if (j == studentArr.length - 1) {
                        studentArr[j] = null;
                        break;
                    }
                    studentArr[j] = studentArr[j + 1];
                    if (studentArr[j + 1] == null) {
                        break;
                    }
                }
                System.out.println("删除成功");
                index--;
            }
            break;
            case 4: {//修改
            boolean flag = false;
            System.out.println("请输入姓名,，点击Enter键");
            String name = scanner.next();
            for (Student student : studentArr) {
                if (student == null) {
                    break;
                }
                if (student.getName().equals(name)) {
                    System.out.println("请输入学号,点击Enter键");
                    int id= Integer.parseInt(scanner.next());
                    student.setID(id);
                    System.out.println("请输入名字,点击Enter键");
                    String name_new = scanner.next();
                    student.setName(name_new);
                    System.out.println("请以YYYY-MM-DD格式输入出生日期,点击Enter键");
                    String birDate = scanner.next();
                    student.setBirDate(birDate);
                    System.out.println("请输入性别,点击Enter键");
<<<<<<< HEAD
                    boolean gender = Boolean.parseBoolean(scanner.next());
                    student.setGender(gender);
=======
//                6.3是否对有异常抛出的方法都执行了try...catch保护？
//                    boolean gender = Boolean.parseBoolean(scanner.next());
//                    student.setGender(gender);
                    try{
                        boolean gender = Boolean.parseBoolean(scanner.next());
                        student.setGender(gender);
                    }catch (Exception e){
                        System.out.println("出现异常了...");
                        e.printStackTrace();
                    }

>>>>>>> first correct
                    flag = true;
                }
            }
            if (!flag) {
                System.out.println("没有找到姓名为" + name + "的学生");
                return;
            }
<<<<<<< HEAD
            if (studentArr.length>0) Arrays.sort(studentArr,0,index);
=======
            //3.5是否合理地使用了空格使程序更清晰？
            //4.2是否给单个的循环、条件语句也加了{}？
//          if (studentArr.length>0) Arrays.sort(studentArr,0,index);
            if (studentArr.length > 0) {
                Arrays.sort(studentArr,0,index);
            }
>>>>>>> first correct
            System.out.println("修改成功");
        }
            break;
            case 5: {//输出
                for (Student student : studentArr) {
                    if (student == null) {
                        break;
                    }
                    System.out.println("学号"+"|"+student.getID());
                    System.out.println("姓名"+"|"+student.getName());
                    System.out.println("出生日期"+"|"+student.getBirDate());
<<<<<<< HEAD
                    if(student.getGender()) System.out.println("性别"+"|"+"男");
                    else System.out.println("性别"+"|"+"女");
=======
                    //4.2是否给单个的循环、条件语句也加了{}？
//                    if(student.getGender()) System.out.println("性别"+"|"+"男");
//                    else System.out.println("性别"+"|"+"女");
                    if(student.getGender()) {
                        System.out.println("性别"+"|"+"男");
                    }
                    else {
                        System.out.println("性别"+"|"+"女");
                    }
>>>>>>> first correct
                }
            }
            break;
            case 6: {//退出
                System.exit(0);
            }
            break;
<<<<<<< HEAD

            default:
            System.out.println("系统没有找到"+option+"操作项!");
=======
            //4.2是否给单个的循环、条件语句也加了{}？
//            default:
//            System.out.println("系统没有找到"+option+"操作项!");
            default:{
                System.out.println("系统没有找到"+option+"操作项!");
            }
>>>>>>> first correct
            break;
        }

    }

}


