package com.lambdaschool.unittestcodechallenges;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;

import androidx.test.espresso.Espresso;
import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.action.ViewActions;
import androidx.test.espresso.assertion.ViewAssertions;
import androidx.test.espresso.matcher.ViewMatchers;
import androidx.test.rule.ActivityTestRule;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Before public void setUp() {

    }

    @Test public void shouldReverseInputString() {
        // setup
        final ViewInteraction inputView = Espresso.onView(ViewMatchers.withId(R.id.input_text));
        inputView.perform(ViewActions.typeText("Hello World"));

        // execute
        onView(withId(R.id.submit_button)).perform(click());

        // check
        final ViewInteraction outputView = onView(withId(R.id.output_text));
        outputView.check(ViewAssertions.matches(ViewMatchers.withText("dlroW olleH")));

    }

    @Test public void shouldReverseInputStringSHORT() {
        // setup
        onView(withId(R.id.input_text)).perform(typeText("Hello World"));

        // execute
        onView(withId(R.id.submit_button)).perform(click());

        // check
        onView(withId(R.id.output_text)).check(matches(withText("dlroW olleH")));

    }
}