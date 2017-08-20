package com.techiepasssion.searching.file.with.streams;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import java.util.stream.Stream;

public class SearchFile {

	public static void main(String[] args) {
		Path path = FileSystems.getDefault().getPath("file", "jack.txt");
		String searchTerm = "jagan";
		try (Stream<String> lines = Files.lines(path)){
		Optional<String>	line =lines.filter(x -> x.contains(searchTerm)).findFirst();
		if(line.isPresent()){
			System.out.print("Found :" + line.get());
		}else{
			System.out.print("Not Found :");
		}
		} catch (Exception e) {
			System.out.print("exception message :" + e.getMessage());
		}
	}
}
