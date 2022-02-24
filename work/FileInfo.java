// package jp03.part07;

import java.io.*;

public class FileInfo{

	public static void main(String[] args){

		System.out.println("파일 이름을 넣으세요");

		String name="";

		try{
			BufferedReader in=
				new BufferedReader(new InputStreamReader(System.in));
			name=in.readLine();
		}catch(Exception e){

