/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse.fibonacci;

/**
 *
 * @author Praktikan
 */
import javax.swing.JOptionPane;
public class ReverseFibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i,j,temp;
int input = Integer.parseInt(JOptionPane.showInputDialog("masukkan integer positif : "));
int SIZE = (input*2) +1;
int [] array= new int [SIZE];
int sum=2; 
int median;


array [0] = 0;
array [1] = 1;


for (i=2; i<array.length; i++) {
array [i] = array [i-1] + array [i-2];
}


if (SIZE % 2 == 0) {
median = array [(SIZE/2)-1] + array [SIZE/2];
}
else {
median = array [SIZE/2];
}


for (i=2; i<array.length; i++) {
sum = sum + array [i] ;
}

int mean = sum/SIZE;


for (i=0; i<array.length-1; i++) {
for (j=0; j<array.length-1; j++) {
if (array [j]< array [j+1] ) {
temp = array [j];
array [j] = array [j+1];
array [j+1] = temp;
}
}
}

System.out.println("deret : ");
for (i=0; i<array.length; i++) {
System.out.print (array [i]+ " ");
}
System.out.println ("");

System.out.println ("mean : " + mean);
System.out.println ("median: "+ median);

}
}
