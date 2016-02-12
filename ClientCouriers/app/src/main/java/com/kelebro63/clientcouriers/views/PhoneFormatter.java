package com.kelebro63.clientcouriers.views;

import android.text.Editable;
import android.text.TextWatcher;

import javax.inject.Inject;

/**
 * Created by dtx12 on 22.09.2015.
 */
public class PhoneFormatter implements TextWatcher {
    private boolean selfChange;
    private String originalNumber;

    @Inject
    public PhoneFormatter() {
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        if (selfChange)
            return;
        originalNumber = toNotFormattedPhoneNumber(s.toString());
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {

    }

    @Override
    public void afterTextChanged(Editable s) {
        if (selfChange)
            return;
        selfChange = true;
        String currentNumber = toNotFormattedPhoneNumber(s.toString());
        if (currentNumber.equals(originalNumber)) {
            currentNumber = currentNumber.substring(0, currentNumber.length() - 1);
        }
        s.clear();
        s.append(toFormattedPhoneNumber(currentNumber));
        selfChange = false;
    }

    private String toFormattedPhoneNumber(String notFormatted) {
        StringBuilder builder = new StringBuilder(notFormatted);
        int offset = 0;
        if (notFormatted.length() <= 1) {
            return "+7 ";
        }
        if (notFormatted.length() > 1) {
            builder.insert(1, " (");
            offset += 2;
        }
        if (notFormatted.length() > 3) {
            builder.insert(4 + offset, ") ");
            offset += 2;
        }
        if (notFormatted.length() > 6) {
            builder.insert(7 + offset, "-");
            offset += 1;
        }
        if (notFormatted.length() > 8) {
            builder.insert(9 + offset, "-");
        }
        builder.insert(0, "+");
        return builder.toString();
    }

    private String toNotFormattedPhoneNumber(String number) {
        return number.replaceAll("\\D", "");
    }
}
