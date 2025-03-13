public class VariableText{
	public static void main(String args[]){
		//乘客人数
		int count=0;
		//一:上一
		count=count+1;
		//二:上二下一
		count=count+2-1;
		//三:上二下一
		count=count+2-1;
		//四:下一
		count=count-1;
		//五:上一
		count=count+1;
		//现在人数
		System.out.println(count);
	}
}