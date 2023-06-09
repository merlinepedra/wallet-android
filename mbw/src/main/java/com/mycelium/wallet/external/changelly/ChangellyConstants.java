package com.mycelium.wallet.external.changelly;


import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class ChangellyConstants {
    public static final float INACTIVE_ALPHA = 0.5f;
    public static final float ACTIVE_ALPHA = 1f;
    private static DecimalFormatSymbols otherSymbols = new DecimalFormatSymbols() {
        {
            setDecimalSeparator('.');
        }
    };
    public static DecimalFormat decimalFormat = new DecimalFormat("#.########", otherSymbols);
    public static final String DESTADDRESS = "DESTADDRESS";
    public static final String FROM_ADDRESS = "FROM_ADDRESS";
    public static final String FROM_AMOUNT = "from_amount";
    public static final String TO_AMOUNT = "to_amount";
    public static final String ABOUT = "≈ ";

    public static final String XRP = "xrp";
    public static final String XEM = "xem";
    public static final String PARTNER_ID_CHANGELLY = "changelly";
}
