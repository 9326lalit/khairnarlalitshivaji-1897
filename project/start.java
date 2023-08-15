package project;

import java.util.Scanner;

public class start 
{
	int i,n1,n11,n111,n12,n1111,add1,total;
	static int bal=25000,bal1=35000,bal2=50000;
	String name,mobile,add;
	String p1="Portraight Photography ",o1="Outdoor Photography",w1="Wedding Photography",nature="Nature Photography";
	String lalit="Lalit Khairnar";
	
	Scanner sc=new Scanner(System.in);
	void first()
	{	
		
		System.out.println("<<--------------------------------------------------------------------------------->>");
		System.out.println("<<-------------------------------WELCOME------------------------------------------->>");	     						    	
		System.out.println("<<-------------------------TO LALLU PHOTOGRAPHY------------------------------------>>");
	    System.out.println("<<---------------------------HERE I'M LALIT---------------------------------------->>\n\n");
//		System.out.println("<<-------------------------HOW CAN I HELP YOU-------------------------------------->>");


	    System.out.println("Book Your Even With Best Packages--");
//	    System.out.println("For Continue-_Press-1 & For Exit-_Press-0");
	    System.out.println("Press 1 to continue...");
	    System.out.println("");
	    int n1=sc.nextInt();
	    switch(n1)
	    {
	    
	    case 1:
	    	System.out.println("Here The Best And Ever Photographer With Best Package-->>");
	    	System.out.println("Which One You Want-->");
	    	
	 	    System.out.println("1. "+p1);
	 	    System.out.println("2. "+o1);
	 	    System.out.println("3. "+w1);
	 	    System.out.println("4. "+nature);
	 	    System.out.println("choose any one...");
	 	    n11=sc.nextInt();	 	
	 	    switch(n11)
	 	    {
	 	    case 1:
	 	    	System.out.println("-----------------_WELCOME TO LALLU PHOTOGRAPHY_---------------------");
	 	    	System.out.println("*Thank You For Visit--");
	 	    	System.out.println("Here some packages for portraight photography");
	 	    		System.out.println("1.Our 1st pacakage Rs.25000/-");
	    			System.out.println("2.Our 2nd pacakage Rs.35000/-");
	    			System.out.println("3.Our 3rd pacakage Rs.50000/-");
	    			System.out.println("Press a no.which package you want---");
	 	    	n111=sc.nextInt();
	 	    	switch(n111)
	 	    	{
	 	    		case 1:
	 	    			System.out.println("----------------------------------------------------------------");

	 	    			System.out.println("Thanks for choosing best package--Rs.25000/-");
    					System.out.println("Here The Photographer Information >>>\n");
						System.out.println("------------------------------------------------------------------");
    					System.out.println("Name:           |    Mobile No.		|	Email");
    					System.out.println("Lalit Khairnar  |    9326780773		|	lalitkhairnar@1gmail.com\n");
    					System.out.println("-------------------------------------------------------------------");
    					System.out.println("You also check our page on Instagram @lalluuuuu_photography");
    					System.out.println("Here also our channe on YouTube @khairnar_brother_vlogs");
     	   				System.out.println("Press 1 for booked photographer ");
     	   				System.out.println("               [OR]             ");
     	   				System.out.println("Press 0 for exit....get returned....");
//							System.out.println("-------------------------------------------------------------");

	 	   					 n1111=sc.nextInt();
	 	   					{
	 	   						switch(n1111)
	 	   						{
	 	   							case 1:
	 	   								int i=0,d=0,l=0;
//	 	   								System.out.println("----------------------------------------------");
	 	   								
	 	   								System.out.println("So,we gives you discount---10%");
	 	   								if(bal>i)
	 	   								{
	 	   									d=bal/100*10;
	 	   									l=bal-d;
	 	   									total=bal-l;
	 	   									
	 	   								}
	 	   								System.out.println(">>>>>CONGRATULATION'S YOU GOT DISCOUNT<<<<<");
	 	   								System.out.println("You Only Pay Rs...."+l); 					
	 	   								System.out.println("Enter Name:-- ");
	 	   								name=sc.next();
	 	   								System.out.println("Mobile No.:--");
	 	   								mobile=sc.next();
	 	   								System.out.println("Enter Address:--");
	 	   								add=sc.next();
	 	   								
	 	   										System.out.println("::------------------------------------------------------BILLING DETAILS-------------------------------------------::");
	 	   										System.out.println(":: 	                                               ||Shree Ganeshay Namh:||                                       ::");
	 	   										System.out.println(":: Date:                                                              Name:    "  +name+ " 						  ::");
	 	   										System.out.println("::																   												  ::");
	 	   										System.out.println("::														  			  Mobile No.:"+mobile+"						  ::");
	 	   										System.out.println("::					                                      						    						      ::");
	 	   										System.out.println("::																	  Address: "+add+" 							  ::");
	 	   										System.out.println("::                                                            						        	                  ::");
	 	   										System.out.println("::Booked:-											  			      Total INR: "+bal+" 						  ::");
	 	   										System.out.println("::"+p1+"							                         						          		              ::");
	 	   										System.out.println("::Photographer Name:																					       	 ::");
	 	   										System.out.println("::"+lalit+"													  						 					 		  ::");
	 	   										System.out.println("::                                                     -----------------------------------------------------------::");
	 	   										System.out.println("::                                     					Your Total Bill: "+bal+"        					      ::");
	 	   										System.out.println("::																					 						 ::");
	 	   										System.out.println("::_______________________________________________Discount From Lallu Photography:"+d+"________________________");
	 	   										System.out.println("::-----------------------------------------------------------------------------------------------------------------::");

	 	   								
	 	   						
	 	   							
	 	   						}
	 	   					}
	 	   					break;
	 	    					
	 	    		case 2:
	 	    			System.out.println("----------------------------------------------------------------");

	 	    			System.out.println("Thanks for choosing best package--Rs.35000/-");
    					System.out.println("Here The Photographer Information >>>\n");
						System.out.println("------------------------------------------------------------------");
    					System.out.println("Name:           |    Mobile No.		|	Email");
    					System.out.println("Lalit Khairnar  |    9326780773		|	lalitkhairnar@1gmail.com\n");
    					System.out.println("-------------------------------------------------------------------");
    					System.out.println("You also check our page on Instagram @lalluuuuu_photography");
    					System.out.println("Here also our channe on YouTube @khairnar_brother_vlogs");
     	   				System.out.println("Press 1 for booked photographer");
//							System.out.println("-------------------------------------------------------------");

	 	   					 n1111=sc.nextInt();
	 	   					{
	 	   						switch(n1111)
	 	   						{
	 	   							case 1:
	 	   								int i=0,d=0,l=0;
//	 	   								System.out.println("----------------------------------------------");
	 	   								
	 	   								System.out.println("So,we gives you discount---10%");
	 	   								if(bal1>i)
	 	   								{
	 	   									d=bal1/100*10;
	 	   									l=bal1-d;
	 	   								total=bal1-l;
	 	   									
	 	   								}
	 	   							System.out.println(">>>>>CONGRATULATION'S YOU GOT DISCOUNT<<<<<");
	 	   						System.out.println("You Only Pay Rs...."+l); 					
	   								System.out.println("Enter Name:-- ");
	   								name=sc.next();
	   								System.out.println("Mobile No.:--");
	   								mobile=sc.next();
	   								System.out.println("Enter Address:--");
	   								add=sc.next();
	   								
	   										System.out.println("::------------------------------------------------------BILLING DETAILS-------------------------------------------::");
	   										System.out.println(":: 	                                               ||Shree Ganeshay Namh:||                                       ::");
	   										System.out.println(":: Date:                                                              Name: "  +name+ "                           ::");
	   										System.out.println("::																												  ::");
	   										System.out.println("::																	  Mobile No."  +mobile+  " 					  ::");
	   										System.out.println("::					                                                                                              ::");
	   										System.out.println("::																	  Address: "  +add+  " 						  ::");
	   										System.out.println("::Booked:-															  Total INR:							      ::");
	   										System.out.println("::"+o1+"							                                   "+bal1+"                                    ::");
	   										System.out.println("::Photographer Name:												Discount From Lallu Photography:			  ::");
	   										System.out.println("::"+lalit+"																"+l+"								      ::");
	   										System.out.println("::                                                     -----------------------------------------------------------::");
	   										System.out.println("::                                     					Your Total Bill:	                                      ::");
	   										System.out.println("::																		"+total+"								  ::");
	   										System.out.println("::-----------------------------------------------------------------------------------------------------------------::");

	 	   							
	 	   						}
	 	   					}
	 	   					break;
	    			
	 	    		case 3:
	 	    			
	 	    			System.out.println("----------------------------------------------------------------");

	 	    			System.out.println("Thanks for choosing best package--Rs.50000/-");
    					System.out.println("Here The Photographer Information >>>\n");
						System.out.println("------------------------------------------------------------------");
    					System.out.println("Name:           |    Mobile No.		|	Email");
    					System.out.println("Lalit Khairnar  |    9326780773		|	lalitkhairnar@1gmail.com\n");
    					System.out.println("-------------------------------------------------------------------");
    					System.out.println("You also check our page on Instagram @lalluuuuu_photography");
    					System.out.println("Here also our channe on YouTube @khairnar_brother_vlogs");
     	   				System.out.println("Press 1 for booked photographer");
//							System.out.println("-------------------------------------------------------------");

	 	   					 n1111=sc.nextInt();
	 	   					{
	 	   						switch(n1111)
	 	   						{
	 	   							case 1:
	 	   								int i=0,d=0,l=0;
//	 	   								System.out.println("----------------------------------------------");
	 	   								
	 	   								System.out.println("So,we gives you discount---10%");
	 	   								if(bal2>i)
	 	   								{
	 	   									d=bal2/100*10;
	 	   									l=bal2-d;
	 	   								total=bal2-l;
	 	   									
	 	   								}
	 	   							System.out.println(">>>>>CONGRATULATION'S YOU GOT DISCOUNT<<<<<");
	 	   						System.out.println("You Only Pay Rs...."+l); 					
	   								System.out.println("Enter Name:-- ");
	   								name=sc.next();
	   								System.out.println("Mobile No.:--");
	   								mobile=sc.next();
	   								System.out.println("Enter Address:--");
	   								add=sc.next();
	   								
	   										System.out.println("::------------------------------------------------------BILLING DETAILS-------------------------------------------::");
	   										System.out.println(":: 	                                               ||Shree Ganeshay Namh:||                                       ::");
	   										System.out.println(":: Date:                                                              Name: "  +name+ "                           ::");
	   										System.out.println("::																												  ::");
	   										System.out.println("::																	  Mobile No."  +mobile+  " 					  ::");
	   										System.out.println("::					                                                                                              ::");
	   										System.out.println("::																	  Address: "  +add+  " 						  ::");
	   										System.out.println("::Booked:-															  Total INR:							      ::");
	   										System.out.println("::"+w1+"							                                   "+bal2+"                                    ::");
	   										System.out.println("::Photographer Name:												Discount From Lallu Photography:			  ::");
	   										System.out.println("::"+lalit+"																"+l+"								      ::");
	   										System.out.println("::                                                     -----------------------------------------------------------::");
	   										System.out.println("::                                     					Your Total Bill:	                                      ::");
	   										System.out.println("::																		"+total+"								  ::");
	   										System.out.println("::-----------------------------------------------------------------------------------------------------------------::");
	 	   							
	 	   						}
	 	   					}
	 	   					break;

	    					
	    		}
	 	    
	 	    break;
	 	    
	 	 
	 	    
	    case 2:
 	    	System.out.println("-----------------_WELCOME TO LALLU PHOTOGRAPHY_---------------------");
 	    	System.out.println("*Thank You For Visit--");
 	    	System.out.println("Here some packages for Outdoor photography");
 	    		System.out.println("1.Our 1st pacakage Rs.25000/-");
    			System.out.println("2.Our 2nd pacakage Rs.35000/-");
    			System.out.println("3.Our 3rd pacakage Rs.50000/-");
    			n111=sc.nextInt();
	 	    	switch(n111)
	 	    	{
	 	    	case 1:
 	    			System.out.println("----------------------------------------------------------------");

 	    			System.out.println("Thanks for choosing best package--Rs.25000/-");
					System.out.println("Here The Photographer Information >>>\n");
					System.out.println("------------------------------------------------------------------");
					System.out.println("Name:           |    Mobile No.		|	Email");
					System.out.println("Lalit Khairnar  |    9326780773		|	lalitkhairnar@1gmail.com\n");
					System.out.println("-------------------------------------------------------------------");
					System.out.println("You also check our page on Instagram @lalluuuuu_photography");
					System.out.println("Here also our channe on YouTube @khairnar_brother_vlogs");
 	   				System.out.println("Press 1 for booked photographer");
//						System.out.println("-------------------------------------------------------------");

 	   					 n1111=sc.nextInt();
 	   					{
 	   						switch(n1111)
 	   						{
 	   							case 1:
 	   								int i=0,d=0,l=0;
// 	   								System.out.println("----------------------------------------------");
 	   								
 	   								System.out.println("So,we gives you discount---10%");
 	   								if(bal>i)
 	   								{
 	   									d=bal/100*10;
 	   									l=bal-d;
 	   								total=bal-l;
 	   									
 	   								}
 	   							System.out.println(">>>>>CONGRATULATION'S YOU GOT DISCOUNT<<<<<");
 	   						System.out.println("You Only Pay Rs...."+l); 					
								System.out.println("Enter Name:-- ");
								name=sc.next();
								System.out.println("Mobile No.:--");
								mobile=sc.next();
								System.out.println("Enter Address:--");
								add=sc.next();
								
										System.out.println("::------------------------------------------------------BILLING DETAILS-------------------------------------------::");
										System.out.println(":: 	                                               ||Shree Ganeshay Namh:||                                       ::");
										System.out.println(":: Date:                                                              Name: "  +name+ "                           ::");
										System.out.println("::																												  ::");
										System.out.println("::																	  Mobile No."  +mobile+  " 					  ::");
										System.out.println("::					                                                                                              ::");
										System.out.println("::																	  Address: "  +add+  " 						  ::");
										System.out.println("::Booked:-															  Total INR:							      ::");
										System.out.println("::"+p1+"							                                   "+bal+"                                    ::");
										System.out.println("::Photographer Name:												Discount From Lallu Photography:			  ::");
										System.out.println("::"+lalit+"																"+l+"								      ::");
										System.out.println("::                                                     -----------------------------------------------------------::");
										System.out.println("::                                     					Your Total Bill:	                                      ::");
										System.out.println("::																		"+total+"								  ::");
										System.out.println("::-----------------------------------------------------------------------------------------------------------------::");
 	   							
 	   						}
 	   					}
 	   					break;
 	    					
 	    		case 2:
 	    			System.out.println("----------------------------------------------------------------");

 	    			System.out.println("Thanks for choosing best package--Rs.35000/-");
					System.out.println("Here The Photographer Information >>>\n");
					System.out.println("------------------------------------------------------------------");
					System.out.println("Name:           |    Mobile No.		|	Email");
					System.out.println("Lalit Khairnar  |    9326780773		|	lalitkhairnar@1gmail.com\n");
					System.out.println("-------------------------------------------------------------------");
					System.out.println("You also check our page on Instagram @lalluuuuu_photography");
					System.out.println("Here also our channe on YouTube @khairnar_brother_vlogs");
 	   				System.out.println("Press 1 for booked photographer");
//						System.out.println("-------------------------------------------------------------");

 	   					 n1111=sc.nextInt();
 	   					{
 	   						switch(n1111)
 	   						{
 	   							case 1:
 	   								int i=0,d=0,l=0;
// 	   								System.out.println("----------------------------------------------");
 	   								
 	   								System.out.println("So,we gives you discount---10%");
 	   								if(bal1>i)
 	   								{
 	   									d=bal1/100*10;
 	   									l=bal1-d;
 	   								total=bal1-l;
 	   									
 	   								}
 	   							System.out.println(">>>>>CONGRATULATION'S YOU GOT DISCOUNT<<<<<");
 	   						System.out.println("You Only Pay Rs...."+l); 					
								System.out.println("Enter Name:-- ");
								name=sc.next();
								System.out.println("Mobile No.:--");
								mobile=sc.next();
								System.out.println("Enter Address:--");
								add=sc.next();
								
										System.out.println("::------------------------------------------------------BILLING DETAILS-------------------------------------------::");
										System.out.println(":: 	                                               ||Shree Ganeshay Namh:||                                       ::");
										System.out.println(":: Date:                                                              Name: "  +name+ "                           ::");
										System.out.println("::																												  ::");
										System.out.println("::																	  Mobile No."  +mobile+  " 					  ::");
										System.out.println("::					                                                                                              ::");
										System.out.println("::																	  Address: "  +add+  " 						  ::");
										System.out.println("::Booked:-															  Total INR:							      ::");
										System.out.println("::"+o1+"							                                   "+bal1+"                                    ::");
										System.out.println("::Photographer Name:												Discount From Lallu Photography:			  ::");
										System.out.println("::"+lalit+"																"+l+"								      ::");
										System.out.println("::                                                     -----------------------------------------------------------::");
										System.out.println("::                                     					Your Total Bill:	                                      ::");
										System.out.println("::																		"+total+"								  ::");
										System.out.println("::-----------------------------------------------------------------------------------------------------------------::");
 	   							
 	   						}
 	   					}
 	   					break;
    			
 	    		case 3:
 	    			
 	    			System.out.println("----------------------------------------------------------------");

 	    			System.out.println("Thanks for choosing best package--Rs.50000/-");
					System.out.println("Here The Photographer Information >>>\n");
					System.out.println("------------------------------------------------------------------");
					System.out.println("Name:           |    Mobile No.		|	Email");
					System.out.println("Lalit Khairnar  |    9326780773		|	lalitkhairnar@1gmail.com\n");
					System.out.println("-------------------------------------------------------------------");
					System.out.println("You also check our page on Instagram @lalluuuuu_photography");
					System.out.println("Here also our channe on YouTube @khairnar_brother_vlogs");
 	   				System.out.println("Press 1 for booked photographer");
//						System.out.println("-------------------------------------------------------------");

 	   					 n1111=sc.nextInt();
 	   					{
 	   						switch(n1111)
 	   						{
 	   							case 1:
 	   								int i=0,d=0,l=0;
// 	   								System.out.println("----------------------------------------------");
 	   								
 	   								System.out.println("So,we gives you discount---10%");
 	   								if(bal2>i)
 	   								{
 	   									d=bal2/100*10;
 	   									l=bal2-d;
 	   								total=bal2-l;
 	   									
 	   								}
 	   							System.out.println(">>>>>CONGRATULATION'S YOU GOT DISCOUNT<<<<<");
 	   						System.out.println("You Only Pay Rs...."+l); 					
								System.out.println("Enter Name:-- ");
								name=sc.next();
								System.out.println("Mobile No.:--");
								mobile=sc.next();
								System.out.println("Enter Address:--");
								add=sc.next();
								
										System.out.println("::------------------------------------------------------BILLING DETAILS-------------------------------------------::");
										System.out.println(":: 	                                               ||Shree Ganeshay Namh:||                                       ::");
										System.out.println(":: Date:                                                              Name: "  +name+ "                           ::");
										System.out.println("::																												  ::");
										System.out.println("::																	  Mobile No."  +mobile+  " 					  ::");
										System.out.println("::					                                                                                              ::");
										System.out.println("::																	  Address: "  +add+  " 						  ::");
										System.out.println("::Booked:-															  Total INR:							      ::");
										System.out.println("::"+w1+"							                                   "+bal2+"                                    ::");
										System.out.println("::Photographer Name:												Discount From Lallu Photography:			  ::");
										System.out.println("::"+lalit+"																"+l+"								      ::");
										System.out.println("::                                                     -----------------------------------------------------------::");
										System.out.println("::                                     					Your Total Bill:	                                      ::");
										System.out.println("::																		"+total+"								  ::");
										System.out.println("::-----------------------------------------------------------------------------------------------------------------::");
 	   							
 	   						}
 	   					}
 	   					break;

    					
    		}
 	    
 	    break;
	    					
	    		
	 	    	
	    case 3:
 	    	System.out.println("-----------------_WELCOME TO LALLU PHOTOGRAPHY_---------------------");
 	    	System.out.println("*Thank You For Visit--");
 	    	System.out.println("Here some packages for Wedding photography");
 	    		System.out.println("1.Our 1st pacakage Rs.25000/-");
    			System.out.println("2.Our 2nd pacakage Rs.35000/-");
    			System.out.println("3.Our 3rd pacakage Rs.50000/-");
    			n111=sc.nextInt();
	 	    	switch(n111)
	 	    	{
	 	    	case 1:
 	    			System.out.println("----------------------------------------------------------------");

 	    			System.out.println("Thanks for choosing best package--Rs.25000/-");
					System.out.println("Here The Photographer Information >>>\n");
					System.out.println("------------------------------------------------------------------");
					System.out.println("Name:           |    Mobile No.		|	Email");
					System.out.println("Lalit Khairnar  |    9326780773		|	lalitkhairnar@1gmail.com\n");
					System.out.println("-------------------------------------------------------------------");
					System.out.println("You also check our page on Instagram @lalluuuuu_photography");
					System.out.println("Here also our channe on YouTube @khairnar_brother_vlogs");
 	   				System.out.println("Press 1 for booked photographer");
//						System.out.println("-------------------------------------------------------------");

 	   					 n1111=sc.nextInt();
 	   					{
 	   						switch(n1111)
 	   						{
 	   							case 1:
 	   								int i=0,d=0,l=0;
// 	   								System.out.println("----------------------------------------------");
 	   								
 	   								System.out.println("So,we gives you discount---10%");
 	   								if(bal>i)
 	   								{
 	   									d=bal/100*10;
 	   									l=bal-d;
 	   								total=bal-l;
 	   									
 	   								}
 	   							System.out.println(">>>>>CONGRATULATION'S YOU GOT DISCOUNT<<<<<");
 	   						System.out.println("You Only Pay Rs...."+l); 					
								System.out.println("Enter Name:-- ");
								name=sc.next();
								System.out.println("Mobile No.:--");
								mobile=sc.next();
								System.out.println("Enter Address:--");
								add=sc.next();
								
										System.out.println("::------------------------------------------------------BILLING DETAILS-------------------------------------------::");
										System.out.println(":: 	                                               ||Shree Ganeshay Namh:||                                       ::");
										System.out.println(":: Date:                                                              Name: "  +name+ "                           ::");
										System.out.println("::																												  ::");
										System.out.println("::																	  Mobile No."  +mobile+  " 					  ::");
										System.out.println("::					                                                                                              ::");
										System.out.println("::																	  Address: "  +add+  " 						  ::");
										System.out.println("::Booked:-															  Total INR:							      ::");
										System.out.println("::"+p1+"							                                   "+bal+"                                    ::");
										System.out.println("::Photographer Name:												Discount From Lallu Photography:			  ::");
										System.out.println("::"+lalit+"																"+l+"								      ::");
										System.out.println("::                                                     -----------------------------------------------------------::");
										System.out.println("::                                     					Your Total Bill:	                                      ::");
										System.out.println("::																		"+total+"								  ::");
										System.out.println("::-----------------------------------------------------------------------------------------------------------------::");

 	   							
 	   						}
 	   					}
 	   					break;
 	    					
 	    		case 2:
 	    			System.out.println("----------------------------------------------------------------");

 	    			System.out.println("Thanks for choosing best package--Rs.35000/-");
					System.out.println("Here The Photographer Information >>>\n");
					System.out.println("------------------------------------------------------------------");
					System.out.println("Name:           |    Mobile No.		|	Email");
					System.out.println("Lalit Khairnar  |    9326780773		|	lalitkhairnar@1gmail.com\n");
					System.out.println("-------------------------------------------------------------------");
					System.out.println("You also check our page on Instagram @lalluuuuu_photography");
					System.out.println("Here also our channe on YouTube @khairnar_brother_vlogs");
 	   				System.out.println("Press 1 for booked photographer");
//						System.out.println("-------------------------------------------------------------");

 	   					 n1111=sc.nextInt();
 	   					{
 	   						switch(n1111)
 	   						{
 	   							case 1:
 	   								int i=0,d=0,l=0;
// 	   								System.out.println("----------------------------------------------");
 	   								
 	   								System.out.println("So,we gives you discount---10%");
 	   								if(25000>i)
 	   								{
 	   									d=bal1/100*10;
 	   									l=bal1-d;
 	   								total=bal1-l;
 	   									
 	   								}
 	   							System.out.println(">>>>>CONGRATULATION'S YOU GOT DISCOUNT<<<<<");
 	   						System.out.println("You Only Pay Rs...."+l); 					
								System.out.println("Enter Name:-- ");
								name=sc.next();
								System.out.println("Mobile No.:--");
								mobile=sc.next();
								System.out.println("Enter Address:--");
								add=sc.next();
								
										System.out.println("::------------------------------------------------------BILLING DETAILS-------------------------------------------::");
										System.out.println(":: 	                                               ||Shree Ganeshay Namh:||                                       ::");
										System.out.println(":: Date:                                                              Name: "  +name+ "                           ::");
										System.out.println("::																												  ::");
										System.out.println("::																	  Mobile No."  +mobile+  " 					  ::");
										System.out.println("::					                                                                                              ::");
										System.out.println("::																	  Address: "  +add+  " 						  ::");
										System.out.println("::Booked:-															  Total INR:							      ::");
										System.out.println("::"+o1+"							                                   "+bal1+"                                    ::");
										System.out.println("::Photographer Name:												Discount From Lallu Photography:			  ::");
										System.out.println("::"+lalit+"																"+l+"								      ::");
										System.out.println("::                                                     -----------------------------------------------------------::");
										System.out.println("::                                     					Your Total Bill:	                                      ::");
										System.out.println("::																		"+total+"								  ::");
										System.out.println("::-----------------------------------------------------------------------------------------------------------------::");

 	   							
 	   						}
 	   					}
 	   					break;
    			
 	    		case 3:
 	    			
 	    			System.out.println("----------------------------------------------------------------");

 	    			System.out.println("Thanks for choosing best package--Rs.50000/-");
					System.out.println("Here The Photographer Information >>>\n");
					System.out.println("------------------------------------------------------------------");
					System.out.println("Name:           |    Mobile No.		|	Email");
					System.out.println("Lalit Khairnar  |    9326780773		|	lalitkhairnar@1gmail.com\n");
					System.out.println("-------------------------------------------------------------------");
					System.out.println("You also check our page on Instagram @lalluuuuu_photography");
					System.out.println("Here also our channe on YouTube @khairnar_brother_vlogs");
 	   				System.out.println("Press 1 for booked photographer");
//						System.out.println("-------------------------------------------------------------");

 	   					 n1111=sc.nextInt();
 	   					{
 	   						switch(n1111)
 	   						{
 	   							case 1:
 	   								int i=0,d=0,bal2=50000,l=0;
// 	   								System.out.println("----------------------------------------------");
 	   								
 	   								System.out.println("So,we gives you discount---10%");
 	   								if(25000>i)
 	   								{
 	   									d=25000/100*10;
 	   									l=bal2-d;
 	   								total=bal=2-l;
 	   									
 	   								}
 	   							System.out.println(">>>>>CONGRATULATION'S YOU GOT DISCOUNT<<<<<");
 	   						System.out.println("You Only Pay Rs...."+l); 					
								System.out.println("Enter Name:-- ");
								name=sc.next();
								System.out.println("Mobile No.:--");
								mobile=sc.next();
								System.out.println("Enter Address:--");
								add=sc.next();
								
										System.out.println("::------------------------------------------------------BILLING DETAILS-------------------------------------------::");
										System.out.println(":: 	                                               ||Shree Ganeshay Namh:||                                       ::");
										System.out.println(":: Date:                                                              Name: "  +name+ "                           ::");
										System.out.println("::																												  ::");
										System.out.println("::																	  Mobile No."  +mobile+  " 					  ::");
										System.out.println("::					                                                                                              ::");
										System.out.println("::																	  Address: "  +add+  " 						  ::");
										System.out.println("::Booked:-															  Total INR:							      ::");
										System.out.println("::"+w1+"							                                   "+bal2+"                                    ::");
										System.out.println("::Photographer Name:												Discount From Lallu Photography:			  ::");
										System.out.println("::"+lalit+"																"+l+"								      ::");
										System.out.println("::                                                     -----------------------------------------------------------::");
										System.out.println("::                                     					Your Total Bill:	                                      ::");
										System.out.println("::																		"+total+"								  ::");
										System.out.println("::-----------------------------------------------------------------------------------------------------------------::");

 	   							
 	   						}
 	   					}
 	   					break;

    					
    		}
 	    
 	    break;
    	
	 	    	
	 	    	
	    case 5:
//	    	System.out.println("Sorry for that....If you want to continue...Press y");
	    	switch(1)
	    	{
	    	
	    	case 1:
	    		System.out.println("*Thanks for visit again...");
	    		System.out.println("*Here The Best And Ever Photographer With Best Package-->>");
		    	System.out.println("*Which One You Want-->");
		 	    System.out.println("1. Portraight Photography ");
		 	    System.out.println("2. Outdoor Photography");
		 	    System.out.println("3. Wedding Photographer");
		 	    System.out.println("4. Nature Photography\n");
		 	    System.out.println("choose any one...");
		 	    n11=sc.nextInt();	 	    
		 	    break;
	    	}
	 	    }
	    
	    }
	
	    
	
	}
	public static void main(String[] args)
	{
		start s=new start();
		s.first();
		
	}

}
