/**
 *@ClassName:Graduate
 *@Description:
 *@author Chenjiao
 *@date:2017��11��11��
 */
public class Graduate implements StudentManageInterface,TeacherManageInterface{
		public String name;
		public String sex;
		public int age;
		public double fee;
		public double pay;
		public Graduate(String name1)        //���캯��
		{
			name=name1;
		}
		public double setFee(double fee2)    //����ÿѧ��ѧ��
		{
			fee=fee2;
			return fee;
		}
		public double getFee(int num2)       //��ȡ��ѧ��
		{
			return fee*num2;				 //��ѧ��=ÿѧ��ѧ��*ѧ����
		}
		public double setPay(double pay2)	 //�����¹���
		{
			pay=pay2;
			return pay;
		}
		public double getPay(int month2)      //��ȡ������
		{
			return pay*month2;				  //������=�¹���*����
		}
		public static void main(String[] args)
		{
			Graduate graduate=new Graduate("zhangsan");
			graduate.setFee(4500);
			graduate.setPay(3000);
			if(graduate.getPay(3)-graduate.getFee(2)<2000)    //���������-��ѧ��<2000,����Ҫ����
				System.out.println("provide a loan");
			else
				System.out.println("����Ҫ����");	
		}
	}
