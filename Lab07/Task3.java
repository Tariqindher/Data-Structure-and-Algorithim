class Student{
       String name;
       String cmsid;
       double gpa;
       Student(String name,String cmsid,double gpa){
              this.name=name;
              this.cmsid=cmsid;
              this.gpa=gpa;
       }
       void print(){
              System.out.println("Name :"+name+"  CMS ID :"+cmsid+"  GPA  :"+gpa);
       }
}
public class Task3{
       public static void main(String[] args) {
              Student []student=new Student[3];
              student[0]=new Student("Tariq","23-023-0127",3.8);
              student[1]=new Student("Asad","23-023-0128",3.9);
              student[2]=new Student("GMM","23-023-0129",4.0);
              for(int i=0; i<student.length; i++){
                     student[i].print();
              }
              TopperOrder(student);
              System.out.println("In Topper Order");
              for(int i=0; i<student.length; i++){
                     student[i].print();
              }
              
       }
       public static void TopperOrder(Student student[]){
              for (int i=0; i<student.length-1; i++){
                     for(int j=0;j<student.length-i-1; j++){
                            if(student[j].gpa<student[j+1].gpa){
                                   Student temp=student[j];
                                   student[j]=student[j+1];
                                   student[j+1]=temp;
                            }
                     }
              }
                     
              
       }
}