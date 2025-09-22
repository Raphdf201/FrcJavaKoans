package sensei;

import static engine.Assertions.assertKoanMethodIsInvokable;
import static engine.Assertions.assertNextStdOutLineEquals;
import static engine.Assertions.assertNoMoreLineInStdOut;
import engine.Koan;
import static engine.script.Expression.callKoanMethod;
import engine.text.Localizable;
import static engine.text.Localizable.global;
import static engine.text.Localizable.localClass;
import java.util.List;
import static sensei.Texts.*;


public class AboutLoopsKoans {
    private static final Localizable<Class<?>> CLASS =
        localClass(koans.english.AboutLoops.class)
        .fr(koans.french.AboutLoops.class);

    public static final List<Koan> koans = List.of(
        new Koan(CLASS, FIRST_LOOP)
            .useConsole()
            .beforeFirstTest(
                assertKoanMethodIsInvokable("helloNTimes", int.class)
            )
            .when(callKoanMethod("helloNTimes", 2))
            .then(
                assertNextStdOutLineEquals(global("Hello")),
                assertNextStdOutLineEquals(global("Hello")),
                assertNoMoreLineInStdOut()
            )
            .when(callKoanMethod("helloNTimes", 3))
            .then(
                assertNextStdOutLineEquals(global("Hello")),
                assertNextStdOutLineEquals(global("Hello")),
                assertNextStdOutLineEquals(global("Hello")),
                assertNoMoreLineInStdOut()
            )
            .when(callKoanMethod("helloNTimes", 0))
            .then(
                assertNoMoreLineInStdOut()
            ),
        new Koan(CLASS, PRINTING_WHERE_WE_ARE_IN_A_LOOP)
            .useConsole()
            .beforeFirstTest(
                assertKoanMethodIsInvokable("displayNumbers", int.class)
            )
            .when(callKoanMethod("displayNumbers", 2))
            .then(
                assertNextStdOutLineEquals(global("1")),
                assertNextStdOutLineEquals(global("2")),
                assertNoMoreLineInStdOut()
            )
            .when(callKoanMethod("displayNumbers", 3))
            .then(
                assertNextStdOutLineEquals(global("1")),
                assertNextStdOutLineEquals(global("2")),
                assertNextStdOutLineEquals(global("3")),
                assertNoMoreLineInStdOut()
            )
            .when(callKoanMethod("displayNumbers", 1))
            .then(
                assertNextStdOutLineEquals(global("1")),
                assertNoMoreLineInStdOut()
            )
            .when(callKoanMethod("displayNumbers", 0))
            .then(
                assertNoMoreLineInStdOut()
            ),
        new Koan(CLASS, COUNTING_IN_REVERSE)
            .useConsole()
            .beforeFirstTest(
                assertKoanMethodIsInvokable("displayReverseNumbers", int.class)
            )
            .when(callKoanMethod("displayReverseNumbers", 2))
            .then(
                assertNextStdOutLineEquals(global("2")),
                assertNextStdOutLineEquals(global("1")),
                assertNoMoreLineInStdOut()
            )
            .when(callKoanMethod("displayReverseNumbers", 3))
            .then(
                assertNextStdOutLineEquals(global("3")),
                assertNextStdOutLineEquals(global("2")),
                assertNextStdOutLineEquals(global("1")),
                assertNoMoreLineInStdOut()
            )
            .when(callKoanMethod("displayReverseNumbers", 1))
            .then(
                assertNextStdOutLineEquals(global("1")),
                assertNoMoreLineInStdOut()
            )
            .when(callKoanMethod("displayReverseNumbers", 0))
            .then(
                assertNoMoreLineInStdOut()
            ),
        new Koan(CLASS, MULTIPLES_OF_7)
            .useConsole()
            .beforeFirstTest(
                assertKoanMethodIsInvokable("sevens", int.class)
            )
            .when(callKoanMethod("sevens", 30))
            .then(
                assertNextStdOutLineEquals(global("7")),
                assertNextStdOutLineEquals(global("14")),
                assertNextStdOutLineEquals(global("21")),
                assertNextStdOutLineEquals(global("28")),
                assertNoMoreLineInStdOut()
            )
            .when(callKoanMethod("sevens", 28))
            .then(
                assertNextStdOutLineEquals(global("7")),
                assertNextStdOutLineEquals(global("14")),
                assertNextStdOutLineEquals(global("21")),
                assertNextStdOutLineEquals(global("28")),
                assertNoMoreLineInStdOut()
            )
            .when(callKoanMethod("sevens", 6))
            .then(
                assertNoMoreLineInStdOut()
            )
            .when(callKoanMethod("sevens", 7))
            .then(
                assertNextStdOutLineEquals(global("7")),
                assertNoMoreLineInStdOut()
            ),
        new Koan(CLASS, MULTIPLES_OF_7_OR_8)
            .useConsole()
            .beforeFirstTest(
                assertKoanMethodIsInvokable("sevensOrEights", int.class)
            )
            .when(callKoanMethod("sevensOrEights", 20))
            .then(
                assertNextStdOutLineEquals(global("7")),
                assertNextStdOutLineEquals(global("8")),
                assertNextStdOutLineEquals(global("14")),
                assertNextStdOutLineEquals(global("16")),
                assertNoMoreLineInStdOut()
            )
            .when(callKoanMethod("sevensOrEights", 16))
            .then(
                assertNextStdOutLineEquals(global("7")),
                assertNextStdOutLineEquals(global("8")),
                assertNextStdOutLineEquals(global("14")),
                assertNextStdOutLineEquals(global("16")),
                assertNoMoreLineInStdOut()
            )
            .when(callKoanMethod("sevensOrEights", 60))
            .then(
                assertNextStdOutLineEquals(global("7")),
                assertNextStdOutLineEquals(global("8")),
                assertNextStdOutLineEquals(global("14")),
                assertNextStdOutLineEquals(global("16")),
                assertNextStdOutLineEquals(global("21")),
                assertNextStdOutLineEquals(global("24")),
                assertNextStdOutLineEquals(global("28")),
                assertNextStdOutLineEquals(global("32")),
                assertNextStdOutLineEquals(global("35")),
                assertNextStdOutLineEquals(global("40")),
                assertNextStdOutLineEquals(global("42")),
                assertNextStdOutLineEquals(global("48")),
                assertNextStdOutLineEquals(global("49")),
                assertNextStdOutLineEquals(global("56")),
                assertNoMoreLineInStdOut()
            )
            .when(callKoanMethod("sevensOrEights", 6))
            .then(
                assertNoMoreLineInStdOut()
            )
            .when(callKoanMethod("sevensOrEights", 7))
            .then(
                assertNextStdOutLineEquals(global("7")),
                assertNoMoreLineInStdOut()
            )
    );
}
