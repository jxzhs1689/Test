public class Demo128 {
	public static void main(String[] args) {
		Aaa aaa=new Aaa();
		aaa.show();
		Bbb bbb=new Bbb();
		bbb.show();
	}
}
class Aaa{ 
	int a=0;//���a������ֵ,a��0���������ͺ�Ӧ��ֵ
	//Բ���ʲ����޸�
	//����final���εı�������ʱӦ��_�»��������ֱ�ʾ������java����Ա�ı�׼��
	final float reate_1=3.1415926f;//ʹ��final���Ա�֤����Ҫǿ�Ʋ����޸ĵ�����һ��Ҫ��final����
	//final int b;  //ʹ��final�������ʱһ��Ҫ����ֵ���򱨴�
	//b=1;
	final public void sendMes(){//����Ա������final���������ʾ�����Ա��޸ģ����ɱ����ǡ�
		System.out.println("������Ϣ");
	}
	public void show(){
		System.out.println("a="+a);
	}
}
final class Bbb extends Aaa{//������ǰ��final��ʾ���಻�����̳�
	public Bbb(){
		a++;
		//reate_1=reate+1;
	}
	/*public void sendMes(){
		System.out.println("������Ϣ")
	}*/
}
