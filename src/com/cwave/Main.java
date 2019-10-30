package com.cwave;

public class Main {

    public static void main(String[] args) {

        String str = args[0]; // the device ID displayed by the app.
                             // "D3818BE2" it's the default value when run in AVD because the bt address is null
        int i = (a() + str).hashCode();
        int j = 53 / i;
        i = i / 4 * 113 + i * i + j;
        String wtf = String.format("%04X",
                new Object[] { Integer.valueOf(((i & 0xFFFF0000) >>> 16) + (i & 0xFFFF) & 0xFFFF) });

        System.out.println(wtf);
    }

    private static String a() { return "google.com"; }

    public static String b(Context c){
        return String.format("%08X", new Object[] { Integer.valueOf(("PREFIX-" + a(new Context())).hashCode()) });
    }

    private static String a(Context c) {
        String str = null;
        return str;
    }
}


