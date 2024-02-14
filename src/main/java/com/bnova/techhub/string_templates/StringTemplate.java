import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;


void main() {
	var name = "Tom";
	var city = "Basel";
	var x = new Random().nextInt(100);

	System.out.println(STR."Hello \{name}, welcome to \{city}!");
	System.out.println(STR."Hello \{name.toLowerCase().charAt(0)}, welcome to \{city.toUpperCase()}!");

	System.out.println(STR."Your random number is \{x}.");
	System.out.println(STR."Your random number is \{x} and the half of it is \{x/2}.");

	System.out.println(STR."The podcast name is \{getPodcastName()}.");


	StringTemplate.Processor<String, RuntimeException> BNOVA = template -> {
		return template.fragments().stream().map(String::toUpperCase).collect(Collectors.joining()) + STR."; check out the podcast \{getPodcastName()}";
	};

	System.out.println(BNOVA."hello from basel, the beautiful city 'am rhy'");

}

String getPodcastName() {
	return "decodify";
}