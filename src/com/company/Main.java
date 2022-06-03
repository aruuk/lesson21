package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
//        String word1 = "hello java 6";//nahoditsa v String pool memory
//        String word2 = "hello java 6";//nahoditsa v heap memory
//        System.out.println(6==6);
//        System.out.println(word1 == word2);//smotrit na kakoy object ssylaetcsa
//
//        String a = new String( "1234");
//        String b = a;
//        System.out.println(a==b);
//
//        System.out.println(word1.equals(word2));//smorit na information v sravnivaemyh peremennyh
//
//        Main main1 = new Main();
//        Main main2 = new Main();
//        System.out.println(main1==main2);

//        int [] nums = {1,2,3,4,5};
//        StringBuilder builder = new StringBuilder();
//        for (int a : nums) builder.append(a + " "); {
//            System.out.println(builder);
//        }

//        int [] arr = {1,2,3,4,5};
//        StringBuilder stringBuilder = new StringBuilder();
//        System.out.println(stringBuilder.append(Arrays.toString(arr)));



//        try (FileWriter fileWriter = new FileWriter("alphabet.txt")) {
//            fileWriter.write("Aa Bb Cc Dd Ee Ff Gg Hh Ii Jj Kk Ll Mm Nn Pp Qq Rr Ss Tt Uu Vv Ww Xx Yy Zz;\n");
//            fileWriter.write("0 1 2 3 4 5 6 7 8 9;");
//        }catch (IOException exception){
//            exception.printStackTrace();
//        }
//
//        try(FileReader fileReader = new FileReader("alphabet.txt")) {
//            Scanner scanner = new Scanner(fileReader);
//            while (scanner.hasNextLine()) {
//                System.out.println(scanner.nextLine());
//            }
//        }catch (IOException e){
//            e.printStackTrace();
//        }


        try (FileWriter  fileWriter =  new FileWriter("alphabet.txt")){
            for(char i = 'a'; i <= 'z'; i++)
            {
                fileWriter.write (i+", ");
            }
            fileWriter.write("\n");
            for(char i = 'A'; i <= 'Z'; i++)
            {
                fileWriter.write (i + ",  ");
            }
            fileWriter.write("\n");
            for(char i = '0'; i <= '9'; i++) {
                fileWriter.write(i+", ");
            }
            fileWriter.write("\n");
        }catch(IOException e){
            e.printStackTrace();
        }

        try(FileReader fileReader = new FileReader("alphabet.txt")){
            Scanner scanner =  new Scanner(fileReader);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }catch(IOException e){
            e.printStackTrace();
        }



//        FileWriter writer = new FileWriter("song.txt");
//        writer.write("name of the author: Name");
//        writer.write("name of the song: name2");
//        writer.write("soooooong");


//        try (FileWriter writer = new FileWriter("Song.txt")){
//            Song song = new Song("hjgchfg", "g mngjvj","vjghbnbj");
//            writer.write(song.toString());
//        }catch (IOException e){
//            e.printStackTrace();
//        }
//        try(FileReader reader = new FileReader("Song.txt")){
//            Scanner scanner= new Scanner(reader);
//            while(scanner.hasNextLine()){
//                System.out.println(scanner.nextLine());
//            }
//        }catch (IOException exception) {
//            exception.printStackTrace();
//        }

    }
}
