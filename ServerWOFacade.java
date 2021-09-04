/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package serverwofacade;
import java.util.Scanner;
public class ServerWOFacade {
    public static void main(String[] args) {
     Scanner kb = new Scanner(System.in);
	  int i=0; 
	  boolean f = false;
	   
	 while(f==false)
	 {
		int k = kb.nextInt();
		while (k==1) {
			i++;
		Facade a = new Facade();
		if(i%2==0)
		{
			System.out.println("1 for stop");
			a.closeserver();
			break;
		}
		else 
		System.out.println("1 for work");
		a.openserver();
		break;
		}
	
	 }
	 kb.close();
    }
    
}
