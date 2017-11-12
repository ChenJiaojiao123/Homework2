/**
 *@ClassName:Graduate
 *@Description:
 *@author Chenjiao
 *@date:2017年11月11日
 */
public class Graduate implements StudentManageInterface,TeacherManageInterface{
		public String name;
		public String sex;
		public int age;
		public double fee;
		public double pay;
		public Graduate(String name1)        //构造函数
		{
			name=name1;
		}
		public double setFee(double fee2)    //设置每学期学费
		{
			fee=fee2;
			return fee;
		}
		public double getFee(int num2)       //获取总学费
		{
			return fee*num2;				 //总学费=每学期学费*学期数
		}
		public double setPay(double pay2)	 //设置月工资
		{
			pay=pay2;
			return pay;
		}
		public double getPay(int month2)      //获取总收入
		{
			return pay*month2;				  //总收入=月工资*月数
		}
		public static void main(String[] args)
		{
			Graduate graduate=new Graduate("zhangsan");
			graduate.setFee(4500);
			graduate.setPay(3000);
			if(graduate.getPay(3)-graduate.getFee(2)<2000)    //如果总收入-总学费<2000,则需要贷款
				System.out.println("provide a loan");
			else
				System.out.println("不需要贷款");	
		}
	}
