class Student{
    int srl;
    String name;
    int marks;
}




public class Demo {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.srl = 1;
        s1.name = "Amitanshu";
        s1.marks = 99;

        Student s2 = new Student();
        s2.srl = 2;
        s2.name = "Amit";
        s2.marks = 94;

        Student s3 = new Student();
        s3.srl = 3;
        s3.name = "Anshu";
        s3.marks = 92;


        // creating array of students which will hold student references.
        Student students[] = new Student[3];
        students[0] = s1;
        students[1] = s2;
        students[2] = s3;

        // we created array objects and then assigned to the array 
        // we cant individually print like s1 or s2 . we can only print them with their properties .

        // for(int i=0;i<3;i++){
        //     System.out.println(students[i].srl +" : " + students[i].name + " : " + students[i].marks);
        // }

        // use of for each loop is restricted with array and array-like data .
        
        for(Student n : students){
            System.out.println(n.srl +" : " + n.name + " : " + n.marks);
        } 
    }
    
}
