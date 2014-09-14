package com.eedanna.collections;

import java.util.ArrayList;
import java.util.List;

public class Helper {

	
	static List<Object> assetList = new ArrayList<Object>();
	static List<Object> assetList1 = new ArrayList<Object>();
	
	public Helper() {
		// TODO Auto-generated constructor stub
	}
	
	public static void setAssetData(String isCashAll, String cashAmount){
	
		//for (int i = 0; i < assetList.size(); i++) {
		//if(assetList.size() > 5){
			assetList.add(isCashAll);
			assetList.add(cashAmount);	
			assetList1.add(assetList);
		//}
		
			if(assetList1.size() == 5){
				System.out.println(">> "+assetList);
				assetList = new ArrayList<Object>();
				assetList1 = new ArrayList<Object>();
			}
		
	}

}
