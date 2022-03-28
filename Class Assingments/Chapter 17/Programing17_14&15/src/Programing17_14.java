import java.io.*;
import java.util.Scanner;

public class Programing17_14 {
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter Input File name:");
		String in = input.nextLine();
		System.out.println("Enter Output File name:");
		String out = input.nextLine();
		try(RandomAccessFile inp = new RandomAccessFile(in, "r");
			RandomAccessFile outp = new RandomAccessFile(out, "rw");){
			
			
			try(DataInputStream i = new DataInputStream(new BufferedInputStream(new FileInputStream(in)));
				DataOutputStream o = new DataOutputStream(new BufferedOutputStream(new FileOutputStream(out)));){
				
				while(true){
					o.writeInt(i.readInt());
					}
			}
			catch(EOFException ex) {
				System.out.println("\nAll data transfered");
				
			}
			int r;
			inp.seek(0);
			while((r = inp.read()) != -1) {
				outp.write((r) + 5);
			}
		}
		
	}
	
}
