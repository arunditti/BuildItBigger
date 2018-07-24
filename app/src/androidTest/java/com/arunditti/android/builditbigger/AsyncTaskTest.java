package com.arunditti.android.builditbigger;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.core.IsNot.not;

/**
 * Created by arunditti on 7/23/18.
 */
@RunWith(AndroidJUnit4.class)
public class AsyncTaskTest {

    public  static final String EMPTY_STRING = "";
    @Rule
    public ActivityTestRule<MainActivity> mainActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void tellJokeClickTest() {
        onView(withId(R.id.button_joke_teller)).perform(click());
        onView(withId(R.id.tv_joke)).check(matches(not(withText(EMPTY_STRING))));
    }
}
