import java.util.Scanner;

public class guess{

public static void main (String[]args){
int max =3;
int min =0;
int range = max-min+1;
int rangevalue = min+(int)(Math.random()*range);

Scanner input=new Scanner(System.in);

int tris = 0;
do{
do{
if(tris==0)
System.out.println("guess number from 1 to 3");
int guess = input.nextInt();

if(guess==rangevalue){
System.out.println("you win "+" the number is "+rangevalue);
tris=4;
}else{
System.out.println("you wrong , try agin "+"the number is "+rangevalue);
tris++;

}

}while(tris<4);

if(tris==4){
System.out.println("do want try agin (yes / no)");
String choose =input.next();

if(choose.equals("yes"))
tris=0;

}

}while(tris<4);




}}