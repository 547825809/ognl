package ognl;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.junit.Assert;
import org.junit.Test;


public class OgnlTest {

    private void test(String expressionString, String expected) throws OgnlException {
        Action action = new Action();
        Object expr = Ognl.parseExpression(expressionString);
        OgnlContext ctx = new OgnlContext();
        Object value = Ognl.getValue(expr, ctx, action);
        assertNotNull(value);
        Assert.assertTrue(value.toString().contains(expected));
    }

    @Test
    public void test1() {
        try {
            test("yTypeList.values()", "invalid yTypeList a");
        } catch (OgnlException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void test2() {
        try {
            test("ytypeList.values()", "standard javabean ytypeList-a1");
        } catch (OgnlException e) {
            fail(e.getMessage());
        }
    }

    @Test
    public void test3() {
        try {
            test("sampleList.values()", "sample-a1");
        } catch (OgnlException e) {
            fail(e.getMessage());
        }
    }
}
