package service.validator.impl;

import service.validator.AbstractValidator;

public class YearValidatorImpl extends AbstractValidator {
    private static final String YEAR_REGEX = "^[0-9]{4}$";

    @Override
    protected String getRegex() {
        return YEAR_REGEX;
    }
}
