package com.compare.numbers.service;

import com.compare.numbers.entity.ComparableNumbers;
import com.compare.numbers.entity.CompareResult;
import com.compare.numbers.entity.InputNumbersString;
import org.springframework.stereotype.Service;

@Service
public class MinNumberService implements CompareService{
    @Override
    public CompareResult compareNumber(InputNumbersString inputNumbersString) {
        return new CompareResult(0);
    }
}
