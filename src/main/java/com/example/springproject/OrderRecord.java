package com.example.springproject;

public record OrderRecord(
        String customerName,
        String productName,
        int quantity
) {
}
