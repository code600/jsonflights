package com.json;

import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.IOException;
import java.lang.String;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class jsonMain {

	public static void main(String[] args) {
		
	
		
		try {
			
			Object obj = new JSONParser().parse(new FileReader("fligtsdata.json"));
			

			

			
			 JSONObject jsonObject = (JSONObject) obj;
			 JSONObject jsonObject1 = (JSONObject) jsonObject.get("Response");
		
			 Object org = jsonObject1.get("Origin");
			 
			 System.out.println(org);
			 Object des = jsonObject1.get("Destination");
			 
			 System.out.println(des);
			 Object res = jsonObject1.get("ResponseStatus");
			 
			 System.out.println(res);
			 

			 
			 JSONArray result = (JSONArray) jsonObject1.get("Results");
	
		
			for(int i = 0; i<result.size(); i++) {
				JSONArray result1 = (JSONArray) result.get(i);
				for(int j = 0 ; j<result1.size(); j++) {
					JSONObject dt = (JSONObject)result1.get(j);
					
                
			        System.out.println("***********************************************************************************");
					String AirlineCode = (String) dt.get("AirlineCode");
					System.out.println("AirlineCode="+AirlineCode);
					String AirlineRemark = (String) dt.get("AirlineRemark");
					System.out.println("AirlineRemark="+AirlineRemark);
					boolean GSTAllowed = (Boolean) dt.get("GSTAllowed");
					System.out.println("GSTAllowed="+GSTAllowed);
		
					boolean IsCouponAppilcable = (Boolean) dt.get("IsCouponAppilcable");
					System.out.println("IsCouponAppilcable="+IsCouponAppilcable);
					
					boolean IsGSTMandatory = (Boolean) dt.get("IsGSTMandatory");
					System.out.println("IsGSTMandatory="+IsGSTMandatory);
					
					boolean IsHoldAllowedWithSSR  = (Boolean) dt.get("IsHoldAllowedWithSSR");
					System.out.println("IsHoldAllowedWithSSR="+IsHoldAllowedWithSSR);
					
					boolean IsLCC = (Boolean) dt.get("IsLCC");
					System.out.println("IsLCC="+IsLCC);
					
					boolean IsRefundable = (Boolean) dt.get("IsRefundable");
					System.out.println("IsRefundable="+IsRefundable);
					
					boolean IsUpsellAllowed = (Boolean) dt.get("IsUpsellAllowed");
					System.out.println("IsUpsellAllowed="+IsUpsellAllowed);
					
					String ResultIndex = (String) dt.get("ResultIndex");
					System.out.println("ResultIndex="+ResultIndex);
					String ValidatingAirline = (String) dt.get("ValidatingAirline");
					System.out.println("ValidatingAirline="+ValidatingAirline);
					
					
				
			       
					JSONArray segments = (JSONArray) dt.get("Segments");
//					 System.out.println("*************************************Flight Segments:***********");
					for(int k=0; k<segments.size(); k++ ) {
						JSONArray segments1 = (JSONArray) segments.get(k);
						for(int l=0; l<segments1.size(); l++) {
							JSONObject dt1 = (JSONObject)segments1.get(k);
							
							String Status = (String)dt1.get("Status");
							System.out.println("Status = "+""+ Status);
							
							System.out.println("*********BAGGAGE**************************");
							String Baggage = (String)dt1.get("Baggage");
							System.out.println("Baggage = "+ Baggage);
							
							String CabinBaggage = (String)dt1.get("CabinBaggage");
							System.out.println("CabinBaggage = "+""+ CabinBaggage);
							
							String Craft = (String)dt1.get("Craft");
							System.out.println("Craft "+""+ Craft);
							
							String FlightStatus = (String)dt1.get("FlightStatus");
							System.out.println("FlightStatus = "+ FlightStatus);
							
							long Duration = (long)dt1.get("Duration");
							System.out.println("Duration =  "+Duration);
							
							
							long GroundTime = (long)dt1.get("GroundTime");
							System.out.println("GroundTime="+GroundTime);
							
							boolean IsETicketEligible = (Boolean)dt1.get("IsETicketEligible");
							System.out.println("IsTicketEligible ="+IsETicketEligible);
							
							long Mile = (long)dt1.get("Mile");
							System.out.println("Mile ="+Mile);
							
							long NoOfSeatAvailable = (long)dt1.get("NoOfSeatAvailable");
							System.out.println("NoOfSeatAvailable="+NoOfSeatAvailable);
							
							
							long SegmentIndicator = (long)dt1.get("SegmentIndicator");
							System.out.println("SegmentIndicator="+SegmentIndicator);
							
							
							boolean StopOver = (Boolean)dt1.get("StopOver");
							System.out.println("StopOver = "+StopOver);
							
							System.out.println("**************Stop point*******");
							
							String StopPoint = (String)dt1.get("StopPoint");
							System.out.println("StopPoint = "+StopPoint);
							
							System.out.println("***********Arrival time*******");
							
						    String StopPointArrivalTime= (String) dt1.get("StopPointArrivalTime");
						    System.out.println("StopPointArrivalTime="+StopPointArrivalTime);
						    
						    System.out.println("************Deaparture time********  ");
						    
							String StopPointDepartureTime= (String) dt1.get("StopPointDepartureTime");
							System.out.println("StopPointDepartureTime="+StopPointDepartureTime);
							
							long TripIndicator = (long)dt1.get("TripIndicator");
							System.out.println("TripIndicator = "+TripIndicator);
							
							JSONObject dt2 = (JSONObject)dt1.get("Origin");
							
							System.out.println("*******Origin*********");
							
							String DepTime = (String)dt2.get("DepTime");
							System.out.println("DepTime = "+DepTime);
							
							JSONObject dt2a = (JSONObject)dt2.get("Airport");
							System.out.println("*******Origin Airport*********");
							
							
							String CityCode = (String)dt2a.get("CityCode");
							System.out.println("CityCode = "+CityCode);
							
							
							System.out.println("*********************************Arriaval Airport********************************");
							
							String AirportName = (String)dt2a.get("AirportName");
							System.out.println("AirportName = "+AirportName);
							
							
							String AirportCode = (String)dt2a.get("AirportCode");
							System.out.println("AirportCode = "+AirportCode);
							
							
							String CityName = (String)dt2a.get("CityName");
							System.out.println("CityName = "+CityName);
							
							
							String CountryCode = (String)dt2a.get("CountryCode");
							System.out.println("CountryCode = "+CountryCode);
							
							
							String CountryName = (String)dt2a.get("CountryName");
							System.out.println("CountryName = "+CountryName);
							
							
							String Terminal = (String)dt2a.get("Terminal");
							System.out.println("Terminal = "+Terminal);
							
							JSONObject dt2b = (JSONObject)dt1.get("Destination");
							
							System.out.println("**********Destination******");
							
							String ArrTime = (String)dt2b.get("ArrTime");
							System.out.println("ArrTime = "+ArrTime);
							
							JSONObject dt2ba = (JSONObject)dt2b.get("Airport");
							
							System.out.println("**********Destination Airport******");
							
							

							String CityCode1 = (String)dt2ba.get("CityCode");
							System.out.println("CityCode = "+CityCode1);
							
							
							String AirportName1 = (String)dt2ba.get("AirportName");
							System.out.println("AirportName = "+AirportName1);
							
							
							String AirportCode1 = (String)dt2ba.get("AirportCode");
							System.out.println("AirportCode = "+AirportCode1);
							
							
							String CityName1 = (String)dt2ba.get("CityName");
							System.out.println("CityName = "+CityName1);
							
							
							String CountryCode1 = (String)dt2ba.get("CountryCode");
							System.out.println("CountryCode = "+CountryCode1);
							
							
							String CountryName1 = (String)dt2ba.get("CountryName");
							System.out.println("CountryName = "+CountryName1);
							
							
							String Terminal1 = (String)dt2ba.get("Terminal");
							System.out.println("Terminal = "+Terminal1);
							
							
							JSONObject dt1c = (JSONObject)dt1.get("Airline");
							
							
							System.out.println("********Airline Details*******");
							
							String AirlineCode1 = (String)dt1c.get("AirlineCode");
							System.out.println("AirlineCode ="+AirlineCode1);
							
							String AirlineName = (String)dt1c.get("AirlineName");
							System.out.println("AirlineName ="+AirlineName);
							
							String FareClass = (String)dt1c.get("FareClass");
							System.out.println("FareClass ="+FareClass);
							
							String FlightNumber = (String)dt1c.get("FlightNumber");
							System.out.println("FlightNumber ="+FlightNumber);
							
							String OperatingCarrier = (String)dt1c.get("OperatingCarrier");
							System.out.println("OperatingCarrier ="+OperatingCarrier);
							
							
							
							
							
							
						}
					}
					
				
					
					
	                   JSONObject dt4 = (JSONObject)dt.get("Fare");
	                   
	                   System.out.println("********************************Fare details:*****************");
						
					
						
						long AdditionalTxnFeeOfrd = (long)dt4.get("AdditionalTxnFeeOfrd");
						System.out.println("AdditionalTxnFeeOfrd"+AdditionalTxnFeeOfrd);
						
						long AdditionalTxnFeePub = (long)dt4.get("AdditionalTxnFeePub");
						System.out.println("AdditionalTxnFeePub="+AdditionalTxnFeePub);
						
						long baseFare = (long)dt4.get("BaseFare");
						System.out.println("baseFare = Rs."+ baseFare);
						
						
						String currency = (String)dt4.get("Currency");
						System.out.println("Currency = "+currency );
						
						
						double offFare= (double)dt4.get("OfferedFare");
						System.out.println("OfferedFare=Rs." + offFare);
						
						long pubfare = (long)dt4.get("PublishedFare");
						System.out.println("PublishedFare=Rs."+pubfare);

						
						long Discount = (long)dt4.get("Discount");
						System.out.println("Discount=Rs."+Discount);
						
						
						long OtherCharges = (long)dt4.get("OtherCharges");
						System.out.println("OtherCharges=Rs."+OtherCharges);
						
						
						long PGCharge = (long)dt4.get("PGCharge");
						System.out.println("PGCharge=Rs."+PGCharge);
						
						
						long PLBEarned = (long)dt4.get("PLBEarned");
						System.out.println("PLBEarned=Rs."+PLBEarned);
						
						
						long ServiceFee = (long)dt4.get("ServiceFee");
						System.out.println("ServiceFee=Rs."+ServiceFee);
						
						
						long Tax = (long)dt4.get("Tax");
						System.out.println("Tax=Rs."+Tax);
						
						double TdsOnCommission = (double)dt4.get("TdsOnCommission");
						System.out.println("TdsOnCommission=Rs."+TdsOnCommission);
						
						
					
						
						
	
						
						
						long TotalBaggageCharges = (long)dt4.get("TotalBaggageCharges");
						System.out.println("TotalBaggageCharges=Rs."+TotalBaggageCharges);
						
						
						long TotalMealCharges = (long)dt4.get("TotalMealCharges");
						System.out.println("TotalMealCharges=Rs."+TotalMealCharges);
					
						
						long YQTax = (long)dt4.get("YQTax");
						System.out.println("YQTax=Rs."+YQTax);
						
						
						
						
						
						
						JSONArray Tax12 = (JSONArray)dt4.get("TaxBreakup");
						System.out.println("********TaxBreakup deatails***********");
						for(int o = 0; o<Tax12.size(); o++) {
							
							JSONObject tax12a = (JSONObject)Tax12.get(o);
							
							long value = (long)tax12a.get("value");
							System.out.println("value="+value);
							
							String key = (String)tax12a.get("key");
							System.out.println("key"+key);		
								
							
							
						}
						
						
						
						
						
						JSONArray chargeBU = (JSONArray)dt4.get("ChargeBU");
						
						
						System.out.println("************chaargeBu details*****");
						
						for(int m =0; m<chargeBU.size(); m++) {
							
							JSONObject chargeBU1 = (JSONObject)chargeBU.get(m); 
							
							long value = (long)chargeBU1.get("value");
							System.out.println("value ="+value );
							
							String key = (String)chargeBU1.get("key");
							
							System.out.println("key = " + key);
							
						}
						
					
						
						JSONArray Farerules = (JSONArray)dt.get("FareRules");
						
						System.out.println("************FareRules Details********");
						
						for(int p=0; p<Farerules.size(); p++) {
							
							JSONObject Farerules1 =  (JSONObject)Farerules.get(p);
							
							String airlineRU = (String)Farerules1.get("Airline");
							System.out.println("Airline = "+ airlineRU );
							String Dest = (String)Farerules1.get("Destination");
							System.out.println("Destination = "+ Dest );
							String FareBasisCode = (String)Farerules1.get("FareBasisCode");
							System.out.println("FareBasisCode = "+ FareBasisCode );
							String FareFamilyCode  = (String)Farerules1.get("FareFamilyCode");
							System.out.println("FareFamilyCode = "+ FareFamilyCode );
							String FareRestriction = (String)Farerules1.get("FareRestriction");
							System.out.println("FareRestriction = "+ FareRestriction);
							String FareRuleDetail = (String)Farerules1.get("FareRuleDetail");
							System.out.println("FareRuleDetail = "+ FareRuleDetail);
							String FareRuleIndex = (String)Farerules1.get("FareRuleIndex");
							System.out.println("FareRuleIndex = "+ FareRuleIndex);
							String Origin = (String)Farerules1.get("Origin");
							System.out.println("Origin = "+ Origin);
							
						}
						
						JSONArray farebreak = (JSONArray)dt.get("FareBreakdown");
						System.out.println("***********FareBreakdown**********");
						
						for(int k = 0 ;k<farebreak.size(); k++) {
							
							JSONObject farebreak1 = (JSONObject)farebreak.get(k);
							
							long AdditioTxn = (long)farebreak1.get("AdditionalTxnFeeOfrd");
							System.out.println("AdditionalTxnFeeOfrd=Rs."+AdditioTxn);
							long AdditioTxn1 = (long)farebreak1.get("AdditionalTxnFeePub");
							System.out.println("AdditionalTxnFeePub=Rs."+AdditioTxn1);
							long basefare = (long)farebreak1.get("BaseFare");
							System.out.println("BaseFare=Rs."+baseFare);
							String  Currency = (String)farebreak1.get("Currency");
							System.out.println("Currency=Rs."+Currency);
							long Passcount = (long)farebreak1.get("PassengerCount");
							System.out.println("PassengerCount"+Passcount);
							long PassType = (long)farebreak1.get("PassengerType");
							System.out.println("PassengerType"+PassType);
							long PGcharge = (long)farebreak1.get("PGCharge");
							System.out.println("PGCharge"+PGcharge);
							long Src = (long)farebreak1.get("SupplierReissueCharges");
							System.out.println("SupplierReissueCharges"+Src);
							
							long tax = (long)farebreak1.get("Tax");
							System.out.println("Tax=Rs."+Src);
							
							
							
							JSONArray Taxbreak = (JSONArray) farebreak1.get("TaxBreakUp");
							
						for(int a =0 ;  a<Taxbreak.size(); a++  ) {
							
							JSONObject taxbreak1 = (JSONObject)Taxbreak.get(a);
							
							
							long value1 = (long)taxbreak1.get("value");
							System.out.println("value = "+value1);
							
							String key = (String)taxbreak1.get("key");
							System.out.println("key ="+key);
						}
							
							
						}
					
					
					

				
					
				}
			}
		  
		
		
			 
			
		
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		catch(ParseException e) {
			e.printStackTrace();
		}
	}

}
