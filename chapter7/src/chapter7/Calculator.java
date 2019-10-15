package chapter7;

public class Calculator {

	public static void main(String[] args) {
		//检查传递的字符串数量
		if (args.length!=3) {
			System.out.println("Usage: java Calculator operand1 operator operand2");
			System.exit(1);
		}
		int result =0;

		//操作步骤
		switch(args[1].charAt(0)){
			case '+':result=Integer.parseInt(args[0])+
							Integer.parseInt(args[2]);
					break;
			case '-':result=Integer.parseInt(args[0])-
							Integer.parseInt(args[2]);
					break;
			case '.':result=Integer.parseInt(args[0])*
							Integer.parseInt(args[2]);
					break;
			case '/':result=Integer.parseInt(args[0])/
							Integer.parseInt(args[2]);
					break;
		}
		//显示结果
		System.out.println(args[0]+" "+args[1]+" "+args[2]+" = "+result);
	}

}
