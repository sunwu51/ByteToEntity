package top.microfrank.Util;

public class ByteConvertImpl implements ByteConvert{
    // 以下 是整型数 和 网络字节序的  byte[] 数组之间的转换
    public  byte[] longToBytes(long n) {
        byte[] b = new byte[8];
        b[7] = (byte) (n & 0xff);
        b[6] = (byte) (n >> 8 & 0xff);
        b[5] = (byte) (n >> 16 & 0xff);
        b[4] = (byte) (n >> 24 & 0xff);
        b[3] = (byte) (n >> 32 & 0xff);
        b[2] = (byte) (n >> 40 & 0xff);
        b[1] = (byte) (n >> 48 & 0xff);
        b[0] = (byte) (n >> 56 & 0xff);
        return b;
    }

    public  void longToBytes(long n, byte[] array, int offset) {
        array[7 + offset] = (byte) (n & 0xff);
        array[6 + offset] = (byte) (n >> 8 & 0xff);
        array[5 + offset] = (byte) (n >> 16 & 0xff);
        array[4 + offset] = (byte) (n >> 24 & 0xff);
        array[3 + offset] = (byte) (n >> 32 & 0xff);
        array[2 + offset] = (byte) (n >> 40 & 0xff);
        array[1 + offset] = (byte) (n >> 48 & 0xff);
        array[0 + offset] = (byte) (n >> 56 & 0xff);
    }

    public  long bytesToLong(byte[] array) {
        return ((((long) array[0] & 0xff) << 56)
                | (((long) array[1] & 0xff) << 48)
                | (((long) array[2] & 0xff) << 40)
                | (((long) array[3] & 0xff) << 32)
                | (((long) array[4] & 0xff) << 24)
                | (((long) array[5] & 0xff) << 16)
                | (((long) array[6] & 0xff) << 8)
                | (((long) array[7] & 0xff) << 0));
    }

    public  long bytesToLong(byte[] array, int offset) {
        return ((((long) array[offset + 0] & 0xff) << 56)
                | (((long) array[offset + 1] & 0xff) << 48)
                | (((long) array[offset + 2] & 0xff) << 40)
                | (((long) array[offset + 3] & 0xff) << 32)
                | (((long) array[offset + 4] & 0xff) << 24)
                | (((long) array[offset + 5] & 0xff) << 16)
                | (((long) array[offset + 6] & 0xff) << 8)
                | (((long) array[offset + 7] & 0xff) << 0));
    }

    public  byte[] intToBytes(int n) {
        byte[] b = new byte[4];
        b[3] = (byte) (n & 0xff);
        b[2] = (byte) (n >> 8 & 0xff);
        b[1] = (byte) (n >> 16 & 0xff);
        b[0] = (byte) (n >> 24 & 0xff);
        return b;
    }

    public  void intToBytes(int n, byte[] array, int offset) {
        array[3 + offset] = (byte) (n & 0xff);
        array[2 + offset] = (byte) (n >> 8 & 0xff);
        array[1 + offset] = (byte) (n >> 16 & 0xff);
        array[offset] = (byte) (n >> 24 & 0xff);
    }

    public  int bytesToInt(byte b[]) {
        return b[3] & 0xff
                | (b[2] & 0xff) << 8
                | (b[1] & 0xff) << 16
                | (b[0] & 0xff) << 24;
    }

    public  int bytesToInt(byte b[], int offset) {
        return b[offset + 3] & 0xff
                | (b[offset + 2] & 0xff) << 8
                | (b[offset + 1] & 0xff) << 16
                | (b[offset] & 0xff) << 24;
    }

    public  byte[] uintToBytes(long n) {
        byte[] b = new byte[4];
        b[3] = (byte) (n & 0xff);
        b[2] = (byte) (n >> 8 & 0xff);
        b[1] = (byte) (n >> 16 & 0xff);
        b[0] = (byte) (n >> 24 & 0xff);

        return b;
    }

    public  void uintToBytes(long n, byte[] array, int offset) {
        array[3 + offset] = (byte) (n);
        array[2 + offset] = (byte) (n >> 8 & 0xff);
        array[1 + offset] = (byte) (n >> 16 & 0xff);
        array[offset] = (byte) (n >> 24 & 0xff);
    }

    public  long bytesToUint(byte[] array) {
        return ((long) (array[3] & 0xff))
                | ((long) (array[2] & 0xff)) << 8
                | ((long) (array[1] & 0xff)) << 16
                | ((long) (array[0] & 0xff)) << 24;
    }

    public  long bytesToUint(byte[] array, int offset) {
        return ((long) (array[offset + 3] & 0xff))
                | ((long) (array[offset + 2] & 0xff)) << 8
                | ((long) (array[offset + 1] & 0xff)) << 16
                | ((long) (array[offset] & 0xff)) << 24;
    }

    public  byte[] shortToBytes(short n) {
        byte[] b = new byte[2];
        b[1] = (byte) (n & 0xff);
        b[0] = (byte) ((n >> 8) & 0xff);
        return b;
    }

    public  void shortToBytes(short n, byte[] array, int offset) {
        array[offset + 1] = (byte) (n & 0xff);
        array[offset] = (byte) ((n >> 8) & 0xff);
    }

    public  short bytesToShort(byte[] b) {
        return (short) (b[1] & 0xff
                | (b[0] & 0xff) << 8);
    }

    public  short bytesToShort(byte[] b, int offset) {
        return (short) (b[offset + 1] & 0xff
                | (b[offset] & 0xff) << 8);
    }

    public  byte[] ushortToBytes(int n) {
        byte[] b = new byte[2];
        b[1] = (byte) (n & 0xff);
        b[0] = (byte) ((n >> 8) & 0xff);
        return b;
    }

    public  void ushortToBytes(int n, byte[] array, int offset) {
        array[offset + 1] = (byte) (n & 0xff);
        array[offset] = (byte) ((n >> 8) & 0xff);
    }

    public  int bytesToUshort(byte b[]) {
        return b[1] & 0xff
                | (b[0] & 0xff) << 8;
    }

    public  int bytesToUshort(byte b[], int offset) {
        return b[offset + 1] & 0xff
                | (b[offset] & 0xff) << 8;
    }

    public  byte[] ubyteToBytes(int n) {
        byte[] b = new byte[1];
        b[0] = (byte) (n & 0xff);
        return b;
    }

    public  void ubyteToBytes(int n, byte[] array, int offset) {
        array[0] = (byte) (n & 0xff);
    }

    public  int bytesToUbyte(byte[] array) {
        return array[0] & 0xff;
    }

    public  int bytesToUbyte(byte[] array, int offset) {
        return array[offset] & 0xff;
    }
    // char 类型、 float、double 类型和 byte[] 数组之间的转换关系还需继续研究实现。
    public  float bytesToFloat(byte[] b, int offset) {
        int l;
        l = b[offset + 0];
        l &= 0xff;
        l |= ((long) b[offset + 1] << 8);
        l &= 0xffff;
        l |= ((long) b[offset + 2] << 16);
        l &= 0xffffff;
        l |= ((long) b[offset + 3] << 24);
        return Float.intBitsToFloat(l);
    }
    public  double bytesToDouble(byte[] arr,int offset) {
        long value = 0;
        for (int i = offset; i < offset+8; i++) {
            value |= ((long) (arr[i] & 0xff)) << (8 * i);
        }
        return Double.longBitsToDouble(value);
    }
    public  String bytesToHex(byte[] buf,int start,int length)
    {
        String res="";
        for(int i=start;i<start+length;i++)
        {
            int a=buf[i]>=0?buf[i]:256+buf[i];
            res+=lpad(2,Integer.toHexString(a));
        }
        return res;
    }
    public  String lpad(int length, String number)
    {
        if(number.length()>=length)
            return number;
        else
        {
            return "0"+number;
        }
    }
    public  int get(int num, int index) {
        return (num & (0x1 << index)) >> index;
    }
}