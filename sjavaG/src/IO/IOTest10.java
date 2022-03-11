package IO;

import java.io.*;
/*

    数据流专属
    java.io.DataInputStream
    java.io.DataOutputStream
 */
public class IOTest10 {
    public static void main(String[] args) throws IOException {
//        DataInputStream dis = new DataInputStream();
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/1IOFileTest/Test5"));

        byte b = 120;
        short s = 6552;
        int i = 124748;
        long l = 13124214L;

        float f = 3.14F;
        double d = 3.1415956;

        boolean bl = true;
        char c = '中';

        dos.writeByte(b);
        dos.writeShort(s);
        dos.writeInt(i);
        dos.writeLong(l);
        dos.writeFloat(f);
        dos.writeDouble(d);
        dos.writeBoolean(bl);
        dos.writeChar(c);

        DataInputStream dis = new DataInputStream(new FileInputStream("src/1IOFileTest/Test5"));

        byte bb = dis.readByte();
        short ss = dis.readShort();
        int ii = dis.readInt();
        long ll = dis.readLong();
        float ff = dis.readFloat();
        double dd = dis.readDouble();
        boolean bbl = dis.readBoolean();
        char cc = dis.readChar();

        System.out.println(bb);
        System.out.println(ss);
        System.out.println(ii);
        System.out.println(ll + 1890);
    }
}
