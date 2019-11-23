/**
 * StringBuffer
 */
public class StringBufferDemo {

    private static final int ITTERATION = 1000000;
    private static final int BUFFSIZE = 16;

    private void concatString(){
        System.out.print("Concat string = ");
        long startTime = System.currentTimeMillis();
        String concat = "";

        for (int i = 0; i < ITTERATION; i++) {
            concat += i % 10;
        }
        long endTime = System.currentTimeMillis();
        System.out.print("length : "+ concat.length());
        System.out.print(" time : \n" + (endTime - startTime));
    }

    private void concatBuffered(){
        System.out.print("Concat buffered = ");
        long startTime = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < ITTERATION; i++) {
            stringBuffer.append(i % 10);
        }

        long endTime = System.currentTimeMillis();
        System.out.print("length : "+ stringBuffer.length());
        System.out.print(" time : " + (endTime - startTime));

    }

    public static void main(String[] args) {
            StringBufferDemo stringBufferDemo = new StringBufferDemo();

            // concat menggunakan StringBuffer lebih cepat dibandingkan dengan menggunakan cara biasa atau increment
            stringBufferDemo.concatString();
            stringBufferDemo.concatBuffered();
    }

}