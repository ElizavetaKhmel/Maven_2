package ru.netology.javaqa.javaqamvn.workServices;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.javaqa.javaqamvn.calcWorkServices;

public class calcWorkTest {
    @ParameterizedTest
    @CsvSource ({
            "10000, 3000, 20000, 3",
            "100000, 60000, 150000, 2"
    })
    void countOfRelaxOrWork(int income, int expenses, int threshold, int expected) {
        calcWorkServices service = new calcWorkServices();

        int actual = service.calcWork (income,expenses,threshold);

        Assertions.assertEquals(expected, actual);
    }
    }


