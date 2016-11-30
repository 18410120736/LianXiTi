package com.bwie.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class TestDemo {
	// 文件所在的层数
	private int fileLevel;
	static int k = 0; // 标号，报数到三

	static int life = 5; // 多少个生存的人

	static Person[] person = new Person[life];


	public static void main(String[] args) {

		// 题目一
		try {
			TestDemo te = new TestDemo();
			String dirPath = "D:\\音乐";
			FileWriter fileWriter = new FileWriter("D://wenjian.txt");
			BufferedWriter writer = new BufferedWriter(fileWriter);
			te.printDir(dirPath, writer);
			te.readFile(dirPath, writer);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/* 创建缓冲区 */
		System.out.println("------------------------------");
		// 题目二
		timu2();
		System.out.println("------------------------------");
		// 题目三
		timu3();
		System.out.println("------------------------------");
		// 题目四
		timu4();
		System.out.println("------------------------------");
		// 题目四
		he();
		System.out.println("------------------------------");
		for (int i = 10000; i <= 99999; i++) {

			if (huiwenshu(i)) {
				System.out.println(i);
			}
		}
		System.out.println("------------------------------");
		sanjiaoxing();
		System.out.println("------------------------------");
		zifuchuan();
		System.out.println("------------------------------");
		paihao();
		System.out.println("------------------------------");
		sushu();

	}
	private static boolean huiwenshu(int n) {
		String num = Integer.toString(n);
		int len = num.length();
		int half = len / 2;
		int is = 1;
		for (int i = 0; i < half; i++) {
			if (num.charAt(i) != num.charAt(len - 1 - i)) {
				is = 0;
				break;
			}
		}
		if (is == 1) {
			return true;
		} else {
			return false;
		}

	}

	public static void he() {
		int s = 0;
		int t = 1;
		for (int i = 1; i <= 20; i++) {
			t *= i;
			s += t;
		}
		System.out.println("和为：" + s);
	}

	public static void sanjiaoxing() {

		int a[][] = new int[10][10];
		for (int i = 0; i < 10; i++)
			// 循环变量赋初值错误，要特别注意，都是低级错误
			for (int j = 0; j <= i; j++) {
				if (j == 0)
					a[i][j] = 1;
				else if (i == j)
					a[i][j] = 1;
				else
					a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
			}
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <= i; j++)
				System.out.println(a[i][j] + "\r\t");
			System.out.println("\r\n");

		}

	}

	public static void zifuchuan() {
		String str = "abcdefabhjlecababcab";
		String str1 = "ab";
		int count = 0;
		int start = 0;
		while (str.indexOf(str1, start) >= 0 && start < str.length()) {
			count++;
			start = str.indexOf(str1, start) + str1.length();
		}
		System.out.println(str1 + "在" + str + "出现的次数为" + count);
	}

	public static void paihao() {
		for (int i = 0; i < life; i++) // 初始化人数
		{
			Person per = new Person();
			per.setId(i + 1);

			person[i] = per;

		}

		while (life > 1) // 报数
		{
			for (int i = 0; i < life; i++) {
				if (life == 2) // 人数不够标号强制通过，可以继续玩
				{
					k = 2;
				}

				if (k == 2) // 报数到三死一个
				{
					for (int j = i; j < life - 1; j++) {
						person[j] = person[j + 1];
					}

					life--; // 生存的人减少一个

					k = 0; // 重新报数
				}

				k++;
			}
		}

		for (int i = 0; i < life; i++) // 打印活着的人
		{
			System.out.println("最后活下来的人是原" + person[i].getId() + "号人");
		}
	}

	public static void sushu() {
		int i, n, k = 0;
		for (n = 3; n <= 100; n++) { // 3~100的所有数
			i = 2;
			while (i < n) {
				if (n % i == 0)
					break; // 若能整除说明n不是素数，跳出当前循环
				i++;
			}

			if (i == n) { // 如果i==n则说明n不能被2~n-1整除，是素数
				k++; // 统计输出数的个数
				System.out.print(i + "\t ");
				if (k % 6 == 0) // 每输出5个则换行
					System.out.println();
			}
		}
	}

	private static void timu5() {
		// TODO Auto-generated method stub
		
	}

	private static void timu4() {
		// 计数器变量
		int count = 0;

		/*
		 * 利用三重循环组合数字的百、十、个位
		 */

		// 生成百位
		for (int i = 1; i <= 4; i++) {
			// 生成十位
			for (int j = 1; j <= 4; j++) {
				// 生成个位
				for (int k = 1; k <= 4; k++) {

					// 确保i、j、k三位互不相同
					if (i != j && j != k && i != k) {

						// 计数器累加
						++count;
						// 控制台输出当前组合出的三位数
						System.out.println("第" + count + "种组合方式：" + i + "" + j
								+ "" + k);
					}
				}
			}
		}

		// 控制台输出统计信息
		System.out.println(" 共计" + count + "种三位数组合方式。");

	}

	private static void timu3() {
		int[] m = new int[24];
		m[0] = m[1] = 1;
		for (int i = 0; i < 24; i++) {
			if (i == 0 || i == 1) {
				System.out.println("第" + (i + 1) + "个月月兔子数量为:1对\n");
			} else {
				m[i] = m[i - 1] + m[i - 2];
				System.out.println("第" + (i + 1) + "个月月兔子数量为:" + m[i] + "对\n");

			}
		}

	}

	private void readFile(String dirPath, BufferedWriter writer)
			throws IOException {
		// 建立当前目录中文件的File对象
		File file = new File(dirPath);
		// 取得代表目录中所有文件的File对象数组
		File[] list = file.listFiles();
		// 遍历file数组
		for (int i = 0; i < list.length; i++) {
			if (list[i].isDirectory()) {
				System.out
						.println(createPrintStr(list[i].getName(), fileLevel));
				writer.write(createPrintStr(list[i].getName(), fileLevel)
						+ "\r\n");
				fileLevel++;
				// 递归子目录
				readFile(list[i].getPath(), writer);

				fileLevel--;
			} else {
				writer.write(createPrintStr(list[i].getName(), fileLevel));
				System.out.println(createPrintStr(list[i].getName(), fileLevel)
						+ "\r\n");

			}
		}

	}

	private void printDir(String dirPath, BufferedWriter writer)
			throws Exception {
		// 将给定的目录进行分割
		String[] dirNameList = dirPath.split("\\\\");
		// 设定文件level的base
		fileLevel = dirNameList.length;
		// 按格式输出
		for (int i = 0; i < dirNameList.length; i++) {
			System.out.println(createPrintStr(dirNameList[i], i));
			writer.write(createPrintStr(dirNameList[i], fileLevel) + "\r\n");
		}

	}

	public String createPrintStr(String name, int level) {
		// 输出的前缀
		String printStr = "";
		// 按层次进行缩进
		for (int i = 0; i < level; i++) {
			printStr = printStr + "  ";
		}
		printStr = printStr + "- " + name;
		return printStr;
	}

	public static void timu2() {
		String str = "中国ren zuiAiang ,Soai.12,ai459啦。  aa88a? aaA一二深什么AAAA%*&&";
		String E1 = "[\u4e00-\u9fa5]";// 中文
		String E2 = "[A-Z]";// 大写英文
		String E3 = "[a-z]";// 小写英文
		String E4 = "[0-9]";// 数字
		String E5 = " ";
		int chineseCount = 0;
		int englishCount = 0;
		int xiaoxiexieCount = 0;
		int numberCount = 0;
		int konggecount = 0;
		String temp;
		for (int i = 0; i < str.length(); i++) {
			temp = String.valueOf(str.charAt(i));
			if (temp.matches(E1)) {
				chineseCount++;
			}
			if (temp.matches(E2)) {
				englishCount++;
			}
			if (temp.matches(E3)) {
				xiaoxiexieCount++;
			}
			if (temp.matches(E4)) {
				numberCount++;
			}
			if (temp.matches(E5)) {
				konggecount++;
			}
		}
		System.out.println("汉字数:" + chineseCount);
		System.out.println("大写英文数:" + englishCount);
		System.out.println("小写英文数:" + xiaoxiexieCount);
		System.out.println("数字数:" + numberCount);
		System.out.println("空格数:" + konggecount);
		System.out.println("特殊字符:"
				+ (str.length() - (chineseCount + englishCount + numberCount
						+ konggecount + xiaoxiexieCount)));
	}

}
