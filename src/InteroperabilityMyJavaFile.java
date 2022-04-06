
public class InteroperabilityMyJavaFile {
    public static void main(String[] args) {
//        InteroperabilityMyKotlinKt imkt = new InteroperabilityMyKotlinKt();
//        int sum = imkt.addition(3,6);
//        System.out.println(sum);
//        System.out.println(MyCustomKotlinFile.addition(1, 5));

        int volumeOfShape = DefaultFunctionsKt.volume(12, 4);
        System.out.println(volumeOfShape);

    }
    public int areaOfJavaFile(int a , int b){
        return a*b;
    }
}
