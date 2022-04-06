public class MyBrother {
//    private int age;
//    private String name;
//    public MyBrother(String name , int age){
//        this.name = name;
//        this.age = age;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public String getName() {
//        return name;
//    }
//
    public static void main(String[] args) {
//        MyBrother mb = new MyBrother("Pratham",11);
//        System.out.println(mb.name);
//        System.out.println(mb.age);

        b bobj= new b();
        bobj.name = "Prathamesh";
        bobj.displayName();

        a aobj = new a();
        aobj.name = "Shreya";
    }
}

class a{
    public String name ;
    public void displayName(){
        System.out.println("The name of the person is " + name);
    }
}
class b extends a{
    public String nameOfStudent;
    @Override
    public void displayName(){
        super.displayName();
        System.out.println("The name of the student is " + nameOfStudent);
    }
}