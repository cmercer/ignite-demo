package com.mirrorlakesoftware.app.test;

import com.mirrorlakesoftware.ignite.test.AbstractTestCase;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 *
 */
public class BaseTestCase extends AbstractTestCase {

  @Test
  public void alwaysWorksTest() {
    assertThat(true).isTrue();
  }
}
