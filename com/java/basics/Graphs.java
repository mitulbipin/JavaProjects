package com.java.basics;

import java.awt.List;
import java.util.HashMap;
import java.util.LinkedList;

class Graph<T> {
	
	private HashMap<T ,LinkedList<T>> map = new HashMap<>(); 
	
	//addVertex
	private void addVertex(T s) {
		map.put(s,new LinkedList<T>());
	}
	
	protected void addEdge(T source, T destination, Boolean bidirectional) {
		if(!map.containsKey(source))
			addVertex(source);
		if(!map.containsKey(destination))
			addVertex(destination);
		
		map.get(source).add(destination);
		if(bidirectional == true)
			map.get(destination).add(source);
	}
	
	protected int edgeCount() {
		int count = 0;
		for(int i = 0 ; i < map.keySet().size();i++)
			count++;
		return count;
	}
	protected void hasVertex(T s) {
		if(!map.containsKey(s))
			System.out.println("Vertex is not present");
		else
			System.out.println("Vertex is present");
	}
	
  @Override
    public String toString() 
    { 
        StringBuilder builder = new StringBuilder(); 
  
        for (T v : map.keySet()) { 
            builder.append(v.toString() + ": "); 
            for (T w : map.get(v)) { 
                builder.append(w.toString() + " "); 
            } 
            builder.append("\n"); 
        } 
  
        return (builder.toString()); 
    } 
}

public class Graphs{
	public static void main(String args[]) {
		Graph<Integer> g = new Graph<Integer>();
		g.addEdge(0,1,true);
		g.addEdge(0, 2, true);
		System.out.println("Graph:\n" +g.toString());
		g.hasVertex(3);
		System.out.println("Edge Count: "+g.edgeCount());
	}
}
