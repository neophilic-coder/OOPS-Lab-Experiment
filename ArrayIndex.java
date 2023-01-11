class Student{
	String name;
	int r_no;
	Student(){
    this.name = name;
    this.r_no = r_no;
  }
  void display(){
    System.out.println("Name: "+this.name+" Roll Number: "+his.r_no);
  }
  public static void main(String args[]){
    Student[] std = new Student[10];
    try{
      std[10] = new Student();
    }
    catch(ArrayIndexOutOfBoundException e){
      System.out.println(e);
    }
  }
}
