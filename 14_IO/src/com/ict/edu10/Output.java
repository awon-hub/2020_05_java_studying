package com.ict.edu10;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Output {
	public static void main(String[] args) {

		String pathname = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io13.txt";
		File file = new File(pathname);

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;

		Scanner sc = new Scanner(System.in);

		try {

			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);

			ArrayList<VO> list = new ArrayList<VO>();
			while (true) {
				System.out.println("이름:");
				String name = sc.next();
				System.out.println("국어점수:");
				int kor = sc.nextInt();
				System.out.println("영어점수:");
				int eng = sc.nextInt();
				System.out.println("수학점수:");
				int math = sc.nextInt();

				VO vo = new VO(name, kor, eng, math);
				list.add(vo);
				oos.writeObject(list);
				oos.flush();
				
				System.out.println("계속하시겠습니까? y / n ");
				char res = (char) sc.nextInt();

				switch (res) {
				case 'N': break;
				case 'n': break;
				}

			}

			
		} catch (Exception e) {
			// TODO: handle exception
		} finally {
			try {
				oos.close();
				bos.close();
				fos.close();

			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

	}
}