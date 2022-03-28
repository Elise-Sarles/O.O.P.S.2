import java.io.*;
import java.util.Scanner;

public class Programing17_15 {
	public static void main(String[] args) throws IOException{
Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Input File name:");
		String in = input.nextLine();
		System.out.println("Enter Output File name:");
		String out = input.nextLine();
		try (RandomAccessFile inp = new RandomAccessFile(in, "r");
				RandomAccessFile outp = new RandomAccessFile(out, "rw");)
		{
			int r;
			inp.seek(0);
			while((r = inp.read())!= -1) {
				outp.writeInt((r) - 5);
			}
		}
	}
}
