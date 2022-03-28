import java.io.*;



public class Programming17_3 {
	public static void main(String[] args) throws FileNotFoundException, IOException, EOFException{
		int count = 0;
		try(DataOutputStream output = new DataOutputStream(new FileOutputStream("Exercise17_03.dat"))){
			for(int i = 0; i < 100; i++) {
				output.writeInt(((int)(Math.random()* 100)));
			}
		}
		try(DataInputStream input = new DataInputStream( new FileInputStream("Exercise17_03.dat"))){
			
			while(true){
				System.out.print(input.readInt() + " ");
				count = input.readInt() + count;
				}
		}
		catch(EOFException ex) {
			System.out.println("\nAll data read");
			
		}
		System.out.println("Sum: " + count);
	}
}
