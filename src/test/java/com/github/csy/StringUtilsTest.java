package com.github.csy;

import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class StringUtilsTest {

    StringUtils stringUtils;


    @Before
    public void setUp() throws Exception {
        stringUtils = new StringUtils("XXX");
    }

    @Test
    public void should_input_empty_is_empty() {
        assertThat(stringUtils.isEmpty("")).isTrue();
    }

    @Test
    public void should_input_value_is_not_empty() {
        assertThat(stringUtils.isEmpty("csy")).isFalse();
    }

    @Test
    public void should_input_null_is_empty() {
        assertThat(stringUtils.isEmpty(null)).isTrue();
    }

    @Test
    public void should_input_null_is_blank() {
        assertThat(stringUtils.isBlank(null)).isTrue();
    }

    @Test
    public void should_input_empty_is_blank() {
        assertThat(stringUtils.isBlank("")).isTrue();
    }

    @Test
    public void should_input_value_is_not_blank() {
        assertThat(stringUtils.isBlank("csy")).isFalse();
    }
    @Test
    public void should_input_space_is_blank() {
        assertThat(stringUtils.isBlank("    ")).isTrue();
    }

    @Test
    public void should_input_empty_is_not_alpha() {
        assertThat(stringUtils.isAlpha("")).isFalse();
    }

    @Test
    public void should_input_value_is_not_alpha() {
        assertThat(stringUtils.isAlpha("csy")).isTrue();
    }

    @Test
    public void should_input_number_is_not_alpha() {
        assertThat(stringUtils.isAlpha("1234")).isFalse();
    }
}