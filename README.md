# BytesToEntity
We always encounter such a situation:**data from hardware is**`byte[]`,**but we need a** `class` **in coding**.
So that we can transform the Object to json or xml and send it to other place such as WEB.
## usage
First create a class,Second set a `Rule` Annotation on the filed.Just like this:
```java
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
```
And then
```java
DianData dd = new Converter(new ByteConvertImpl()).bytesToEntity(new DianData(),new byte[]{0x54,0x01,0x01,0x34});
```
`dd` is the Object we expect.
## remind
1.When the field is not Hex(String),the length of Rule is ignored.Although you set it,it's not useful.<br>
2.If you have another method to get the value.For example the high and low of data is the opposite of that I show.You
can implement the ByteConvert interface.And inject the constructor of Converter.

# 中文简述
我们总是遇到这样的情况：**来自硬件的数据是**`byte []`，**但是我们在编码**中需要一个**`class` **。
这样我们可以将Object转换为json或xml，并将其发送到其他地方，如WEB。
## 用法
## 注意
1.当字段不是Hex（String）时，Rule的长度被忽略。即使你设置了它，也没有用。<br>
2.如果你有另一种方法来转换。例如，数据的高低是与我的相反。你
可以实现ByteConvert接口。并注入Converter的构造函数。

