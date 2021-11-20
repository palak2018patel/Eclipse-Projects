
public class NumberStack implements Intstack {
	
	private int sp;
	private int stack[];
	int size;
	public NumberStack(int size) {
		sp=-1;
		stack=new int[size];
	}
	public static void main(String[] args) {
		
		NumberStack demostack=new NumberStack(5);
		demostack.push(1);
		demostack.push(2);
		demostack.push(3);
		demostack.push(4);
		demostack.push(5);
		//demostack.push(6);
		System.out.println(demostack.pop());		
		System.out.println(demostack.pop());		
		System.out.println(demostack.pop());		
		System.out.println(demostack.pop());
		System.out.println(demostack.pop());
		System.out.println(demostack.pop());		
	}
	@Override
	public void push(int number) {
		if(sp==stack.length-1) {
			System.out.println("Stack is full");
		}else
		{
			stack[++sp]=number;
		}			
		}	
	@Override
	public int pop() {
		if(sp<0) {
			System.out.println("Stack is underflow");
			return 0;
		}
		else {
			return stack[sp--];
		}
		
	}

}
