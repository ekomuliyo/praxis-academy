import java.lang.StringBuilder;

/**
 * Ini adalah program sederhana merepresentasikan sebuah binary
 * 
 * @author Eko Muliyo
 * 
*/
public class BinaryRepresentation {

    public static void main(String[] args) {
        System.out.println(printBinary(21.1));
    }

    /**
     * 
     * @param num nilai double 
     * @return mengembalikan nilai apakah binary atau bukan
     */
	public static String printBinary(double num) {

		if(num >= 1 || num <= 0) {
			return "ERROR";
		}

		StringBuilder binary = new StringBuilder();
		binary.append(".");
		while(num > 0) {
			/* membatasi angka num tidak lebih dari 32 */
			if(binary.length() >= 32) {
				return "ERROR";
			}

			double r = num * 2;
			if(r >= 1) {
				binary.append(1);
				num = r - 1;
			}
			else {
				binary.append(0);
				num = r;
			}
		}
		return binary.toString();
    }

}