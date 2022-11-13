package lotto.inputNumber;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class InputNumber {

    public static List<Integer> createNumber() {
        return new ArrayList<>();
    }

    private static List<Integer> inputNumber() {
        String input = Console.readLine();
        validate(input);
        List<Integer> numbers = Arrays.stream(input.split(","))
                .map(s -> Integer.parseInt(s))
                .collect(Collectors.toList());
        return numbers;
    }

    private static void validate(String numbers) {
        // try catch
    }

    private static void printInputMessage() {
        System.out.println("당첨 번호를 입력해 주세요.");
    }
}