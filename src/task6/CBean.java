package task6;

import java.io.Serializable;

public class CBean implements Serializable {
    private String Value1 = null;
    private String Value2 = null;
    private String Value3 = null;

    public CBean (){};
    public String getValue1() {
        return Value1;
    }

    public String getValue2() {
        return Value2;
    }

    public String getValue3() {
        return Value3;
    }

    public void setValue1(String value1) {
        Value1 = value1;
    }

    public void setValue2(String value2) {
        Value2 = value2;
    }

    public void setValue3(String value3) {
        Value3 = value3;
    }
}
