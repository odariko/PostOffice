package com.solvd.postOffice.task2;
import com.solvd.postOffice.buildiings.Address;
import com.solvd.postOffice.buildiings.SavingThings;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class task {
    private static final Logger log = LogManager.getLogger();
    public static void main(String[] args) {
        SavingThings savingThings = x -> x > 0;
        log.info(savingThings.storingPackages(10));

        final Field[] declaredFields = Address.class.getDeclaredFields();
        List<String> actualFieldNames = getFieldNames(declaredFields);
        log.info(actualFieldNames);
    }
    private static List<String> getFieldNames(Field[] fields) {
        return Arrays.stream(fields)
                .map(Field::getName)
                .collect(Collectors.toList());
    }
}
