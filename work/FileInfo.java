// package jp03.part07;

import java.io.*;

public class FileInfo{

	public static void main(String[] args){

		System.out.println("���� �̸��� ��������");

		String name="";

		try{
			BufferedReader in=
				new BufferedReader(new InputStreamReader(System.in));
			name=in.readLine();
		}catch(Exception e){

