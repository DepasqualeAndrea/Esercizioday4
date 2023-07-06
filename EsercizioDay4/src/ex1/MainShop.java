package ex1;

import java.util.ArrayList;
import java.util.List;

public class MainShop {

	public static void main(String[] args) {

		List<Prod> books = new ArrayList<>();

		books.add(new Prod(1L, "Book 1", "Books", 150.0));
		books.add(new Prod(2L, "Book 2", "Books", 120.0));
		books.add(new Prod(3L, "Book 3", "Books", 180.0));
		books.add(new Prod(4L, "Toy 1", "Baby", 50.0));
		books.add(new Prod(5L, "Clothing 1", "Men", 75.0));
		books.add(new Prod(6L, "Shoes 1", "Women", 85.0));
		books.add(new Prod(7L, "Electronics 1", "Electronics", 200.0));
		books.add(new Prod(8L, "Toy 2", "Boys", 60.0));
		books.add(new Prod(9L, "Toy 3", "Girls", 65.0));
		books.add(new Prod(10L, "Electronics 2", "Electronics", 250.0));
		books.add(new Prod(11L, "Book 4", "Books", 200.0));
		books.add(new Prod(12L, "Book 5", "Books", 220.0));
		books.add(new Prod(13L, "Book 6", "Books", 210.0));
		books.add(new Prod(14L, "Toy 4", "Baby", 55.0));
		books.add(new Prod(15L, "Clothing 2", "Men", 80.0));
		books.add(new Prod(16L, "Shoes 2", "Women", 90.0));
		books.add(new Prod(17L, "Electronics 3", "Electronics", 210.0));
		books.add(new Prod(18L, "Toy 5", "Boys", 70.0));
		books.add(new Prod(19L, "Toy 6", "Girls", 75.0));
		books.add(new Prod(20L, "Electronics 4", "Electronics", 260.0));

		List<Prod> over100 = books.stream().filter(book -> "Woman".equals(book.getCategory()) && book.getPrice() > 100)
				.toList();

		over100.forEach(System.out::println);

	}

}
