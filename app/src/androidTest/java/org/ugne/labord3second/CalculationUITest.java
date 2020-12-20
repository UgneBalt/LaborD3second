package org.ugne.labord3second;

import android.content.Context;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class CalculationUITest {

    @Rule
    public ActivityScenarioRule rule
            = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void Given_Input55Plus45_Then_EqualsOneHundred() {

        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.buttonPlus)).perform(click());
        onView(withId(R.id.button4)).perform(click());
        onView(withId(R.id.button5)).perform(click());
        onView(withId(R.id.buttonEqual)).perform(click());

        onView(withId(R.id.outputView))
                .check(matches(withText("100.0")));
    }

    @Test
    public void Given_Input12Multiply11_Then_EqualsOneHundredThirtyTwo() {

        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.button2)).perform(click());
        onView(withId(R.id.buttonMultiply)).perform(click());
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.button1)).perform(click());
        onView(withId(R.id.buttonEqual)).perform(click());

        onView(withId(R.id.outputView))
                .check(matches(withText("132.0")));
    }

}