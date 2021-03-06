package com.sda;

import org.apache.commons.lang3.StringUtils;

import java.util.stream.Stream;

//chcemy zeby pisalo do nas hello my friend, jesli name jest nullem lub puste
public class Writer {
    public String sayHello(String name) {
        String[] names = name != null ? name.split(",") : new String[1];
        String nameSection = names.length == 1 ? name : convertToMessage(names);
        String greeting = "Hello";

        if (StringUtils.isBlank(nameSection)) {
            nameSection = "my friend";
        }
        if (StringUtils.isAllUpperCase(name)) {
            greeting = StringUtils.upperCase(greeting);
        }
        String output = greeting + ", " + nameSection + "!";
        return isAllUpperCase(names) ? StringUtils.upperCase(output) : output;
    }

    private String convertToMessage(String[] names) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < names.length; i++) {
            stringBuilder.append(names[i]);
            if (i < names.length - 2) {
                stringBuilder.append(", ");
            } else if (i == names.length - 2) {
                stringBuilder.append(" and ");
            }
        }
        return stringBuilder.toString();
    }

    private boolean isAllUpperCase(String[] names) {
        return Stream.of(names)
                .allMatch(e -> StringUtils.isAllUpperCase(e));
    }

}


