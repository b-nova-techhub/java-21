import java.util.ArrayList;
import java.util.List;


void main(){
	List<String> list = new ArrayList<>();
	list.add("a");
	list.add("b");
	list.add( "c");

	System.out.println(list);

	System.out.println(list.getFirst());
	System.out.println(list.getLast());

	list.addFirst("1");
	list.addLast("99");
	System.out.println(list);
}