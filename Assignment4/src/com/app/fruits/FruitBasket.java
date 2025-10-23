package com.app.fruits;

import java.util.Scanner;

public class FruitBasket {
	public static int menu() {
		Scanner x = new Scanner(System.in);
		
		System.out.println("0.exit\n1.Add Mango\n2.Add Orange\n3.Add Apple \n4.Display names of all fruits in the basket.\n5.Display name, color, weight, taste of all fresh fruits, in the basket.\n6.Display tastes of all stale (not fresh) fruits in the basket.\n7.Mark a fruit as stale \n8.Mark all sour fruits stale");
		System.out.println("Enter your choice  :");
		int choice = x.nextInt();
		
		return choice;
	}
	
	public static void addfruit(Fruit arr[],int choice,int i) {
		Scanner x = new Scanner(System.in);
		
		if(i<arr.length) {
			System.out.print("Enter weight: ");
			String weight = x.next();
			
			System.out.print("Enter color: ");
			String color = x.next();
			if(choice ==1){
				arr[i] = new Mango(color, weight);
			}else if(choice ==2) {
				arr[i] = new Orange(color, weight);
			}else{
				arr[i] = new Apple(color, weight);
			}
			System.out.println("--------------------------------------------------------------------------------------------------");
			
		}else {System.out.println("basket is full");
		System.out.println("--------------------------------------------------------------------------------------------------");
		}
		
	
		
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		System.out.print("Enter size of basket :");
		int size = x.nextInt();
		
		Fruit [] arr = new Fruit[size];
		int i=0;
		int choice;
		
		while((choice = menu() )!=0) {
			
			switch(choice) {
			case 1:{
				addfruit(arr, choice, i);
				i++;
				break;
			}
			case 2:{
				addfruit(arr, choice, i);
				i++;
				break;
			}
			case 3:{
				addfruit(arr, choice, i);
				i++;

				break;
			}
			case 4:{
				System.out.print("[");
				for (Fruit fruit : arr) {
					if(fruit != null)
						System.out.print(fruit.getName()+" ,");
					
				}
				System.out.println("]");
				System.out.println("--------------------------------------------------------------------------------------------------");
				break;
			}
			case 5:{
				System.out.println("[");
				for (Fruit fruit : arr) {
					if(fruit != null) {
						System.out.print(fruit.toString()); 
						System.out.println("  ,taste :"+ fruit.taste()); 
					}
				}
				System.out.println("]");
				System.out.println("--------------------------------------------------------------------------------------------------");
				
				break;
			}
			case 6:{
				int count =0;
				for (Fruit fruit : arr) {
					
					if(fruit != null) {
						if(fruit.isfresh== false) {
							System.out.println(count + " : "+ fruit.name);
						}	
					}
					count ++;
					
				}
				System.out.println("--------------------------------------------------------------------------------------------------");
				break;
			}
			case 7:{
				System.out.println("Enter the index respect to zero of fruit which you want assign as stale :");
				int s = x.nextInt();
				if(s>i) {
					System.out.println("in case of invalid index)");
				}
				else {
					for(int j=0;j<=i;j++) {
						if(j==s) {
							arr[j].setIsfresh(false);
						}
					}
				}
				System.out.println("--------------------------------------------------------------------------------------------------");
				
				break;
			}
			case 8:{
					for (Fruit fruit : arr) {
					
					if(fruit != null) {
						if(fruit.taste() == "sour") {
							fruit.isfresh =false;
						}
							
					}
					
				}
					System.out.println("--------------------------------------------------------------------------------------------------");
				break;
			}
			default:{
				System.out.println("wrong choice");
				System.out.println("--------------------------------------------------------------------------------------------------");
			}
			}
			
		}

	}

}
