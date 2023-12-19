package com.adventOfCode2023.AoC;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


// hello world here is day one

public class dayOne {

    public static void main(String[] args  )throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("inputs/dayOne.txt"));
        String ourLine;


        ArrayList<Integer> numsInString = new ArrayList<>();

        int firstDigit;
//        int lastDigit;
        int stringCounter =0;
        Boolean firstDigitFlag = false;
        String combinedNums = "";

        while ((ourLine = br.readLine()) != null){
            System.out.println("current line  : " + ourLine);

            for(int currentChar = 0 ;currentChar < ourLine.length()  ; currentChar++ ){
                char workingElement = ourLine.charAt(currentChar);
                stringCounter++;
                System.out.println(workingElement);


                if(Character.isDigit(workingElement)){

                    int foundDigit = Character.getNumericValue(workingElement);
                    numsInString.add(foundDigit);
                    if (firstDigitFlag == false){
                        firstDigit = foundDigit;
                        combinedNums = firstDigit+"";
                        firstDigitFlag = true;
                    }
                }
                if(stringCounter == ourLine.length()){
                    int lastIndex = numsInString.size() - 1;
                    int lastElement = numsInString.get(0);
                    System.out.println(lastElement);
                    System.out.println(lastIndex);
//                    System.out.println(lastDigit);
//                    combinedNums = combinedNums+""+lastDigit;

                }
                System.out.println(combinedNums);

                    // add digits to array list then extract last digit
//                    System.out.println(firstDigit);
//                    break;
                }
                System.out.println("our numbers "+numsInString);

            }


            if(ourLine.equals("")){
                System.out.println("BlankLine ");
            }

        }
    }

