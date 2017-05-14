package top.microfrank.Util;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Frank Local on 2017/5/15.
 */
public class ConverterTest {
    @Test
    public void bytesToEntity() throws Exception {
        DianData dd = new Converter(new ByteConvertImpl()).bytesToEntity(new DianData(),new byte[]{0x54,0x01,0x01,0x34});
        System.out.print(dd);
    }
}

class DianData{
    @Rule(start=0,type= RuleType.UINT8)
    private double Did;

    @Rule(start = 0,type = RuleType.INT32)
    private int Current;

    @Rule(start=0,type = RuleType.FLOAT)
    public float Vers;

    @Rule(start=2,length = 2,type= RuleType.HEX)
    public String Cid;
}