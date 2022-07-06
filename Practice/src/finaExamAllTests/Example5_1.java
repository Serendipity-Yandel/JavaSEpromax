package finaExamAllTests;

public class Example5_1 {
    public static void main(String[] args) {
        int[] arr={2020,0504,1101};
        StringBuffer stf=new StringBuffer();
        for(int i:arr){
            stf.append(i);
        }
        System.out.println("s:["+stf+"]");
    }
}

