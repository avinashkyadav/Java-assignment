import java.util.Scanner;
public class Assignment {

	public static void main(String[] args) {
				//Assignment: 1. Suggest the User right promo code, if user has applied a wrong one
					//			   2. Suggest the User, promo Code which delivers highest discount
					//				   
				//2.1 if user applied invalid promo code
					//2.2 if user has entered d a promo code which is giving him lesser discount as compare to other


				
				
						// MODEL
						int baseFare = 50;
						int kmCharge = 10;
						
						int distanceTravlled = 7;
						
						int olaMicro = 1;
						int olaMini = 2;
						int olaSedan = 3;
						int olaBike = 4;
						int olaShared = 5;

						double amountToPay = 0;
						
						// VIEW
						System.out.println("=========================");
						System.out.println("Select the Type of Cab:");
						System.out.println("1. OLA MICRO");
						System.out.println("2. OLA MINI");
						System.out.println("3. OLA SEDAN");
						System.out.println("4. OLA BIKE");
						System.out.println("5. OLA SHARED");
						System.out.println("=========================");
						
						//                  20%   25%    30%  35%   40%  45%
						long [] promcode= {14568,22114,36952,48855,78954,88877};
						double [] discount_value= {0.2,0.25,0.3,0.35,0.4,.45};
						
						
						Scanner scanner = new Scanner(System.in);
						System.out.println("Enter Your Choice:");
						int choice = scanner.nextInt();
						
						double temp=0;
						long ip_promcode=0;
						switch(choice) {
						
							case 1:
								baseFare += 10;
								amountToPay = baseFare + (kmCharge*distanceTravlled);
								System.out.println("OLA MICRO BOOKED. PLEASE PAY: \u20b9"+amountToPay);
								
								System.out.println("You can apply promocode  to get the discount");
								for(int i=0; i<promcode.length; i++)
								{
									System.out.print(promcode[i]+"  ");
								}
								ip_promcode=scanner.nextLong();
							
								for(int i=0; i<promcode.length; i++)
								{
									if((ip_promcode==promcode[i])) {
										temp=(baseFare + (kmCharge*distanceTravlled))*discount_value[i];
										break;
									}
								}
								
								if(temp==0) {
									
									System.out.println("You  applyed wrong promocode  ");
									System.out.println("plzz enter right promocode");
									System.out.println(" apply this promocode ");
									for(int i=0; i<promcode.length; i++)
									{
										System.out.print(promcode[i]+"  ");
										
									}
									System.out.println();
									System.out.print("this is the highest discount you can apply on the OLA ride 45%   "+88877);
									ip_promcode=scanner.nextLong();
								}
								else {
									amountToPay = baseFare + (kmCharge*distanceTravlled)-temp;
									System.out.println("OLA MICRO BOOKED. PLEASE PAY: \u20b9"+amountToPay);
									
								}						
								break;
								
							case 2:
								baseFare += 20;
								amountToPay = baseFare + (kmCharge*distanceTravlled);
								System.out.println("OLA MINI BOOKED. PLEASE PAY: \u20b9"+amountToPay);	
								System.out.println("You can apply promocode  to get the discount");
								for(int i=0; i<promcode.length; i++)
								{
									System.out.print(promcode[i]+"  ");
								}
								ip_promcode=scanner.nextLong();
							
								for(int i=0; i<promcode.length; i++)
								{
									if((ip_promcode==promcode[i])) {
										temp=(baseFare + (kmCharge*distanceTravlled))*discount_value[i];
										break;
									}
								}
								
								if(temp==0) {
									
									System.out.println("You  applyed wrong promocode  ");
									System.out.println("plzz enter right promocode");
									System.out.println(" apply this promocode ");
									for(int i=0; i<promcode.length; i++)
									{
										System.out.print(promcode[i]+"  ");
										
									}
									System.out.println();
									System.out.print("this is the highest discount you can apply on the OLA ride 45%   "+88877);
									ip_promcode=scanner.nextLong();
								}
								else {
									amountToPay = baseFare + (kmCharge*distanceTravlled)-temp;
								
									System.out.println("OLA MINI BOOKED. PLEASE PAY: \u20b9"+amountToPay);
									
								}	
								break;
							
							case 3:
								baseFare += 50;	
								amountToPay = baseFare + (kmCharge*distanceTravlled);
								System.out.println("OLA SEDAN BOOKED. PLEASE PAY: \u20b9"+amountToPay);
							
								System.out.println("You can apply promocode  to get the discount");
								for(int i=0; i<promcode.length; i++)
								{
									System.out.print(promcode[i]+"  ");
								}
								ip_promcode=scanner.nextLong();
							
								for(int i=0; i<promcode.length; i++)
								{
									if((ip_promcode==promcode[i])) {
										temp=(baseFare + (kmCharge*distanceTravlled))*discount_value[i];
										break;
									}
								}
								
								if(temp==0) {
									
									System.out.println("You  applyed wrong promocode  ");
									System.out.println("plzz enter right promocode");
									System.out.println(" apply this promocode ");
									for(int i=0; i<promcode.length; i++)
									{
										System.out.print(promcode[i]+"  ");
										
									}
									System.out.println();
									System.out.print("this is the highest discount you can apply on the OLA ride 45%   "+88877);
									ip_promcode=scanner.nextLong();
								}
								else {
									amountToPay = baseFare + (kmCharge*distanceTravlled)-temp;
							
									
									System.out.println("OLA SEDAN BOOKED. PLEASE PAY: \u20b9"+amountToPay);
								
									System.out.println("You can apply promocode  to get the discount");
									for(int i=0; i<promcode.length; i++)
									{
										System.out.print(promcode[i]+"  ");
									}
									ip_promcode=scanner.nextLong();
								
									for(int i=0; i<promcode.length; i++)
									{
										if((ip_promcode==promcode[i])) {
											temp=(baseFare + (kmCharge*distanceTravlled))*discount_value[i];
											break;
										}
									}
									
									if(temp==0) {
										
										System.out.println("You  applyed wrong promocode  ");
										System.out.println("plzz enter right promocode");
										System.out.println(" apply this promocode ");
										for(int i=0; i<promcode.length; i++)
										{
											System.out.print(promcode[i]+"  ");
											
										}
										System.out.println();
										System.out.print("this is the highest discount you can apply on the OLA ride 45%   "+88877);
										ip_promcode=scanner.nextLong();
									}
									else {
										amountToPay = baseFare + (kmCharge*distanceTravlled)-temp;
								
										
										System.out.println("OLA SEDAN BOOKED. PLEASE PAY: \u20b9"+amountToPay);
										
									}
								
								}
								
								break;
								
							case 4:
								baseFare += 5;
								amountToPay = baseFare + (kmCharge*distanceTravlled);
								System.out.println("OLA BIKE BOOKED. PLEASE PAY: \u20b9"+amountToPay);
								
								System.out.println("You can apply promocode  to get the discount");
								for(int i=0; i<promcode.length; i++)
								{
									System.out.print(promcode[i]+"  ");
								}
								ip_promcode=scanner.nextLong();
							
								for(int i=0; i<promcode.length; i++)
								{
									if((ip_promcode==promcode[i])) {
										temp=(baseFare + (kmCharge*distanceTravlled))*discount_value[i];
										break;
									}
								}
								
								if(temp==0) {
									
									System.out.println("You  applyed wrong promocode  ");
									System.out.println("plzz enter right promocode");
									System.out.println(" apply this promocode ");
									for(int i=0; i<promcode.length; i++)
									{
										System.out.print(promcode[i]+"  ");
										
									}
									System.out.println();
									System.out.print("this is the highest discount you can apply on the OLA ride 45%   "+88877);
									ip_promcode=scanner.nextLong();
								}
								else {
									amountToPay = baseFare + (kmCharge*distanceTravlled)-temp;
							
									
									System.out.println("OLA BIKE BOOKED. PLEASE PAY: \u20b9"+amountToPay);
											
								}
							
							
								break;
								
								case 5:
								baseFare += 8;
								amountToPay = baseFare + (kmCharge*distanceTravlled);
								System.out.println("OLA SHARED BOOKED. PLEASE PAY: \u20b9"+amountToPay);
							
								System.out.println("You can apply promocode  to get the discount");
								for(int i=0; i<promcode.length; i++)
								{
									System.out.print(promcode[i]+"  ");
								}
								ip_promcode=scanner.nextLong();
							
								for(int i=0; i<promcode.length; i++)
								{
									if((ip_promcode==promcode[i])) {
										temp=(baseFare + (kmCharge*distanceTravlled))*discount_value[i];
										break;
									}
								}
								
								if(temp==0) {
									
									System.out.println("You  applyed wrong promocode  ");
									System.out.println("plzz enter right promocode");
									System.out.println(" apply this promocode ");
									for(int i=0; i<promcode.length; i++)
									{
										System.out.print(promcode[i]+"  ");
										
									}
									System.out.println();
									System.out.print("this is the highest discount you can apply on the OLA ride 45%   "+88877);
									ip_promcode=scanner.nextLong();
								}
								else {
									amountToPay = baseFare + (kmCharge*distanceTravlled)-temp;
							
									
									System.out.println("OLA SEDAN BOOKED. PLEASE PAY: \u20b9"+amountToPay);
									
								}
			
								
								break;
								
							default:
								System.out.println("Please Select Cab to Porceed");
								break;
								
						}  	


			}

		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
