import java.util.LinkedList;
import java.util.Queue;

public class QueueTest{

	public static void main(String[] args){
		Queue<String> queue=new LinkedList<String>();

		String value=new String("1: ȫ�浿");
		queue.offer(value);
		queue.offer(new String("2. :�̼���"));
		queue.offer("3: �ָ�");

		String str1=(String)queue.poll();
		System.out.println(str1);

		String str2=(String)queue.peek();
		System.out.println(str2);

		while(queue.peek()!=null){
			String str3=(String)queue.poll();
			System.out.println(str3);
		}
	}
}
