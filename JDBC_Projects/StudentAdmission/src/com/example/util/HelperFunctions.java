package com.example.util;

import java.util.HashMap;
import java.util.Map;

public class HelperFunctions {
    private static Map<String, Integer> branchCount = new HashMap<>();
    static {
        branchCount.put("04", 1);
        branchCount.put("05", 1);
        branchCount.put("07", 1);
        branchCount.put("09", 1);
        branchCount.put("11", 1);
        branchCount.put("14", 1);
    }
    private long generatePRN(int yearOfAdmission, String branch) {
        String serial = getPaddedSerial(branch); // e.g., "001"
        String result = Integer.toString(yearOfAdmission) + getBranchCode(branch) + serial;
        return Long.parseLong(result);
    }

    private String getBranchCode(String branch) {
        String b = branch.toLowerCase();
        return switch (b) {
            case "computer" -> "04";
            case "electrical" -> "05";
            case "electronics" -> "07";
            case "mechanical" -> "09";
            case "chemical" -> "11";
            case "civil" -> "14";
            default -> "00";
        };
    }

    private String getPaddedSerial(String branch) {
        int counter = branchCount.get(getBranchCode(branch));
        String padded = String.format("%03d", counter); // "001", "010", etc.
        counter++;
        if (counter > 999) counter = 1;
        return padded;
    }

    private String generateEmail(String firstName, String lastName){
        return firstName.toLowerCase() + "." + lastName.toLowerCase() + "@devmadeeasy.com";
    }
}
