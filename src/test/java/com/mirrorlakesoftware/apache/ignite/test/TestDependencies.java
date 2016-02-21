package com.mirrorlakesoftware.apache.ignite.test;

import com.sun.org.apache.xpath.internal.operations.String;

import org.junit.Assert;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test to make sure dependencies for testing are setup correctly
 */
public class TestDependencies {

  private final Logger log = LoggerFactory.getLogger(getClass());

  @Test
  public void testJunit() {
    Assert.assertNull("It should be null", null);
  }

  @Test
  public void testAssert4J() {
    assertThat((String) null).isNull();
  }

  @Test
  public void testSlf4J() {
    assertThat(log).isNotNull();
    assertThat(log.isErrorEnabled()).isTrue();
  }
}
