package one.way;

import org.junit.Assert;
import org.junit.Test;

public class OneWayTest {

  OneWay oneWay = new OneWay();

  @Test
  public void oneRemovalTest() {

    Assert.assertTrue(oneWay.oneEditWay("pale", "ple"));

  }

  @Test
  public void oneInsertionTest() {

    Assert.assertTrue(oneWay.oneEditWay("pale", "pales"));

  }

  @Test
  public void oneReplacementTest() {

    Assert.assertTrue(oneWay.oneEditWay("pale", "bale"));

  }

  @Test
  public void zeroEditTest() {

    Assert.assertTrue(oneWay.oneEditWay("pale", "pale"));

  }

  @Test
  public void moreThenOneEditTest() {

    Assert.assertFalse(oneWay.oneEditWay("pale", "bae"));

  }

}
