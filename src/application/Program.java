package application;

import java.util.ArrayList;

import java.util.List;
import java.util.stream.Collectors;

public class Program {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("Maria");
		list.add("Bob");
		list.add("Ana");
		list.add("Ze");
		list.add("Marcio");
		list.add("Pedro");
		list.add(2, "Pipoca");
		list.remove("Ana");
		list.remove(1);
		list.removeIf(x -> x.charAt(0) == 'M');
		
		System.out.println(list.size());
		
		for (String xyz : list) {
			System.out.println(xyz);
		}
		System.out.println("Index Ze: " + list.indexOf("Ze"));
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'P').collect(Collectors.toList());
		for (String xyz : result) {
			System.out.println(xyz);
		}
		String name = list.stream().filter(x -> x.charAt(0) == 'P').findFirst().orElse(null);
		System.out.println(name);
	}

}
