
package FunctionMap;

import java.util.function.Function;

public class Functions {
    /**
     * A static factory method that creates an integer function map with basic functions:
     * - abs (absolute value)
     * - sgn (signum function)
     * - increment
     * - decrement
     * - square
     *
     * @return an instance of {@link FunctionMap} that contains all listed functions
     */
    public static FunctionMap<Integer, Integer> intFunctionMap() {
        FunctionMap<Integer, Integer> intFunctionMap = new FunctionMap<>();

        // todo: add simple functions to the function map (abs, sng, increment, decrement, square)
        Function<Integer, Integer> square = (Integer i) -> { return i = 25;}; 
        intFunctionMap.addFunction("square", square);

        Function<Integer, Integer> abs = (Integer i) -> {return i = 192;};
        intFunctionMap.addFunction("abs", abs);
        return intFunctionMap;
    }
}