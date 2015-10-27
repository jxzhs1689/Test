public class Demo128 {
	public static void main(String[] args) {
		Aaa aaa=new Aaa();
		aaa.show();
		Bbb bbb=new Bbb();
		bbb.show();
	}
}
class Aaa{ 
	int a=0;//如果a不赋初值,a是0。定义类型后应赋值
	//圆周率不让修改
	//带有final修饰的变量命名时应有_下划线来区分表示。这是java程序员的标准。
	final float reate_1=3.1415926f;//使用final可以保证，需要强制不被修改的数据一定要用final锁定
	//final int b;  //使用final定义变量时一定要赋初值否则报错。
	//b=1;
	final public void sendMes(){//给成员方法用final来修饰则表示不可以被修改，不可被覆盖。
		System.out.println("发送消息");
	}
	public void show(){
		System.out.println("a="+a);
	}
}
final class Bbb extends Aaa{//定义类前加final表示该类不允许被继承
	public Bbb(){
		a++;
		//reate_1=reate+1;
	}
	/*public void sendMes(){
		System.out.println("发送消息")
	}*/
}
