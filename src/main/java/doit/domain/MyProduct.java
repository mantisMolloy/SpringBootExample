package doit.domain;


import java.util.ArrayList;
import java.util.List;

/**
 * Created by tmolloy on 03/10/2015.
 */
public class MyProduct {

    private String field1;
    private String field2;
    private List<MyProductChild> children;

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public List<MyProductChild> getChildren() {
        if(children == null) {
            children = new ArrayList<MyProductChild>();
        }
        return children;
    }

    public void setChildren(List<MyProductChild> children) {
        this.children = children;
    }
}