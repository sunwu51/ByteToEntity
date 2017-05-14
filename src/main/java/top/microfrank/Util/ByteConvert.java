package top.microfrank.Util;

/**
 * Created by Frank Local on 2017/5/15.
 */
public interface ByteConvert {
    int bytesToUshort(byte[] buf, int offset);
    short bytesToShort(byte[] buf, int offset);
    long bytesToUint(byte[] buf, int offset);
    int bytesToInt(byte[] buf, int offset);
    long bytesToLong(byte[] buf, int offset);
    double bytesToDouble(byte[] buf, int offset);
    float bytesToFloat(byte[] buf, int offset);
    String bytesToHex(byte[] buf, int offset, int length);
}
