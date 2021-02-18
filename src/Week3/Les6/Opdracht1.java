package Week3.Les6;

public class Opdracht1 {
    public static void main(String[] args) {
        String array[] = {"A", "B", "C", "D", "E", "F"};
        int index = 1;
        for(int i = 0; i < array.length; i++){
            System.out.println(i+1 + ": " + array[i]);
        }

        for(String value : array){
            System.out.println(index + ": " +value);
            index++;
        }
    }
}
