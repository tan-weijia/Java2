package test;

public class Student extends Person{
	private String stuName;
    private int stuId;
    private String major;
    private String sex;
    private Course[] courses;
    //���캯��
    public Student() {
        super();
        courses = new Course[3];
    }
    public Student(int stuId,String stuName) {
        super();
        this.stuId=stuId;
        this.stuName=stuName;
        courses = new Course[3];
    }
    public Student(int stuId,String stuName,String major,String sex) {
        super();
        this.stuId = stuId;
        this.stuName = stuName;
        this.major = major;
        this.sex = sex;
        courses = new Course[3];
    }
    //�޸Ļ�ȡ����name,id,major
    public String getStuName() {
        return stuName;
    }

    public void setStuName(String stuName) {
        this.stuName = stuName;
    }
    public int getStuId() {
        return stuId;
    }
    public void setStuId(int stuId) {
        this.stuId = stuId;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    
    public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	//ѧ��ѡ�Σ�
    public boolean addCourse(Course course){
        boolean flag=false;
        if(!isSelectedCourse(course)&&isNullCourse(course)){
            for(int i=0;i<this.courses.length;i++){
                if(courses[i]==null){
                    courses[i]=course;
                    course.addStudent(this);//�γ�ҲҪ���ѧ��
                    flag=true;
                    break;
                }
            }
        }
        return flag;
    }
    //ѧ���Ƴ��γ�
    public boolean removeCourse(Course course){
        boolean flag=false;
        if(isSelectedCourse(course)){
            for(int i=0;i<this.courses.length;i++){
                if(courses[i]==course){
                    courses[i]=null;
                    course.removeStudent(this);//�ڿγ����Ƴ�ѧ��
                    flag=true;
                    break;
                }
            }

        }
        return flag;
    }
    //��ʾѧ����ѡ�Ŀγ�
    public void displayCourse(){
        System.out.println("ѧ��"+this.stuId+this.sex+this.stuName+"��ѡ�γ̣�");
        for(Course c:courses){
            if(c!=null){
                System.out.print(c.getName()+" ");
            }
        }
        System.out.println();
    }
   
    //�ӷ���1�����Ƿ�ѡ��
    public boolean isSelectedCourse(Course course){
        boolean flag=false;
        for(Course c:courses){
            if(c==course){
                flag=true;
                break;
            }
        }
        return flag;
    }
    //�ӷ���2��ѧ���Ƿ���ѡ�޿�λ��
    public boolean isNullCourse(Course course){
        boolean flag=false;
        for(Course c:courses){
            if(c==null){
                flag=true;
                break;
            }
        }
        return flag;
    }

}
