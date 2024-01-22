package dev.stockman.demo.ga;

import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
public class ToUpperCase {
    public String toUpper(String str) {
        Objects.requireNonNull(str);
        return str.toUpperCase();
    }
}
