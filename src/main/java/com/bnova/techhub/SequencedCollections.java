import java.util.ArrayList;
import java.util.List;


void main(){
	List<String> list = List.of("a", "b", "c");

	System.out.println(list);

	System.out.println(list.getFirst());
	System.out.println(list.getLast());

	list = new ArrayList<>(list);
	list.addFirst("1");
	list.addLast("99");
	System.out.println(list);
}