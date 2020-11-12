# Java2
实验三
计G202--2020322101谭唯佳
# 阅读程序
## 实验目的：
```
+ 初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
+ 掌握面向对象的类设计方法（属性、方法）；
+ 掌握类的继承用法，通过构造方法实例化对象；
+ 学会使用super()，用于实例化子类；
+ 掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
```
## 实验要求：
```
1.编写上述实体类以及测试主类（注意类之间继承关系的适用）；
2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）；
模拟学生退课操作，再打印课程信息。
```
## 实验过程：
```
+ 首先创建Person类，包含编号、姓名、性别三个属性；
+ 然后创建Teacher类，包含编号、姓名、性别和所教课程，其中Teacher类作为Person类的子类继承了编号、姓名和性别三个属性，添加对象；
+ 再创建Student类，包含学号、姓名、专业、性别和所选课程，而Student类也作为Person类的子类继承了编号、姓名和性别三个属性，添加对象；
+ 再创建Course类，包含编号、课程名称和授课教师，添加对象；
+ 最后再创建SelectCourse类，通过toString()方法完成对象的输出。
```
## 流程图：
![images](https://github.com/tan-weijia/Java2/blob/main/images/liuchengtu.png)
## 核心代码：
1.
```
public class Teacher extends Person{
	private int id;
    private String teacherName;
    private String sex;
    private String course;
    private Course[] cours;
//构造函数
    public Teacher() {
        super();
        cours= new Course[3];
    }
```
2.
```
//学生选课；
    public boolean addCourse(Course course){
        boolean flag=false;
        if(!isSelectedCourse(course)&&isNullCourse(course)){
            for(int i=0;i<this.courses.length;i++){
                if(courses[i]==null){
                    courses[i]=course;
                    course.addStudent(this);//课程也要添加学生
                    flag=true;
                    break;
                }
            }
        }
        return flag;
    }
    //学生移除课程
    public boolean removeCourse(Course course){
        boolean flag=false;
        if(isSelectedCourse(course)){
            for(int i=0;i<this.courses.length;i++){
                if(courses[i]==course){
                    courses[i]=null;
                    course.removeStudent(this);//在课程中移除学生
                    flag=true;
                    break;
                }
            }

        }
        return flag;
    }
```
3.
```
//子方法1：学生是否选过这门课
    public boolean isSelectedStudent(Student stu){
        boolean flag=false;
        for(Student s:students){//只能用于检查，不能修改
            if(s==stu){
                flag=true;
                break;
            }
        }
        return flag;
    }
```
4.
```
//子方法2：学科学生未达到限定人数吗
    public boolean isNullStudent(Student stu){
        boolean flag=false;
        for(Student s:students){
            if(s==null){//还有空位
                flag=true;
                break;
            }
        }
        return flag;
    }
```
5.
```
public static void main(String[] args) {
		
	    Course course = new Course();
	    
		System.out.println(course.toString());
		Student stu0 = new Student(20200201,"张三","计算机","男");
        Student stu1 = new Student(20200202,"李四","计算机","男");
        Student stu2 = new Student(20200203,"李明","计算机","男");
        Student stu3 = new Student(20200204,"珍妮","计算机","女");
        Teacher tea0 = new Teacher(001,"张老师","性别：女");
        Teacher tea1 = new Teacher(002,"孙老师","性别：男");
        Teacher tea2 = new Teacher(002,"李老师","性别：女");
        Course cour0 = new Course(01,"Java");
        Course cour1 = new Course(02,"计算机网络教程");
        Course cour2 = new Course(03,"高等数学");
	stu0.addCourse(cour0);
	tea2.addCourse(cour0);
        stu1.removeCourse(cour0);
	stu0.displayCourse();
	tea2.displayCourse();
        cour0.removeStudent(stu1);
        cour1.displayStudent();
```
## 实验结果：

![images](https://github.com/tan-weijia/Java2/blob/main/images/yunxingjieguo.png)

## 实验感想：
```
在本次实验中，我学习到了类的继承用法，学会使用super()，来实例化子类，还有使用toString（）方法,输出对象信息。
但在程序编写上仍存在很多困难，希望老师可以多讲解一些程序编写的问题。
```


