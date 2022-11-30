package xyz.lglg.utils;

import org.junit.Test;
import xyz.lglg.packagemvn.utils.CollectionUtil;
import xyz.lglg.packagemvn.utils.NumberUtil;
import xyz.lglg.packagemvn.utils.StringUtil;

/**
 * @author jay.li
 * @Title: UtilsTest
 * @Package xyz.lglg.utils
 * @Description:
 * @date 2022/11/24
 */

public class UtilsTest {

    @Test
    public void testString() {
        StringUtil.test();
    }

    @Test
    public void testNumber() {
        NumberUtil.test();
    }

    @Test
    public void testCollection() {
        CollectionUtil.test();
    }
}
