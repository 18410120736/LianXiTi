package com.bwie.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class TestDemo {
	// �ļ����ڵĲ���
	private int fileLevel;
	static int k = 0; // ��ţ���������

	static int life = 5; // ���ٸ��������

	static Person[] person = new Person[life];


	public static void main(String[] args) {

		// ��Ŀһ
		try {
			TestDemo te = new TestDemo();
			String dirPath = "D:\\����";
			FileWriter fileWriter = new FileWriter("D://wenjian.txt");
			BufferedWriter writer = new BufferedWriter(fileWriter);
			te.printDir(dirPath, writer);
			te.readFile(dirPath, writer);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		/* ���������� */
		System.out.println("------------------------------");
		// ��Ŀ��
		timu2();
		System.out.println("------------------------------");
		// ��Ŀ��
		timu3();
		System.out.println("------------------------------");
		// ��Ŀ��
		timu4();
		System.out.println("------------------------------");
		// ��Ŀ��
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
		System.out.println("��Ϊ��" + s);
	}

	public static void sanjiaoxing() {

		int a[][] = new int[10][10];
		for (int i = 0; i < 10; i++)
			// ѭ����������ֵ����Ҫ�ر�ע�⣬���ǵͼ�����
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
		System.out.println(str1 + "��" + str + "���ֵĴ���Ϊ" + count);
	}

	public static void paihao() {
		for (int i = 0; i < life; i++) // ��ʼ������
		{
			Person per = new Person();
			per.setId(i + 1);

			person[i] = per;

		}

		while (life > 1) // ����
		{
			for (int i = 0; i < life; i++) {
				if (life == 2) // �����������ǿ��ͨ�������Լ�����
				{
					k = 2;
				}

				if (k == 2) // ����������һ��
				{
					for (int j = i; j < life - 1; j++) {
						person[j] = person[j + 1];
					}

					life--; // ������˼���һ��

					k = 0; // ���±���
				}

				k++;
			}
		}

		for (int i = 0; i < life; i++) // ��ӡ���ŵ���
		{
			System.out.println("��������������ԭ" + person[i].getId() + "����");
		}
	}

	public static void sushu() {
		int i, n, k = 0;
		for (n = 3; n <= 100; n++) { // 3~100��������
			i = 2;
			while (i < n) {
				if (n % i == 0)
					break; // ��������˵��n����������������ǰѭ��
				i++;
			}

			if (i == n) { // ���i==n��˵��n���ܱ�2~n-1������������
				k++; // ͳ��������ĸ���
				System.out.print(i + "\t ");
				if (k % 6 == 0) // ÿ���5������
					System.out.println();
			}
		}
	}

	private static void timu5() {
		// TODO Auto-generated method stub
		
	}

	private static void timu4() {
		// ����������
		int count = 0;

		/*
		 * ��������ѭ��������ֵİ١�ʮ����λ
		 */

		// ���ɰ�λ
		for (int i = 1; i <= 4; i++) {
			// ����ʮλ
			for (int j = 1; j <= 4; j++) {
				// ���ɸ�λ
				for (int k = 1; k <= 4; k++) {

					// ȷ��i��j��k��λ������ͬ
					if (i != j && j != k && i != k) {

						// �������ۼ�
						++count;
						// ����̨�����ǰ��ϳ�����λ��
						System.out.println("��" + count + "����Ϸ�ʽ��" + i + "" + j
								+ "" + k);
					}
				}
			}
		}

		// ����̨���ͳ����Ϣ
		System.out.println(" ����" + count + "����λ����Ϸ�ʽ��");

	}

	private static void timu3() {
		int[] m = new int[24];
		m[0] = m[1] = 1;
		for (int i = 0; i < 24; i++) {
			if (i == 0 || i == 1) {
				System.out.println("��" + (i + 1) + "��������������Ϊ:1��\n");
			} else {
				m[i] = m[i - 1] + m[i - 2];
				System.out.println("��" + (i + 1) + "��������������Ϊ:" + m[i] + "��\n");

			}
		}

	}

	private void readFile(String dirPath, BufferedWriter writer)
			throws IOException {
		// ������ǰĿ¼���ļ���File����
		File file = new File(dirPath);
		// ȡ�ô���Ŀ¼�������ļ���File��������
		File[] list = file.listFiles();
		// ����file����
		for (int i = 0; i < list.length; i++) {
			if (list[i].isDirectory()) {
				System.out
						.println(createPrintStr(list[i].getName(), fileLevel));
				writer.write(createPrintStr(list[i].getName(), fileLevel)
						+ "\r\n");
				fileLevel++;
				// �ݹ���Ŀ¼
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
		// ��������Ŀ¼���зָ�
		String[] dirNameList = dirPath.split("\\\\");
		// �趨�ļ�level��base
		fileLevel = dirNameList.length;
		// ����ʽ���
		for (int i = 0; i < dirNameList.length; i++) {
			System.out.println(createPrintStr(dirNameList[i], i));
			writer.write(createPrintStr(dirNameList[i], fileLevel) + "\r\n");
		}

	}

	public String createPrintStr(String name, int level) {
		// �����ǰ׺
		String printStr = "";
		// ����ν�������
		for (int i = 0; i < level; i++) {
			printStr = printStr + "  ";
		}
		printStr = printStr + "- " + name;
		return printStr;
	}

	public static void timu2() {
		String str = "�й�ren zuiAiang ,Soai.12,ai459����  aa88a? aaAһ����ʲôAAAA%*&&";
		String E1 = "[\u4e00-\u9fa5]";// ����
		String E2 = "[A-Z]";// ��дӢ��
		String E3 = "[a-z]";// СдӢ��
		String E4 = "[0-9]";// ����
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
		System.out.println("������:" + chineseCount);
		System.out.println("��дӢ����:" + englishCount);
		System.out.println("СдӢ����:" + xiaoxiexieCount);
		System.out.println("������:" + numberCount);
		System.out.println("�ո���:" + konggecount);
		System.out.println("�����ַ�:"
				+ (str.length() - (chineseCount + englishCount + numberCount
						+ konggecount + xiaoxiexieCount)));
	}

}
