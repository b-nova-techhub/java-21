import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import com.bnova.techhub.threads.Api;


void main() {
	var startTime = LocalTime.now();
	System.out.println(STR."Start Time: \{startTime}");

	List<Thread> threads = new ArrayList<>();
	for (int i = 0; i < 100; i++) {
		var thread = new Thread(Api::callApi);
		threads.add(thread);
		thread.start();
	}

	for (Thread thread : threads) {
		try {
			thread.join();
		} catch (InterruptedException e) {
			System.err.println(STR."Failed to join thread: \{e.getMessage()}");
		}
	}

	var endTime = LocalTime.now();
	System.out.println(STR."End Time: \{endTime}");
	System.out.println(STR."Duration: \{java.time.Duration.between(startTime, endTime).toMillis()} milliseconds");
}