import jdk.jshell.SourceCodeAnalysis;
import jdk.jshell.spi.ExecutionControl;

public class ForEachLoop {
    public static void main(String[] args) {
        String [] array= new String[]{
                "Ram", "sita","hari","tika","gita"
        };

//        printArray(array);
        printArrayForEach(array);
    }
    public static void printArrayForEach(String[] array){
        for(String name : array){
            System.out.println(name);
        }
    }
    public static void printArray(String[] array){
        for(int i=0; i<=array.length; i++){
            System.out.println(array[i]);
        }
    }
}
