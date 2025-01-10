package Array;

public class StudentGrade {
    public static void main(String[] args) {
        String [] names = {"Selim","Rıza","Halim"};
        int[] notes = {76,86,96};
        char[] grades = new char[names.length];
        for(int i=0;i<names.length;i++){
            if( notes[i]>90){
                grades[i]='A';

            } else if (notes[i]>80) {
                grades[i]='B';

            } else if (notes[i]>70) {
                grades[i]='C';

            }else{
                grades[i]='F';
            }
            System.out.println(names[i]+" "+notes [i] + " " + grades[i]);
        }
    }
}
