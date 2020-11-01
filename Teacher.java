package test;

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
    public Teacher(int id,String teacherName,String sex){
        this.id = id;
        this.teacherName = teacherName;
        this.sex = sex;
        //this.course = course;
        cours = new Course[3];
    }
    //修改或是添加属性
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    
    public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getTeacherName() {
        return teacherName;
    }
    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public boolean addCourse(Course course){
        boolean flag=false;
        if(!isSelectedCourse(course)&&isNullCourse(course)){
            for(int i=0;i<this.cours.length;i++){
                if(cours[i]==null){
                    cours[i]=course;
                    course.addTeacher(this);
                    flag=true;
                    break;
                }
            }
        }
        return flag;
    }
    public void displayCourse(){
        System.out.println("教师"+this.id+this.teacherName+this.sex+" 所教课程：");
        for(Course c:cours){
            if(c!=null){
                System.out.print(c.getName()+" ");
            }
        }
        System.out.println();
    }
    
    public boolean isSelectedCourse(Course course){
        boolean flag=false;
        for(Course c:cours){
            if(c==course){
                flag=true;
                break;
            }
        }
        return flag;
    }
    
    public boolean isNullCourse(Course course){
        boolean flag=false;
        for(Course c:cours){
            if(c==null){
                flag=true;
                break;
            }
        }
        return flag;
    }

}
