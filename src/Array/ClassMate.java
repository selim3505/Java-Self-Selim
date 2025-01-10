package Array;

public class ClassMate {
    public static void main(String[] args) {
        String[] names = {"selim gençer", "eray g","münir ö","murat g","harun d","caner e","rıza q","hakan ş","serhat ş","Gökhan l"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i].charAt(0)+ " " + names[i].charAt(names[i].indexOf(" ")+1) +" ");
        }
        }

        }
