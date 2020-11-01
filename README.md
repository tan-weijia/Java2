# Java2
实验三
实验目的：
初步了解分析系统需求，从学生选课角度了解系统中的实体及其关系，学会定义类中的属性以及方法；
掌握面向对象的类设计方法（属性、方法）；
掌握类的继承用法，通过构造方法实例化对象；
学会使用super()，用于实例化子类；
掌握使用Object根类的toString（）方法,应用在相关对象的信息输出中。
实验要求：
1.编写上述实体类以及测试主类（注意类之间继承关系的适用）；
2.在测试主类中，实例化多个类实体，模拟学生选课操作、打印课程信息（信息包括：编号、课程名称、上课地点、时间、授课教师 等）；模拟学生退课操作，再打印课程信息。
实验过程：
首先创建Person类，包含编号、姓名、性别三个属性；然后创建Teacher、Student、Course类，包含编号、姓名、性别和所教课程，其中Teacher类作为Person类的子类继承了编号、姓名和性别三个属性；
再创建Student类，包含学号、姓名、专业、性别和所选课程，而Student类也作为Person类的子类继承了编号、姓名和性别三个属性；再创建Course类，包含编号、课程名称和授课教师；最后再创建SelectCourse类
，通过toString()方法完成对象的输出。
流程图：
核心代码：
实验结果：
实验感想：
