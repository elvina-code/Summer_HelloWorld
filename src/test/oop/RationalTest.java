package oop;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.*;


import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class RationalTest {
    Rational r = new Rational();

    @Test

    public void testEmptyConstructor() {
        assertThat(r.getNumerator(), is(equalTo(0)));
        assertThat(r.getDenominator(), is(equalTo(1)));
    }

    @Test

    public void testSetter() {
        r.setNumerator(2);
        r.setDenominator(3);
        assertThat(r.getNumerator(), is(equalTo(2)));
        assertThat(r.getDenominator(), is(equalTo(3)));
    }

    @Test

    public void testtoString() {

        r.setNumerator(2);
        r.setDenominator(3);
        assertThat(r.toString(), is(containsString(r.getNumerator() + " / " + r.getDenominator())));

    }

    @Test
    public void testNegate() {
        Rational r2 = new Rational(3, 4);
        r2.negate();
//        assertThat(r2.toString(), is(containsString("-")));
        assertThat(r2.getSign(), is(-1));

        r2.setNumerator(5);
        r2.setDenominator(-9);
        r2.negate();

//        assertThat(r2.toString(), is(not(containsString("-"))));
        assertThat(r2.getSign(), is(1));

    }

    @Test
    public void testGetSign() {
        Rational r3 = new Rational(4, 5);
        assertThat(r3.getSign(), is(1));

        r3.setDenominator(-7);
        assertThat(r3.getSign(), is(-1));

        r3.setDenominator(7);
        r3.setNumerator(-5);
        assertThat(r3.getSign(), is(-1));

        r3.setDenominator(-7);
        r3.setNumerator(-5);
        assertThat(r3.getSign(), is(1));

    }

    @Test
    public void testInvert() {
        Rational number1 = new Rational(5, 6);

        assertThat(number1.getNumerator(), is(5));
        assertThat(number1.getDenominator(), is(6));

        number1.invert();
        assertThat(number1.getNumerator(), is(6));
        assertThat(number1.getDenominator(), is(5));

    }

    @Test
    public void testToDouble() {
        Rational number2 = new Rational(4, 2);
        assertThat(number2.toDouble(), is(2.0));
    }

    @Test
    public void testAddInteger() {
        Rational numberR = new Rational(5, 6);
        numberR.addInteger(1);
        assertThat(numberR.getNumerator(), is(11));
        assertThat(numberR.getDenominator(), is(6));


    }
}
