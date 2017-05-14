package top.microfrank.Util;

import java.util.Arrays;

/**
 * Created by Frank Local on 2017/5/15.
 */
public class Converter {
    private ByteConvert byteConvert;
    public Converter(ByteConvert byteConvert){
        this.byteConvert=byteConvert;
    }

    public <T> T bytesToEntity(T t,byte[] buf)throws Exception{
        Class claz=t.getClass();
        Arrays.asList(claz.getDeclaredFields()).forEach(
                field->{
                    if(field.isAnnotationPresent(Rule.class)){
                        field.setAccessible(true);
                        int start=field.getAnnotation(Rule.class).start();
                        int length=field.getAnnotation(Rule.class).length();
                        RuleType ruleType=field.getAnnotation(Rule.class).type();
                        switch (ruleType){
                            case UINT8:
                                try {
                                    field.set(t,(int)buf[start]);
                                } catch (IllegalAccessException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case UINT16:
                                try {
                                    field.set(t,byteConvert.bytesToUshort(buf,start));
                                } catch (IllegalAccessException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case UINT32:
                                try {
                                    field.set(t,byteConvert.bytesToUint(buf,start));
                                } catch (IllegalAccessException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case INT16:
                                try {
                                    field.set(t,byteConvert.bytesToShort(buf,start));
                                } catch (IllegalAccessException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case INT32:
                                try {
                                    field.set(t,byteConvert.bytesToInt(buf,start));
                                } catch (IllegalAccessException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case LONG:
                                try {
                                    field.set(t,byteConvert.bytesToLong(buf,start));
                                } catch (IllegalAccessException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case FLOAT:
                                try {
                                    field.set(t,byteConvert.bytesToFloat(buf,start));
                                } catch (IllegalAccessException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case DOUBLE:
                                try {
                                    field.set(t,byteConvert.bytesToDouble(buf,start));
                                } catch (IllegalAccessException e) {
                                    e.printStackTrace();
                                }
                                break;
                            case HEX:
                                try {
                                    field.set(t,byteConvert.bytesToHex(buf,start,length));
                                } catch (IllegalAccessException e) {
                                    e.printStackTrace();
                                }
                                break;
                        }
                    }
                }
        );
        return t;
    }
}
