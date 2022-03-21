package hackerrank.java;

import java.util.Scanner;

class JavaStringTokens{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] str = {};
        String s = scan.nextLine();
        if(!s.trim().isEmpty()){
            str = s.trim().split("[ !,?._'@]+");
        }
        System.out.println(str.length);
        for(String s1 : str){
            System.out.println(s1);
        }
        scan.close();
    }
}