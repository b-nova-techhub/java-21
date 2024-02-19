import java.io.IOException;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.stream.Collectors;


void main() {

	int x = 10;
	int y = 20;

	String a = x + " times " + y + " = " + x * y;
	String b = String.format("%d times %d = %d", x, y, x * y);
	String c = "%d times %d = %d".formatted(x, y, x * y);
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);

	// The new way
	System.out.println(STR."\{x} times \{y} = \{x * y}");

	var name = "Tom";
	var city = "Basel";
	var random = new Random().nextInt(100);

	System.out.println(STR."Hello \{name}, welcome to \{city}!");
	System.out.println(STR."Hello \{name.toLowerCase().charAt(0)}, welcome to \{city.toUpperCase()}!");

	System.out.println(STR."Your random number is \{random}.");
	System.out.println(STR."Your random number is \{random} and the half of it is \{random/2}.");

	System.out.println(STR."The podcast name is \{getPodcastName()}.");


	StringTemplate.Processor<String, RuntimeException> BNOVA = template -> template.fragments().stream().map(String::toUpperCase).collect(Collectors.joining()) + STR."; check out the podcast \{getPodcastName()}";

	System.out.println(BNOVA."hello from basel, the beautiful city 'am rhy'");

	StringTemplate.Processor<String, RuntimeException> LOG = template -> template.interpolate() +  STR."; TrackingID: \{new Random().nextInt(1000)}";

	System.out.println(LOG."User \{name} logged in at \{LocalTime.now()}");

}

String getPodcastName() {
	return "decodify";
}