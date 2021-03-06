package edu.iu.simplepagerank;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;

import edu.iu.harp.primitivekv.Long2DoubleKVPartition;
import edu.iu.harp.primitivekv.Long2DoubleKVTable;

public class Utils {

	 //for testing
    static void printLong2DoubleKVTable(Long2DoubleKVTable prTable) {
    	for(Long2DoubleKVPartition aPartition: prTable.getPartitions()){
			int key = aPartition.getPartitionID();
			double pr = aPartition.getVal(key);
			System.out.println(key+": "+pr);
		}
    }
    
    
    static void printGraph(Map<Long, ArrayList<Long>> graph){
    	for (Entry<Long, ArrayList<Long>> entry : graph.entrySet()) {
		    Long sourceUrl = entry.getKey();
		    ArrayList<Long> targetUrls = entry.getValue();
		    
		    System.out.print(sourceUrl+":  ");
		    if(targetUrls != null){
		    	for(int i=0; i<targetUrls.size(); i++){
		    		System.out.print(targetUrls.get(i)+" ");
		    	}
		    }
		    System.out.println();
		}
    }
}

