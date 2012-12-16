
import java.util.*; // for scanner





public class RomanNumerals {
    public    String toRoman(int number)
    {    

String sRoman = (""); // holds Roman numerals

//prompts user to enter number

if (number <= 0 || number >= 3000) {
throw new NumberFormatException ("Numbers need to be between 1 - 3,000.");
}


// loops through the input to convert input into Roman numeral
while(number!=0)
{
    while (number >= 1000)
{
number = number - 1000;
sRoman += ("M");
}
if (number >= 900)
{
number = number - 900;
sRoman += ("CM");
}
if (number >= 500)
{
number = number - 500;
sRoman += ("D");
}
if (number >= 400)
{
number = number - 400;
sRoman += ("CD");
}
if (number >= 100)
{
number = number - 100;
sRoman += ("C");
}
if (number >= 90)
{
number = number - 90;
sRoman += ("XC");
}
if (number >= 50)
{
number = number - 50;
sRoman += ("L");
}
if (number >= 40)
{
number = number - 40;
sRoman += ("XL");
}
if (number >= 10)
{
number = number - 10;
sRoman += ("X");
}
if (number >= 9)
{
number = number - 9;
sRoman += ("IX");
}
if (number >= 5)
{
number = number - 5;
sRoman += ("V");
}
if (number >= 4)
{
number = number - 4;
sRoman += ("IV");
}
if (number >= 1)
{
number = number - 1;
sRoman += ("I");
}
    }
System.out.println("The Roman numeral equivalent is: " + (String) sRoman); //shows numeral to Rom conversion
return sRoman;
}
}
