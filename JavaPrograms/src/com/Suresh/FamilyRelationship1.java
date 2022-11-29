package com.Suresh;

public class FamilyRelationship1 {
	  public static void main(String[] args) {

		    //int number = 44;
			String name=null;
			if (args.length==0){
				System.out.println("Atlease pass one name");
			} else{
				name=args[0];
			}
			//String size;

		    // switch statement to check size
		    switch (name) {

		      case "Suresh":
		System.out.println(name +" is the Head of the family");
		        //size = "Small";
		        break;

		      case "Lakshmi":
			  System.out.println(name +" is the House wife");
		        //size = "Medium";
		        break;

		      // match the value of week
		      case "Sezhin":
		System.out.println("My son");
		        //size = "Large";
		        break;

		      case "Vizhaiya":
			  System.out.println("My daughter");
		        //size = "Extra Large";
		        break;
		      
		      default:
			  System.out.println(name+ " Is not our family member.");
		        //size = "Unknown";
		        break;
		}
		}
		}
